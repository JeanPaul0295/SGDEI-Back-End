package pe.edu.utp.academiccontrol.util.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by walbe on 25/02/2017.
 */
public class Degree {
    private int id;
    private String name;
    private String label;

    public Degree() {
    }

    public Degree(int id, String name, String label) {
        this.id = id;
        this.name = name;
        this.label = label;
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

    public static Degree build(ResultSet resultSet) {
        try {
            return new Degree(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("label"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
