package model.bean;

import java.sql.Date;

public class SisPessoa {

    private int id;
    private String nomePessoa;
    private String cpf;
    private String sexo;
    private Date dataNascimento;
    private int endereco_id;
    private int contato_id;

    public SisPessoa() {
        
    }

    public SisPessoa(int id, String nomePessoa, String cpf, String sexo, Date dataNascimento, int endereco_id, int contato_id) {
        this.id = id;
        this.nomePessoa = nomePessoa;
        this.cpf = cpf;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.endereco_id = endereco_id;
        this.contato_id = contato_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(int endereco_id) {
        this.endereco_id = endereco_id;
    }

    public int getContato_id() {
        return contato_id;
    }

    public void setContato_id(int contato_id) {
        this.contato_id = contato_id;
    }
}
