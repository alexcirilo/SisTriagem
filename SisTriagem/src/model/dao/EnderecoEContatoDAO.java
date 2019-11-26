package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.SisContato;
import model.bean.SisEndereco;

/**
 *
 * @author Alex
 */
public class EnderecoEContatoDAO {
    private final Connection connection;
    PreparedStatement stmt;
    ResultSet rs;
    public EnderecoEContatoDAO() {
        this.connection = ConnectionFactory.getConnection();
}
    
    public boolean salvarEndereco(SisEndereco end){
        try {
             stmt = connection.prepareStatement("insert into sis_endereco (cep,logradouro,numero,bairro,complemento,estado,pais)values(?,?,?,?,?,?,?)");
            stmt.setString(1, end.getCep());
            stmt.setString(2, end.getLogradouro());
            stmt.setString(3, end.getNumero());
            stmt.setString(4, end.getBairro());
            stmt.setString(5, end.getComplemento());
            stmt.setString(6,end.getEstado());
            stmt.setString(7, end.getPais());
            
            stmt.executeUpdate();
            //stmt.close();
        } catch (SQLException ex) {
            throw  new RuntimeException(ex);
        }
        return true;
    }
    public boolean salvarContato (SisContato ctt){
        
        try {
            stmt = connection.prepareStatement("Insert into sis_contato(tipoContato,DDD,numero,principal) values (?,?,?,?)");
            stmt.setString(1, ctt.getTipoContato());
            stmt.setInt(2, ctt.getDDD());
            stmt.setString(3, ctt.getNumeroContato());
            stmt.setBoolean(4, true);
            
            stmt.execute();
            //stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return true;
    }
    
    public boolean deletarEndereco(){
        return true;
        
    }
}
 

