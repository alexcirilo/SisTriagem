package model.dao;

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
    public void inserir() {
        SisPessoa pes = new SisPessoa();
        SisEndereco end = new SisEndereco();
        SisContato cont = new SisContato();
        PessoaDAO dao = new PessoaDAO();
        
        if(dao.save(pes, end, cont)){
            System.out.println("HEHEHE Thank You!");
        }else{
            fail("NOT ENOUGH SAVE, STRANGER!");
        }
        
    }
    
}
