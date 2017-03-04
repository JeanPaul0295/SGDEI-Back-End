package pe.edu.utp.academiccontrol.util.models;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by walbe on 20/02/2017.
 */
public class People {
    private int id;
    private String user;
    private String password;
    private String name;
    private String fatherLastname;
    private String motherLastname;
    private String dni;
    private Date born_date;
    private String picture;

    public People() {
    }

    public People(int id, String user, String password, String name, String fatherLastname, String motherLastname, String dni, Date born_date, String picture) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.name = name;
        this.setFatherLastname(fatherLastname);
        this.setMotherLastname(motherLastname);
        this.dni = dni;
        this.born_date = born_date;
        this.picture = picture;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    public String getFatherLastname() {
        return fatherLastname;
    }

    public void setFatherLastname(String fatherLastname) {
        this.fatherLastname = fatherLastname;
    }

    public String getMotherLastname() {
        return motherLastname;
    }

    public void setMotherLastname(String motherLastname) {
        this.motherLastname = motherLastname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getBorn_date() {
        return born_date;
    }

    public void setBorn_date(Date born_date) {
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
            return new People(resultSet.getInt("id"),
                    resultSet.getString("user"),
                    resultSet.getString("password"),
                    resultSet.getString("name"),
                    resultSet.getString("fatherLastname"),
                    resultSet.getString("mmotherLastname"),
                    resultSet.getString("dni"),
                    resultSet.getDate("born_date"),
                    resultSet.getString("picture"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
