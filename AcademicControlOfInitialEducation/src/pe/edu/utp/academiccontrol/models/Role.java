package pe.edu.utp.academiccontrol.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Admin on 2/21/2017.
 */
public class Role {
    private int id;
    private String name;
    private String label;
    private Boolean status;

    public Role () {
    }

    public Role(int id, String name, String label, Boolean status) {
        this.setId(id);
        this.setName(name);
        this.setLabel(label);
        this.setStatus(status);
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public static Role build(ResultSet resultSet) {
        try {
            return new Role(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("label"),
                    resultSet.getBoolean("status"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
