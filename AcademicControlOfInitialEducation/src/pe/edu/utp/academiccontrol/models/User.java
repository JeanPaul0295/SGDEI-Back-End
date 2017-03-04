package pe.edu.utp.academiccontrol.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Administrador on 03/03/2017.
 */
public class User {
    private int id;
    private String user;
    private String password;
    private Date registry;
    private Boolean status;
    private Person person;

    public User() {
    }

    public User(int id, String user, String password, Date registry, Boolean status/*, Person person*/) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.registry = registry;
        this.status = status;
        //this.person = person;
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

    public Date getRegisty() {
        return registry;
    }

    public void setRegistry(Date registry) {
        this.registry = registry;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static User build(ResultSet resultSet) {
        try {
            return new User(resultSet.getInt("id"),
                    resultSet.getString("user"),
                    resultSet.getString("password"),
                    resultSet.getDate("register_date"),
                    resultSet.getBoolean("status"));


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
