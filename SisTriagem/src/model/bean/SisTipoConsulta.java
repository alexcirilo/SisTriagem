package model.bean;

/**
 *
 * @author Alex
 */
public class SisTipoConsulta {
     private int id;
     private SisMedico medico_id;
     private String nomeConsulta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
     
}
