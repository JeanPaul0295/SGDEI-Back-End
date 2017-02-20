package pe.edu.utp.academiccontrol.util.models;

/**
 * Created by walbe on 20/02/2017.
 */
public class institution {
    private int idInstitution;
    private String name;
    private String label;
    private String description;
    private String tradename;
    private int ruc;
    private String address;
    private String picture;

    public institution () {
    }

    public int getIdInstitution() {
        return idInstitution;
    }

    public void setIdInstitution(int idInstitution) {
        this.idInstitution = idInstitution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
