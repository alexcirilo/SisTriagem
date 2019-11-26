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
        end.setId(1);
        ctt.setId(1);
        
        pes.setNomePessoa("alex");
        pes.setCpf("017.069.382-17");
        pes.setSexo("Masc");
        pes.setDataNascimento("1993-07-10");
        pes.setEndereco_id(end);
        pes.setContato_id(ctt);
        
       
    }
    
}
