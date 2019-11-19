package model.teste;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Alex
 */
public class Teste {
    public static void main(String[] args) throws SQLException {
        Connection conect = new ConnectionFactory().getConnection();
        
        System.out.println("connected!");
        conect.close();
    }
}
