package model.bean;

import java.sql.Date;

public class SisPessoa {

    private int id;
    private String nomePessoa;
    private String cpf;
    private String sexo;
    private String dataNascimento;
    private SisEndereco endereco_id;
    private SisContato contato_id;

    public SisPessoa() {
        
    }

    /*public SisPessoa(int id, String nomePessoa, String cpf, String sexo, String dataNascimento, SisEndereco endereco_id, SisContato contato_id) {
        this.id = id;
        this.nomePessoa = nomePessoa;
        this.cpf = cpf;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.endereco_id = endereco_id;
        this.contato_id = contato_id;
    }*/

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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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
}
