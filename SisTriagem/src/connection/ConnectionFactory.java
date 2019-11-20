package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://localhost:4306/sisTriagem";
    private static final String USER = "root";
    private static final String PASS = "qwe123";

    public static Connection getConnection() {
        
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("YOU SHALL NOT PASS!!",ex);
        }
    }
}
