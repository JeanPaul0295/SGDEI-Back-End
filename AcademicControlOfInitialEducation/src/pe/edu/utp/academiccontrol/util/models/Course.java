package pe.edu.utp.academiccontrol.util.models;

import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * Created by Admin on 2/20/2017.
 */
public class Course {
    private int id;
    private String name;
    private String label;
    private String description;
    private double weight_exam;

    public Course() {
    }

    public Course(int id, String name, String label, String description, double weight_exam) {
        this.id = id;
        this.name = name;
        this.label = label;
        this.description = description;
        this.weight_exam = weight_exam;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight_exam() {
        return weight_exam;
    }

    public void setWeight_exam(double weight_exam) {
        this.weight_exam = weight_exam;
    }

    public static Course build(ResultSet resultSet) {
        try {
            return new Course(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("label"),
                    resultSet.getString("description"),
                    resultSet.getDouble("weight_exam"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
