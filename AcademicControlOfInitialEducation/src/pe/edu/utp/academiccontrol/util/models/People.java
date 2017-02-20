package pe.edu.utp.academiccontrol.util.models;

/**
 * Created by walbe on 20/02/2017.
 */
public class People {
    private int idPeople;
    private String password;
    private String name;
    private String father_lastname;
    private String mother_lastname;
    private int dni;
    private String born_date;
    private String pictura;

    public People () {
    }

    public int getIdPeople() {
        return idPeople;
    }

    public void setIdPeople(int idPeople) {
        this.idPeople = idPeople;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather_lastname() {
        return father_lastname;
    }

    public void setFather_lastname(String father_lastname) {
        this.father_lastname = father_lastname;
    }

    public String getMother_lastname() {
        return mother_lastname;
    }

    public void setMother_lastname(String mother_lastname) {
        this.mother_lastname = mother_lastname;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getBorn_date() {
        return born_date;
    }

    public void setBorn_date(String born_date) {
        this.born_date = born_date;
    }

    public String getPictura() {
        return pictura;
    }

    public void setPictura(String pictura) {
        this.pictura = pictura;
    }
}
