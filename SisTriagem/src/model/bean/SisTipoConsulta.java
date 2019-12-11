package model.bean;

public class SisTipoConsulta {

    private int id;
    private SisPaciente paciente_id;
    private SisMedico medico_id;
    private String nomeConsulta;
    private String CID;
    private String horario;

    public SisTipoConsulta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SisPaciente getPaciente_id(){
        return paciente_id;
    }
    
    public void setPaciente_id (SisPaciente paciente_id){
        this.paciente_id = paciente_id;
    }
    
    public SisMedico getMedico_id() {
        return medico_id;
    }

    public void setMedico_id(SisMedico medico_id) {
        this.medico_id = medico_id;
    }

    public String getNomeConsulta() {
        return nomeConsulta;
    }

    public void setNomeConsulta(String nomeConsulta) {
        this.nomeConsulta = nomeConsulta;
    }

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
