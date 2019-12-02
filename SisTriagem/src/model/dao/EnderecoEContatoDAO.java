package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.bean.SisContato;
import model.bean.SisEndereco;

/**
 *
 * @author Alex
 */
public class EnderecoEContatoDAO {
    private final Connection connection;
    PreparedStatement stmt;
    ResultSet rs = null;
    public EnderecoEContatoDAO() {
        this.connection = ConnectionFactory.getConnection();
}
    
    public int salvarEndereco(SisEndereco end){
        int varEndId = 0;
        try {
             stmt = connection.prepareStatement("insert into sis_endereco (cep,logradouro,numero,bairro,complemento,estado,pais)values(?,?,?,?,?,?,?)");
            stmt.setString(1, end.getCep());
            stmt.setString(2, end.getLogradouro());
            stmt.setString(3, end.getNumero());
            stmt.setString(4, end.getBairro());
            stmt.setString(5, end.getComplemento());
            stmt.setString(6,end.getEstado());
            stmt.setString(7, end.getPais());
            
            stmt.execute();
            
            
            ResultSet rst = stmt.getGeneratedKeys();
            if(rst.next()){
                varEndId = rst.getInt(1);
            }
             
            System.out.println(varEndId);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                if(rs != null)
                    rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
       return varEndId;
    }
    public int salvarContato (SisContato ctt){
        
        int varCttId = 0;
        try {
            String sql = "Insert into sis_contato(tipoContato,DDD,numero,principal) values (?,?,?,?)";
            stmt = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, ctt.getTipoContato());
            stmt.setInt(2, ctt.getDDD());
            stmt.setString(3, ctt.getNumeroContato());
            stmt.setBoolean(4, true);
            
            int linhasAfetadas = stmt.executeUpdate();
            if(linhasAfetadas == 1){
                throw new SQLException("Linhas não inseridas");
            }
            
            rs = stmt.getGeneratedKeys();
            if(rs.next()){
                varCttId = rs.getInt(1);
            }
             
            //stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                if(rs != null)
                    rs.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
       return varCttId;
    }
    
    public void deletarEndereco(SisEndereco end){
        PreparedStatement stmt;
        try {
            stmt = ConnectionFactory.getConnection().prepareStatement("delete from sis_endereco where id =?");
            stmt.setInt(1, end.getId());
            stmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir"+ex);
        }
    }
}
 

