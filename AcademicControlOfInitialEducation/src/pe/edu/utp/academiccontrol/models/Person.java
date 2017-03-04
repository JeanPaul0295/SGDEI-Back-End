package pe.edu.utp.academiccontrol.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by walbe on 20/02/2017.
 */
public class Person {
    private int id;
    private String name;
    private String fatherLastname;
    private String motherLastName;
    private String dni;
    private String address;
    private String sex;
    private Boolean status;
    private String picture;
    private Person person;

    public Person() {
    }

    public Person(int id, String name, String fatherLastname, String motherLastName, String dni, String address, String sex, Boolean status, String picture/*, Person person*/) {
        this.id = id;
        this.name = name;
        this.fatherLastname = fatherLastname;
        this.motherLastName = motherLastName;
        this.dni = dni;
        this.address = address;
        this.sex = sex;
        this.status = status;
        this.picture = picture;
        //this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static Person build(ResultSet resultSet) {
        try {
            return new Person(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("father_lastname"),
                    resultSet.getString("mother_lastname"),
                    resultSet.getString("dni"),
                    resultSet.getString("address"),
                    resultSet.getString("sex"),
                    resultSet.getBoolean("status"),
                    resultSet.getString("picture"));

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
