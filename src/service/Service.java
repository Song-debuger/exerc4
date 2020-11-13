package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

/**
 * the web service interface
 */
@WebService(name = "List", portName = "ListPort", targetNamespace = "http://www.webservice.list", serviceName = "ListService")

/**
 *
 * @author macforsong
 * @version 1.0
 */
public class Service {

    private Vector<User> users;
    private Vector<Item> todoItems;
    private static int item_id = 0;

    private static final String CRLF = "\r\n";
    private static final String TAB_FORMAT = "\t";

    private SimpleDateFormat dataTimeFormat = new SimpleDateFormat("YYYY-MM-DD-HH:mm");

    /**
     * initiate the service
     */
    public Service() {
        users = new Vector<>();
        todoItems = new Vector<>();
    }

    /**
     * if user exists
     *
     * @param username user name
     * @return if correct
     */
    private boolean isExist(String username) {
        for (User user : users) {
            if (user.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * if the user is correct
     *
     * @param username user name
     * @param password user password
     * @return if correct
     */
    private boolean userCorrect(String username, String password) {
        User currentUser = new User(username, password);
        for (User user : users) {
            if (currentUser.equals(user)) {
                return true;
            }
        }
        return false;
    }

    /**
     * if the date and time correct
     *
     * @param start start time
     * @param end   end time
     * @return if correct
     */
    private boolean isForamt(Date start, Date end) {
        return start.after(end);
    }

    /**
     * if the data is during the end and start time
     *
     * @param date  input time
     * @param start start time
     * @param end   end time
     * @return if during
     */
    private boolean isDuringTime(Date date, Date start, Date end) {
        boolean isDuring = (date.after(start) && date.before(end))
                || date.equals(start) || date.equals(end);
        return isDuring;
    }

    /**
     * implement register method
     *
     * @param username user name
     * @param password user password
     * @return register result info
     */
    @WebMethod
    public String register(String username, String password) {
        /**
         * if the user exists
         */
        if (isExist(username)) {
//            System.err.println("User has been registered, try again!");
            return "User has been registered, try again!";
        }

        //new a user
        User user = new User(username, password);

        //add to list
        users.add(user);

        //print the result info
        System.out.println(user.toString());

        return "register successfully!";
    }

    /**
     * query the to do item
     *
     * @param username   user name
     * @param password   user password
     * @param start_item item start time
     * @param end_time   item end time
     * @return the query result info
     */
    @WebMethod
    public String query(String username, String password, String start_item, String end_time) {

        Date startDate;
        Date endDate;

        /**
         * format the data and time
         */
        try {
            startDate = dataTimeFormat.parse(start_item);
            endDate = dataTimeFormat.parse(end_time);
            if (isForamt(startDate, endDate)) {
                System.err.println("time confict!");
                return "time confict!";
            }
        } catch (ParseException e) {
            e.printStackTrace();
            System.err.println("data in wrong format, Use the following format：YYYY-MM-DD-HH:mm");
            return "data in wrong format, Use the following format：YYYY-MM-DD-HH:mm";
        }

        /**
         * to see if the user is correct
         */
        if (!userCorrect(username, password)) {
            System.err.println("username or password was wrong");
            return "username or password was wrong";
        }

        /**
         * to do query
         */
        String queryInfo = "";

        /**
         * //to match all the items
         */
        for (Item todoItem : todoItems) {
            if (todoItem.getUsername().equals(username) && isDuringTime(todoItem.getStart_time(), startDate, endDate)
                    && isDuringTime(todoItem.getEnd_time(), startDate, endDate)) {         //item match absolutely
                queryInfo += "ID: " + todoItem.getItemID() + TAB_FORMAT;
                queryInfo += "StartTime: " + todoItem.getStart_time() + TAB_FORMAT;
                queryInfo += "EndTime: " + todoItem.getEnd_time() + TAB_FORMAT;
                queryInfo += "Description: " + todoItem.getDescription() + TAB_FORMAT;
                queryInfo += CRLF;
            }
        }
        return queryInfo;
    }

    /**
     * add to do item
     *
     * @param username    user name
     * @param password    user password
     * @param start_time  start time
     * @param end_time    end time
     * @param description description
     * @return add item result info
     */
    @WebMethod
    public String add(String username, String password, String start_time, String end_time, String description) {

        Date startDate;              //define the start date
        Date endDate;                //define the end date

        /**
         * format the data and time
         */
        try {
            startDate = dataTimeFormat.parse(start_time);
            endDate = dataTimeFormat.parse(end_time);
            if (isForamt(startDate, endDate)) {
                System.err.println("time conflict");
                return "time conflict";
            }
        } catch (ParseException e) {
            e.printStackTrace();
            System.err.println("data in wrong format, Use the following format：YYYY-MM-DD-HH:mm");
            return "data in wrong format, Use the following format：YYYY-MM-DD-HH:mm";
        }

        /**
         * to see if the user is correct
         */
        if (!userCorrect(username, password)) {
            System.err.println("username or password was wrong");
            return "username or password was wrong";
        }

        Item todoItem = new Item(item_id++, username, description, startDate, endDate);
        todoItems.add(todoItem);
        System.out.println("add successfully");
        return "add successfully";
    }

    /**
     * clear all the items
     *
     * @param username user name
     * @param password user password
     * @return the result info of clear
     */
    @WebMethod
    public String clear(String username, String password) {

        /*
         * to see if the user is correct
         */
        if (!userCorrect(username, password)) {
            System.err.println("username or password was wrong");
            return "username or password was wrong";
        }

        boolean flag = false;
        Iterator<Item> iterator = todoItems.iterator();
        while (iterator.hasNext()) {
            Item todoItem = (Item) iterator.next();
            if (todoItem.getUsername().equals(username)) {
                iterator.remove();
                flag = true;
            }
        }
        /**
         * to see if cleared
         */
        if (flag) {
            System.out.println("clear successfully");
            return "clear successfully";
        } else {
            System.out.println("todo list was empty");
            return "todu list was empty";
        }
    }


    /**
     * delete the to do item
     *
     * @param username user name
     * @param password user password
     * @param ID       id of the item
     * @return the result info of delete command
     */
    @WebMethod
    public String delete(String username, String password, int ID) {

        /**
         * to see if the user is correct
         */
        if (!userCorrect(username, password)) {
            System.err.println("username or password was wrong");
            return "username or password was wrong";
        }

        /**
         * to do delete
         */
        for (Item todoItem : todoItems) {
            if (todoItem.getUsername().equals(username) && todoItem.getItemID() == ID) {           //to match the item
                todoItems.remove(todoItem);                           //remove the item
                System.out.println("delete successfully");
                return "delete successfully";
            }
        }
        System.err.println("todo event was not exist");
        return "todo event was not exist";
    }


    /**
     * run the service
     *
     * @param args
     */
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8001/webservice/todoList", new Service());
        System.out.println("service already start at 127.0.0.1:8001");
    }
}








