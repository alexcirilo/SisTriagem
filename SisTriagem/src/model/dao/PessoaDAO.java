package model.dao;


import connection.ConnectionFactory;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.SisContato;
import model.bean.SisEndereco;
import model.bean.SisPessoa;

public class PessoaDAO {
    int end_id, ctt_id;
    private final Connection connection;
    PreparedStatement stmt;
    ResultSet rs;
    
    SisPessoa pessoa = new SisPessoa();

    public PessoaDAO() {
        this.connection = ConnectionFactory.getConnection();
        
    }

    public void save(SisEndereco endereco, SisContato contato, SisPessoa pessoa) throws SQLException {
        
        salvarEndereco(endereco);
        salvarContato(contato);
        
        buscarEndereco(end_id);
        buscarContato(ctt_id);
        
        try {
            stmt = connection.prepareStatement("insert into sis_pessoa (nomePessoa,CPF,sexo,dataNascimento,endereco_id,contato_id) values(?,?,?,?,?,?)");
            
            stmt.setString(1, pessoa.getNomePessoa());
            stmt.setString(2, pessoa.getCpf());
            stmt.setString(3, pessoa.getSexo());
            stmt.setString(4, pessoa.getDataNascimento());
            stmt.setInt(5, end_id);
            stmt.setInt(6, ctt_id);
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void salvarEndereco(SisEndereco end){
        try {
             stmt = connection.prepareStatement("insert into sis_endereco (cep,logradouro,numero,bairro,complemento,estado,pais)"
                    + "values(?,?,?,?,?,?,?) ");
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
    }
    
    public int buscarEndereco(int end){
        try {
            
            connection.prepareStatement("Select * from sis_endereco order by id desc limit 1 ");
            
            //rs.first();
            //end_id = rs.getInt("id");
            stmt.execute();
            //end_id = rs.getInt("id");
            
             
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return end_id;
    }
    
    public void salvarContato (SisContato ctt){
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
    }
    
    public void buscarContato(int ctt){
        try {
            connection.prepareStatement("Select last_insert_id() from sis_contato ordr by id desc limit 1");
            
            //rs.first();
            
                //ctt_id = rs.getInt("id");
                stmt.execute();
                
            //}
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
