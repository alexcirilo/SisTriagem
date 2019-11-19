package model.dao;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import model.bean.SisContato;
import model.bean.SisEndereco;
import model.bean.SisPessoa;

/**
 *
 * @author Alex
 */
public class PessoaDAO {
    private Connection con = null;
    
    public  PessoaDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(SisPessoa pessoa,SisEndereco endereco, SisContato contato){
        String sql = "INSERT INTO sis_endereco VALUES(?,?,?,?,?,?)";
                
                
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, endereco.getLogradouro());
            stmt.setString(2, endereco.getNumero());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getComplemento());
            stmt.setString(5, endereco.getEstado());
            stmt.setString(6, endereco.getPais());
            
            stmt.executeUpdate();
            
            String sql2= "INSERT INTO sis_contato VALUES(?,?,?,?)";
            
            stmt = con.prepareStatement(sql2);
            
            stmt.setString(7, contato.getTipoContato());
            stmt.setInt(8, contato.getDDD());
            stmt.setString(9, contato.getNumeroContato());
            stmt.setBoolean(10, true);
            
            
            stmt.executeUpdate();
            
            String sql3 = "INSERT INTO sis_pessoa VALUES(?,?,?,?,?,?)"
                    + "(select sp.nomePessoa,sp.CPF,sp.sexo,sp.dataNascimento,se.logradouro, se.numero, se.bairro, \n" +
"se.complemento, se.estado, se.pais from sis_endereco se inner join sis_pessoa sp on se.id = sp.endereco_id) and \n" +
"(select sp.nomePessoa,sp.CPF,sp.sexo,sp.dataNascimento, sc.tipoContato,\n" +
"sc.DDD,sc.numero \n" +
"from sis_contato sc inner join sis_pessoa sp on sc.id = sp.contato_id))";
            
            stmt = con.prepareStatement(sql3);
            stmt.setString(11, pessoa.getNomePessoa());
            stmt.setString(12, pessoa.getCpf());
            stmt.setString(13, pessoa.getSexo());
            stmt.setDate(14, pessoa.getDataNascimento());
            stmt.setInt(15, pessoa.getEndereco_id().getId());
            stmt.setInt(16, pessoa.getContato_id().getId());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
            return false;
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
        
        
    }
    
}
