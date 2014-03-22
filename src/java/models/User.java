/*
 * Vishwajeet Vatharkar

 */

package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Vishwajeet
 */
public class User extends Model
{
    String username;
    String password;

    public User() 
    {
    
    }

    public User(String username, String password) 
    {
        super();
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean validateUser() throws SQLException
    {
        String loginQuery = "SELECT * FROM user WHERE username=? AND password=?";
        
        PreparedStatement preparedStatementLogin = databaseConnection.prepareStatement(loginQuery);
        
        preparedStatementLogin.setString(1, username);
        preparedStatementLogin.setString(2, password);
        
        ResultSet loginResult = preparedStatementLogin.executeQuery();
        if(loginResult.next())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
