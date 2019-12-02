package model.test;

import java.sql.SQLException;
import model.bean.SisContato;
import model.bean.SisEndereco;
import model.bean.SisPessoa;
import model.dao.EnderecoEContatoDAO;
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
        PessoaDAO dao = new PessoaDAO();
        //EnderecoEContatoDAO endcttdao = new EnderecoEContatoDAO();
        
        //end.setId(2);
        end.setCep("67013-201");
        end.setLogradouro("Alameda A");
        end.setNumero("33");
        end.setBairro("una");
        end.setComplemento("Rod. Transcoqueiro, Rua Santo André");
        end.setEstado("PA");
        end.setPais("Brasil");
        //endcttdao.salvarEndereco(end);
        
        //ctt.setId(2);
        ctt.setTipoContato("cel");
        ctt.setDDD(91);
        ctt.setNumeroContato("98048-1111");
        ctt.setCtt_principal(true);
        //endcttdao.salvarContato(ctt);

        pes.setNomePessoa("Cirilo");
        pes.setCpf("111.111.111.11");
        pes.setSexo("Ndef");
        pes.setDataNascimento("1996-02-15");
        pes.setEndereco_id(end);
        pes.setContato_id(ctt);
        
        
             dao.save(end,ctt,pes);
    }
}
