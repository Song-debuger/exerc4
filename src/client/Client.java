package client;

import java.util.Scanner;

import webservice.list.*;


/**
 * WebService client
 *
 * @author macforsong
 * @version 1.0
 */
public class Client {

    private static Scanner scanner = new Scanner(System.in);            //define input stream
    private static Service_List services = new Service_List();          //initiate service list
    private static List service_list = services.getListPort();
    private static final String PARAMETER_WRONG = "args was wrong";    //define parameter error info

    /**
     * service define when to call the method
     *
     * @param commands
     */
    private static void service(String[] commands) {

        if (commands[0].equals("register")) {
            do_Register(commands);
        } else if (commands[0].equals("add")) {
            do_Add(commands);
        } else if (commands[0].equals("query")) {
            do_Query(commands);
        } else if (commands[0].equals("delete")) {
            do_Delete(commands);
        } else if (commands[0].equals("clear")) {
            do_Clear(commands);
        } else if (commands[0].equals("help")) {
            help();
        } else if (commands[0].equals("quit")) {
            System.exit(0);
        } else {
            System.out.println(PARAMETER_WRONG);
        }
    }

    /**
     * print the help info
     */
    private static void helpMenu() {
        System.out.println("HELP MENU:");
        System.out.println("\t FormatTime : YYYY-MM-DD-HH:mm");
        System.out.println("\t 1.register");
        System.out.println("\t\t  <username> <password>");
        System.out.println("\t 2.add");
        System.out.println("\t\t  <username> <password> <start> <end> <tag>");
        System.out.println("\t 3.query");
        System.out.println("\t\t  <username> <password> <start> <end>");
        System.out.println("\t 4.delete");
        System.out.println("\t\t  <username> <password> <ID>");
        System.out.println("\t 5.clear");
        System.out.println("\t\t  <username> <password>");
        System.out.println("\t 6.help");
        System.out.println("\t\t  no args");
        System.out.println("\t 7.quit");
        System.out.println("\t\t  no args");
        System.out.println(" Example: register sunqixing1 123456");
        System.out.println(">>");

    }

    /**
     * implement register command
     *
     * @param commands
     */
    private static void do_Register(String[] commands) {

        /**
         * the number of parameters must be 3
         */
        if (commands.length != 3) {
            System.out.println(PARAMETER_WRONG);
        } else {
            System.out.println(service_list.register(commands[1], commands[2]));
        }
    }

    /**
     * implement add command
     *
     * @param commands
     */
    private static void do_Add(String[] commands) {
        /**
         * the number of parameters must be 6
         */
        if (commands.length != 6) {
            System.out.println(PARAMETER_WRONG);
        } else {
            System.out.println(service_list.add(commands[1], commands[2], commands[3], commands[4], commands[5]));
        }
    }

    /**
     * implement query command
     *
     * @param commands
     */
    private static void do_Query(String[] commands) {

        /**
         * the number of parameters must be 5
         */
        if (commands.length != 5) {
            System.out.println(PARAMETER_WRONG);
        } else {
            System.out.println(service_list.query(commands[1], commands[2], commands[3], commands[4]));
        }
    }

    /**
     * implement delete command
     *
     * @param commands
     */
    private static void do_Delete(String[] commands) {
        /**
         * the number of parameters must be 4
         */
        if (commands.length != 4) {
            System.out.println(PARAMETER_WRONG);
        } else {
            System.out.println(service_list.delete(commands[1], commands[2], Integer.parseInt(commands[3])));
        }
    }

    /**
     * implement clear command
     *
     * @param commands
     */
    private static void do_Clear(String[] commands) {
        /**
         * the number of parameters must be 3
         */
        if (commands.length != 3) {
            System.out.println(PARAMETER_WRONG);
        } else {
            System.out.println(service_list.clear(commands[1], commands[2]));
        }
    }

    /**
     * print the help info during the command
     */
    private static void help() {
        System.out.println("HELP MENU:");
        System.out.println("\t FormatTime : YYYY-MM-DD-HH:mm");             //the data and time input format
        System.out.println("\t 1.register");
        System.out.println("\t\t  <username> <password>");
        System.out.println("\t 2.add");
        System.out.println("\t\t  <username> <password> <start> <end> <tag>");
        System.out.println("\t 3.query");
        System.out.println("\t\t  <username> <password> <start> <end>");
        System.out.println("\t 4.delete");
        System.out.println("\t\t  <username> <password> <ID>");
        System.out.println("\t 5.clear");
        System.out.println("\t\t  <username> <password>");
        System.out.println("\t 6.help");
        System.out.println("\t\t  no args");
        System.out.println("\t 7.quit");
        System.out.println("\t\t  no args");
        System.out.println("\t\t Example: register sunqixing1 123456");             //example inputs

    }

    /**
     * call the service to get commands and handle them
     *
     * @param args
     */
    public static void main(String[] args) {
        helpMenu();

        while (true) {
            String line = scanner.nextLine();                       //get the commands
            String[] commands = line.split(" ");                  //split the commands
            service(commands);                                    //call the service to handle it
            System.out.println(">>");
        }
    }
}
