package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public  class ConnectionFactory {
    public static final String url = "jdbc:mysql://127.0.0.1:4306/sisTriagem";
    public static final String user = "root";
    public static final String password = "qwe123";
    
    public Connection connection;
    public PreparedStatement stmt;
    public ResultSet rs;
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            throw new RuntimeException("YOU SHALL NOT PASS!!",ex);
        }
    }
    
    public void executaSQL(String sql){
        try {
            stmt = (PreparedStatement)connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro executaSQL\n"+ ex);
        }
        
    }
}
