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

    public void save(SisEndereco endereco, SisContato contato, SisPessoa pessoa) throws SQLException {
        
        String sql = "INSERT INTO sis_endereco(cep, logradouro, numero, bairro, complemento, estado, pais) VALUES (?,?,?,?,?,?)";
        String sql2= "insert  INTO sis_contato(tipoContato,DDD,numero,principal) VALUES(?,?,?,?) ";
        String sql3= " insert into sis_pessoa(nomePessoa,cpf,sexo,dataNascimento,endereco_id,contato_id) values(?,?,?,?,?,?) "
                + "(select (ifnull(id,null)) as endereco_id from sis_endereco) "
                + "(select (ifnull(id,null)) as contato_id from sis_contato)) ";
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
            stmt.setInt(16, pessoa.getEndereco_id());
            stmt.setInt(17, pessoa.getContato_id());
            
            stmt.execute(sql);
            stmt.execute(sql2);
            stmt.execute(sql3);
            //stmt.execute();
            
            //String sql2 = ;
            //stmt = connection.prepareStatement(sql2);
            
            
            //stmt.execute(sql3);
            
            //return true;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
            //return false;
        }finally{
            connection.close();
            stmt.close();
        }
    }
}
