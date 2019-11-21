package model.teste;

import java.sql.Date;
import java.sql.SQLException;
import model.bean.SisContato;
import model.bean.SisEndereco;
import model.bean.SisPessoa;
import model.dao.PessoaDAO;

/**
 *
 * @author Alex
 */
public class Testebd {
    public static void main(String[] args) throws SQLException {
        SisPessoa pes = new SisPessoa();
        SisEndereco end = new SisEndereco();
        SisContato ctt = new SisContato();
        
        end.setCep("66650-000");
        end.setLogradouro("a");
        end.setNumero("21");
        end.setBairro("a");
        end.setComplemento("a");
        end.setEstado("a");
        end.setPais("a");
        
        ctt.setTipoContato("cel");
        ctt.setDDD(91);
        ctt.setNumeroContato("98267-9307");
        ctt.setCtt_principal(true);
        
        pes.setNomePessoa("alex");
        pes.setCpf("017.069.382-17");
        pes.setSexo("Masc");
        pes.setDataNascimento(new Date(10,07,1993));
        
        PessoaDAO dao = new PessoaDAO();
        
        dao.save(end, ctt, pes);
        
    }
}
