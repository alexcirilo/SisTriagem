package model.dao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.SisContato;
import model.bean.SisEndereco;
import model.bean.SisPessoa;

public class PessoaDAO {
    private final Connection connection;
    PreparedStatement stmt;
    ResultSet rs;
    
    public PessoaDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void save(SisEndereco endereco, SisContato contato, SisPessoa pessoa) throws SQLException {
        try {
            String sql = ("insert into sis_pessoa (nomePessoa,CPF,sexo,dataNascimento,endereco_id, contato_id)"
                    + "values(?,?,?,?,?,?)");
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, pessoa.getNomePessoa());
            stmt.setString(2, pessoa.getCpf());
            stmt.setString(3, pessoa.getSexo());
            stmt.setString(4, pessoa.getDataNascimento());
            stmt.setInt(5, pessoa.getEndereco_id().getId());
            stmt.setInt(6, pessoa.getContato_id().getId());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}