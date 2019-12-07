package model.dao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.bean.SisContato;
import model.bean.SisEndereco;
import model.bean.SisPaciente;

public class PacienteDAO {
    private final Connection connection;
    PreparedStatement stmt;
    ResultSet rs;
    
    public PacienteDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void save(SisEndereco endereco, SisContato contato, SisPaciente paciente) throws SQLException {
        int varEndId= 0, varCttId = 0;
        
        //EnderecoEContatoDAO end = new EnderecoEContatoDAO();
        
        try {
            String sql = "insert into sis_endereco (cep,logradouro,numero,bairro,complemento,estado,pais)values(?,?,?,?,?,?,?)";
             stmt = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, endereco.getCep());
            stmt.setString(2, endereco.getLogradouro());
            stmt.setString(3, endereco.getNumero());
            stmt.setString(4, endereco.getBairro());
            stmt.setString(5, endereco.getComplemento());
            stmt.setString(6,endereco.getEstado());
            stmt.setString(7, endereco.getPais());
            
            stmt.executeUpdate();
            
            ResultSet rst = stmt.getGeneratedKeys();
            if(rst.next()){
                varEndId = rst.getInt(1);
            } 
             
            System.out.println(varEndId);
            } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        try {
            String sql = "Insert into sis_contato(tipoContato,DDD,numero,principal) values (?,?,?,?)";
            stmt = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, contato.getTipoContato());
            stmt.setInt(2, contato.getDDD());
            stmt.setString(3, contato.getNumeroContato());
            stmt.setBoolean(4, true);
            
            stmt.executeUpdate();
            
            rs = stmt.getGeneratedKeys();
            if(rs.next()){
                varCttId = rs.getInt(1);
            }
             
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        try {
            //varEndId = end.salvarEndereco(endereco);
            //varCttId = end.salvarContato(contato);
            String sql = ("insert into sis_paciente (nomePessoa,CPF,sexo,dataNascimento,curso,endereco_id, contato_id)"
                    + "values(?,?,?,?,?,?)");
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, paciente.getNomePaciente());
            stmt.setString(2, paciente.getCpf());
            stmt.setString(3, paciente.getSexo());
            stmt.setString(4, paciente.getDataNascimento());
            stmt.setInt(5, varEndId);
            stmt.setInt(6, varCttId);
            
            stmt.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}