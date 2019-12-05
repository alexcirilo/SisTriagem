package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.bean.SisMedico;

public class MedicoDAO {
    //private final Connection connection;
    //PreparedStatement stmt;
    ResultSet rs;
    ConnectionFactory con = new ConnectionFactory();
    
    
    public void salvarMedico(SisMedico med){
        try {
            connection.ConnectionFactory.getConnection();
        
            String sql = "insert into sis_medico(nomeMedico,especialidade,CRM,ufCRM) VALUES (?,?,?,?)";
            PreparedStatement stmt = connection.ConnectionFactory.getConnection().prepareStatement(sql);
            stmt.setString(1, med.getNome());
            stmt.setString(2, med.getEspecialidade());
            stmt.setInt(3, med.getCRM());
            stmt.setString(4, med.getUF_CRM());
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    
    public SisMedico buscaMedico(SisMedico med){
        
        connection.ConnectionFactory.getConnection();
        
        String sql = "select nomemedico from sis_medico where nomeMedico like ? ";
        try {
            PreparedStatement stmt = connection.ConnectionFactory.getConnection().prepareStatement(sql);
            //passando o conteúdo da caixa de pesquisa para o ??
            // atenção ao "% - continuação da string sql
            
            stmt.setString(1, "'%"+med.getPesquisa()+ "%'");
            rs = stmt.executeQuery();
            //jTableMedico.setModel(DbUtils.resultSetToTableModel(rs));
            while(rs.next()){
                med.setId(rs.getInt("id"));
                med.setNome(rs.getString("nomeMedico"));
                
                med.setEspecialidade(rs.getString("especialidade"));
                med.setCRM(rs.getInt("CRM"));
                med.setUF_CRM(rs.getString("ufCRM"));
            }
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }      
        return med;
    }
}
