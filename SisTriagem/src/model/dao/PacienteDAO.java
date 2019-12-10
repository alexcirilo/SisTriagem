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
    public void save(SisEndereco endereco, SisContato contato, SisPaciente paciente) {
         int varEndId= 0, varCttId = 0;
        
        try {
            String sql = "insert into sis_endereco (cep,logradouro,numero,bairro,complemento,estado)values(?,?,?,?,?,?)";
             stmt = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, endereco.getCep());
            stmt.setString(2, endereco.getLogradouro());
            stmt.setString(3, endereco.getNumero());
            stmt.setString(4, endereco.getBairro());
            stmt.setString(5, endereco.getComplemento());
            stmt.setString(6,endereco.getEstado());
            
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
            String sql = "Insert into sis_contato(tipoContato,DDD,numero) values (?,?,?)";
            stmt = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, contato.getTipoContato());
            stmt.setInt(2, contato.getDDD());
            stmt.setString(3, contato.getNumeroContato());
            
            stmt.executeUpdate();
            
            rs = stmt.getGeneratedKeys();
            if(rs.next()){
                varCttId = rs.getInt(1);
            }
             
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        try {
            
            String sql = ("insert into sis_paciente (nomePessoa,CPF,sexo,dataNascimento,curso,endereco_id, contato_id)"
                    + "values(?,?,?,?,?,?,?)");
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, paciente.getNomePaciente());
            stmt.setString(2, paciente.getCpf());
            stmt.setString(3, paciente.getSexo());
            stmt.setString(4, paciente.getDataNascimento());
            stmt.setString(5,paciente.getCurso());
            stmt.setInt(6, varEndId);
            stmt.setInt(7, varCttId);
            
            stmt.execute();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }
}
