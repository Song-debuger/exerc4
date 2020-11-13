package service;

import java.io.Serializable;

/**
 * user class
 * @author k
 * @version 1.0
 */
public class User implements Serializable {
    private String username;
    private String password;

    /**
     * initiate the user
     * @param username user name
     * @param password user password
     */
    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }
    
    /**
     * get user password
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set user password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get user name
     * @return
     */
    public String getUserName() {
        return username;
    }

    /**
     * set user name
     * @param username
     */
    public void setUserName(String username) {
        this.username = username;
    }



    /**
     * define the object equals
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof User)) return false;
        User user = (User) object;
        if (!username.equals(user.username)) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public String toString() {
        return "[name: " + username + ", password:" + password + "]";
    }
}
