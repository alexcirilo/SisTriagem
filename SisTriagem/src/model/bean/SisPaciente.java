package model.bean;

public class SisPaciente {

    private int id;
    private String curso;
    private String motivoTriagem;
    private String capital;
    private String vinculoParente;
    private SisPessoa pessoa_id;
    private SisTipoConsulta consulta_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMotivoTriagem() {
        return motivoTriagem;
    }

    public void setMotivoTriagem(String motivoTriagem) {
        this.motivoTriagem = motivoTriagem;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getVinculoParente() {
        return vinculoParente;
    }

    public void setVinculoParente(String vinculoParente) {
        this.vinculoParente = vinculoParente;
    }

    public SisPessoa getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(SisPessoa pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

    public SisTipoConsulta getConsulta_id() {
        return consulta_id;
    }

    public void setConsulta_id(SisTipoConsulta consulta_id) {
        this.consulta_id = consulta_id;
    }

    
}
