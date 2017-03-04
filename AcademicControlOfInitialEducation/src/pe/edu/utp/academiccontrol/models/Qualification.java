package pe.edu.utp.academiccontrol.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.utp.academiccontrol.models.SubjectsEntity;

/**
 * Created by Admin on 2/20/2017.
 */
public class Qualification {
    private int id;
    private String month;
    private double qualifications;
    private Subject subject;

    public Qualification() {
    }

    public Qualification(int id, String month, double qualifications, Subject subject) {
        this.id = id;
        this.month = month;
        this.qualifications = qualifications;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getQualifications() {
        return qualifications;
    }

    public void setQualifications(double qualifications) {
        this.qualifications = qualifications;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public static Qualification build(ResultSet resultSet, SubjectsEntity subjectsEntity) {
        try {
            return new Qualification(resultSet.getInt("id"),
                    resultSet.getString("month"),
                    resultSet.getDouble("qualifications"),
                    subjectsEntity.findById(resultSet.getInt("id")));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
