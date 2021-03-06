package pl.polsl.Szymon.Bartnik.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Model class accumulating user's name and his password.
 * 
 * @author Szymon Bartnik (grupa 2)
 * @version 1.0
 */
public class User {
    
    /** User id identifying the user */
    private int id;
    /** User name identifying the user */
    private final String userName;
    /** Password credential used for logging in purposes */
    private final String password;
    
    /**
     * Constructor setting userName and password for
     * creating instance
     * 
     * @param userId id of the user
     * @param userName userName of the user
     * @param password password of the user
     */
    public User(int userId, String userName, String password){
        
        this.id   = userId;
        this.userName = userName;
        this.password = password;
    }
    
    /**
     * Constructor setting userName and password for
     * creating instance
     * 
     * @param userName userName of the user
     * @param password password of the user
     */
    public User(String userName, String password){
        
        this.userName = userName;
        this.password = password;
    }

    /**
     * Initializes current instance of User class by passed result set.
     * 
     * @param rs result set from which reading init values for current instance of User class.
     * @throws SQLException when problems during reading from sql result set occured.
     */
    public User(ResultSet rs) 
            throws SQLException {
        
        id = rs.getInt("id");
        userName = rs.getString("username");
        password = rs.getString("password");
    }

    /**
     * Gets id
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Gets user name
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Gets password
     * @return the password
     */
    public String getPassword() {
        return password;
    }
}
