package pe.edu.utp.academiccontrol.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrador on 25/02/2017.
 */
public class StudentStatus {
    private int id;
    private String name;
    private String label;

    public StudentStatus() {
    }

    public StudentStatus(int id, String name, String label) {
        this.setId(id);
        this.setName(name);
        this.setLabel(label);
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

    public static StudentStatus build(ResultSet resultSet) {
        try {
            return new StudentStatus(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("label"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
