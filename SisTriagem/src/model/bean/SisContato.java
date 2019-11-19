package model.bean;

/**
 *
 * @author Alex
 */
public class SisContato {
    private int id, DDD;
    private String tipoContato, numeroContato;
    private boolean ctt_principal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public String getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }

    public boolean isCtt_principal() {
        return ctt_principal;
    }

    public void setCtt_principal(boolean ctt_principal) {
        this.ctt_principal = ctt_principal;
    }
}
