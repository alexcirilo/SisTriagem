package model.dao;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.SisContato;
import model.bean.SisEndereco;
import model.bean.SisPessoa;

public class PessoaDAO {

    private Connection con = null;

    public PessoaDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(SisEndereco endereco, SisContato contato, SisPessoa pessoa) throws SQLException {
        
        String sql = "INSERT INTO sis_endereco VALUES(?,?,?,?,?,?)";
        PreparedStatement stmt = null ;
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, endereco.getLogradouro());
            stmt.setString(2, endereco.getNumero());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getComplemento());
            stmt.setString(5, endereco.getEstado());
            stmt.setString(6, endereco.getPais());
            
            stmt.executeUpdate();
            
            String sql2 = "INSERT INTO sis_contato VALUES(?,?,?,?)";
            stmt = con.prepareStatement(sql2);
            
            stmt.setString(7, contato.getTipoContato());
            stmt.setInt(8, contato.getDDD());
            stmt.setString(9, contato.getNumeroContato());
            //if(pessoa)
            stmt.setBoolean(10, true);
                    
            return true;
        } catch (SQLException ex) {
            System.err.println("NOT ENOUGH SAVE, STRANGER!!"+ex);
            return false;
        }finally{
            con.close();
            stmt.close();
        }
        
        
    }
}
