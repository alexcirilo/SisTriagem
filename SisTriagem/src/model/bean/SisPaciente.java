package model.bean;

public class SisPaciente {

    private int id;
    private String nomePaciente;
    private String cpf;
    private String sexo;
    private String dataNascimento;
    private String curso;
    private boolean capital;
    private SisEndereco endereco_id ;
    private SisContato contato_id;    
    private SisTipoConsulta consulta_id;
    private String buscaPaciente;

    public String getBuscaPaciente() {
        return buscaPaciente;
    }

    public void setBuscaPaciente(String buscaPaciente) {
        this.buscaPaciente = buscaPaciente;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    

    public SisEndereco getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(SisEndereco endereco_id) {
        this.endereco_id = endereco_id;
    }

    public SisContato getContato_id() {
        return contato_id;
    }

    public void setContato_id(SisContato contato_id) {
        this.contato_id = contato_id;
    }

    public SisTipoConsulta getConsulta_id() {
        return consulta_id;
    }

    public void setConsulta_id(SisTipoConsulta consulta_id) {
        this.consulta_id = consulta_id;
    }
    
    
}
