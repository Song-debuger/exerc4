package service;

import java.io.Serializable;
import java.util.Date;

/**
 * todoItems class
 *
 * @author macforsong
 */
public class Item implements Serializable {

    private Date start_time;              //the start time of the item
    private Date end_time;                //the end time of the item
    private int item_id;                  //the id of the items
    private String username;              //who own the item 
    private String description;           //the description of the item

    /**
     * initiate the item
     *
     * @param item_id
     * @param username
     * @param description
     * @param start_time
     * @param end_time
     */
    public Item(int item_id, String username, String description, Date start_time, Date end_time) {
        super();
        this.item_id = item_id;
        this.username = username;
        this.description = description;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    /**
     * get the item id
     *
     * @return
     */
    public int getItemID() {
        return item_id;
    }

    public void setItemID(int ID) {
        this.item_id = ID;
    }

    /**
     * get the owner of the item
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * set the owner of the item
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * get the description of the item
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set the description of the item
     *
     * @param tag
     */
    public void setDescription(String tag) {
        this.description = tag;
    }

    /**
     * get the data and time(end) of the item
     *
     * @return
     */
    public Date getEnd_time() {
        return end_time;
    }

    /**
     * set the data and time(end) of the item
     *
     * @return
     */
    public void setEnd_time(Date end) {
        this.end_time = end;
    }

    /**
     * get the data and time(start) of the item
     *
     * @return
     */
    public Date getStart_time() {
        return start_time;
    }

    /**
     * set the data and time(start) of the item
     *
     * @return
     */
    public void setStart_time(Date start) {
        this.start_time = start;
    }


    /**
     * define the item object equal method
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Item)) return false;

        Item todoItem = (Item) object;

        //attributes all the same, then object equals
        if (getItemID() != todoItem.getItemID())
            return false;
        if (getDescription() != null ? !getDescription().equals(todoItem.getDescription()) :
                todoItem.getDescription() != null)
            return false;
        if (getEnd_time() != null ? !getEnd_time().equals(todoItem.getEnd_time()) :
                todoItem.getEnd_time() != null)
            return false;
        if (getUsername() != null ? !getUsername().equals(todoItem.getUsername()) :
                todoItem.getUsername() != null)
            return false;
        return getStart_time() != null ? getStart_time().equals(todoItem.getStart_time()) :
                todoItem.getStart_time() == null;
    }
}
