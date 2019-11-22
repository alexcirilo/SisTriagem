/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import model.bean.SisContato;
import model.bean.SisEndereco;
import model.bean.SisPessoa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class PessoaDAOTest {
    
    public PessoaDAOTest() {
    }

    @Test
    public void testSomeMethod() throws SQLException {
        SisPessoa pes = new SisPessoa();
        SisEndereco end = new SisEndereco();
        SisContato ctt = new SisContato();
        
        PessoaDAO dao = new PessoaDAO();
        
        //dao.save(end, ctt, pes);
        
    }
    
}
