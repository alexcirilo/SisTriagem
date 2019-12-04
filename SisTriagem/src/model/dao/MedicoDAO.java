package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import model.bean.SisMedico;

public class MedicoDAO {
    private final Connection connection;
    PreparedStatement stmt;
    ResultSet rs;
    ConnectionFactory con = new ConnectionFactory();
    public MedicoDAO(){
        this.connection = ConnectionFactory.getConnection();
    }
    
    public void salvarMedico(SisMedico med){
        try {
            String sql = "insert into sis_medico(nomeMedico,especialidade,CRM,ufCRM) VALUES (?,?,?,?)";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, med.getNome());
            stmt.setString(2, med.getEspecialidade());
            stmt.setInt(3, med.getCRM());
            stmt.setString(4, med.getUF_CRM());
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public SisMedico buscaMedico(SisMedico mod){
        
        try {
            String sql = "SELECT * FROM sis_medico where nomeMedico like '%"+mod.getPesquisa()+"%'";
            stmt.execute();
            con.rs.first();
            mod.setId(con.rs.getInt("id"));
            mod.setNome(con.rs.getString("nomeMedico"));
            mod.setEspecialidade(con.rs.getString("especialidade"));
            mod.setCRM(con.rs.getInt("CRM"));
            mod.setUF_CRM(con.rs.getString("ufCRM"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao consultar médico"+ ex);
        }
        
        return mod;
        
    }
}
