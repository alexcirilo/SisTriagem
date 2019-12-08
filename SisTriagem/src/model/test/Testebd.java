package model.test;

import java.sql.SQLException;
import model.bean.SisContato;
import model.bean.SisEndereco;
//import model.bean.SisPessoa;
import model.dao.PacienteDAO;

/**
 *
 * @author Alex
 */
public class Testebd {
    public static void main(String[] args) throws SQLException {
       // SisPessoa pes = new SisPessoa();
        SisEndereco end = new SisEndereco();
        SisContato ctt = new SisContato();
        PacienteDAO dao = new PacienteDAO();
        
        
        
        end.setCep("67013-201");
        end.setLogradouro("Alameda A");
        end.setNumero("33");
        end.setBairro("una");
        end.setComplemento("Rod. Transcoqueiro, Rua Santo André");
        end.setEstado("PA");
        end.setPais("Brasil");
        
        ctt.setTipoContato("cel");
        ctt.setDDD(91);
        ctt.setNumeroContato("98048-1111");
//        ctt.setCtt_principal(true);

        /*pes.setNomePessoa("Alex Carlos");
        pes.setCpf("017.069.382.17");
        pes.setSexo("Masc");
        pes.setDataNascimento("1993-07-10");
        pes.setEndereco_id(end);
        pes.setContato_id(ctt);
        
        
             dao.save(end,ctt,pes);*/
    }
}
