package model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.SisUsuario;

/**
 *
 * @author Alex
 */
public class UsuarioDAO {
    public UsuarioDAO(){
        connection.ConnectionFactory.getConnection();
    }
    
    public void salvarUsuario(SisUsuario user){
        if(!user.equals(user.getNomeUsuario().isEmpty())|| !user.equals(user.getLogin().isEmpty()) || !user.equals(user.getSenha().isEmpty())){
        String sql = "insert into sis_usuario (nomeusuario,login,senha) values (?,?,?)";
        
        try {
            PreparedStatement stmt = connection.ConnectionFactory.getConnection().prepareStatement(sql);
            stmt.setString(1, user.getNomeUsuario());
            stmt.setString(2, user.getLogin());
            stmt.setString(3, user.getSenha());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário Salvo com Sucesso!!");
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        }else {
            JOptionPane.showMessageDialog(null, "Preencha os Campos para Salvar!");
        }
    }
}
