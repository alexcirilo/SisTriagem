package model.dao;


import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.SisContato;
import model.bean.SisEndereco;
import model.bean.SisPessoa;

public class PessoaDAO {

    private Connection connection;

    public PessoaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public boolean save(SisEndereco endereco, SisContato contato, SisPessoa pessoa) throws SQLException {
        
        String sql = "INSERT INTO sis_endereco VALUES (?,?,?,?,?,?,?)";
        String sql2= "insert  INTO sis_contato VALUES(?,?,?,?) ";
        String sql3= " insert into sis_pessoa values(?,?,?,?,?,?) ";
        PreparedStatement stmt = null ;
        try {
            stmt = connection.prepareStatement(sql);
            stmt = connection.prepareStatement(sql2);
            stmt = connection.prepareStatement(sql3);
            stmt.setString(1, endereco.getCep());
            stmt.setString(2, endereco.getLogradouro());
            stmt.setString(3, endereco.getNumero());
            stmt.setString(4, endereco.getBairro());
            stmt.setString(5, endereco.getComplemento());
            stmt.setString(6, endereco.getEstado());
            stmt.setString(7, endereco.getPais());
            
            stmt.setString(8, contato.getTipoContato());
            stmt.setInt(9, contato.getDDD());
            stmt.setString(10, contato.getNumeroContato());
            stmt.setBoolean(11, contato.isCtt_principal());
            stmt.setString(12, pessoa.getNomePessoa());
            
            stmt.setString(13, pessoa.getCpf());
            stmt.setString(14, pessoa.getSexo());
            stmt.setDate(15, (java.sql.Date.valueOf(pessoa.getDataNascimento().toString())));
            
            stmt.setInt(16, pessoa.getEndereco_id().getId());
            stmt.setInt(17, pessoa.getContato_id().getId());
            
            stmt.executeUpdate(sql);
            stmt.execute(sql2);
            stmt.executeUpdate(sql3);
            //stmt.execute(sql);
            
            //String sql2 = ;
            //stmt = connection.prepareStatement(sql2);
            
            
            //stmt.execute(sql3);
            
            return true;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
            //return false;
        }finally{
            connection.close();
            stmt.close();
        }
        
        
    }
}
