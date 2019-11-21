package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alex
 */
public  class ConnectionFactory {
    public static final String url = "jdbc:mysql://127.0.0.1:4306/sistriagem";
    public static final String user = "root";
    public static final String password = "qwe123";
    
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            throw new RuntimeException("YOU SHALL NOT PASS!!",ex);
        }
    }
}
