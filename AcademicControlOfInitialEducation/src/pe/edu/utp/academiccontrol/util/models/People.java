package pe.edu.utp.academiccontrol.util.models;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by walbe on 20/02/2017.
 */
public class People {
    private int idPeople;
    private String user;
    private String password;
    private String name;
    private String father_lastname;
    private String mother_lastname;
    private String dni;
    private String born_date;
    private String picture;

    public People(int idPerson, String user, String password, String name, String father_lastname, String string, String dni, Date born_date, String picture) {
    }

    public People(int idPeople, String user, String password, String name, String father_lastname, String mother_lastname, String dni, String born_date, String picture) {
        this.idPeople = idPeople;
        this.user = user;
        this.password = password;
        this.name = name;
        this.father_lastname = father_lastname;
        this.mother_lastname = mother_lastname;
        this.dni = dni;
        this.born_date = born_date;
        this.picture = picture;
    }

    public int getIdPeople() {
        return idPeople;
    }

    public void setIdPeople(int idPeople) {
        this.idPeople = idPeople;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getBorn_date() {
        return born_date;
    }

    public void setBorn_date(String born_date) {
        this.born_date = born_date;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public static People build(ResultSet resultSet) {
        try {
            return new People(resultSet.getInt("idPerson"),
                    resultSet.getString("user"),
                    resultSet.getString("password"),
                    resultSet.getString("name"),
                    resultSet.getString("father_lastname"),
                    resultSet.getString("mmother:lastname"),
                    resultSet.getString("dni"),
                    resultSet.getDate("born_date"),
                    resultSet.getString("picture"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
