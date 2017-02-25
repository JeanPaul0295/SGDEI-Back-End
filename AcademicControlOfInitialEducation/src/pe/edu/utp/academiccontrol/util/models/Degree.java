package pe.edu.utp.academiccontrol.util.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by walbe on 25/02/2017.
 */
public class Degree {
    private int idDegree;
    private String name;
    private String label;

    public Degree() {
    }

    public Degree(int idDegree, String name, String label) {
        this.idDegree = idDegree;
        this.name = name;
        this.label = label;
    }

    public int getIdDegree() {
        return idDegree;
    }

    public void setIdDegree(int idDegree) {
        this.idDegree = idDegree;
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
            return new Degree(resultSet.getInt("idDegree"),
                    resultSet.getString("name"),
                    resultSet.getString("label"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
