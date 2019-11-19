package model.bean;

/**
 *
 * @author Alex
 */
public class SisMedico {
    private int id, CRM;
    private String especialidade;
    private char UF_CRM;
    private SisPessoa pessoa_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public char getUF_CRM() {
        return UF_CRM;
    }

    public void setUF_CRM(char UF_CRM) {
        this.UF_CRM = UF_CRM;
    }

    public SisPessoa getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(SisPessoa pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

}
