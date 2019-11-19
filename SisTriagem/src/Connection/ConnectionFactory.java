package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alex
 */
public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:4306/sisTriagem";
    private static final String USER = "root";
    private static final String PASS = "qwe123";
    
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException exc) {
           throw new RuntimeException("NOT ENOUGH CASH!! Stranger", exc);
        }
        
    }
    
    public static void closeConnection(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("FAIL!! "+ex);
            }
        }
    }
    public static void closeConnection(Connection con, PreparedStatement stmt){
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        closeConnection(con);
    }
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        closeConnection(con,stmt);
    }
}
