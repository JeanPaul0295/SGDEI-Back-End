package pe.edu.utp.academiccontrol.models;

import pe.edu.utp.academiccontrol.models.Subject;
import pe.edu.utp.academiccontrol.models.SubjectsEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by walbe on 25/02/2017.
 */
public class QualificationAverage {
    private int id;
    private double qualificationAvg;
    private Subject subject;


    public QualificationAverage() {
    }

    public QualificationAverage(int id, double qualificationAvg, Subject subject) {
        this.id = id;
        this.qualificationAvg = qualificationAvg;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQualificationAvg() {
        return qualificationAvg;
    }

    public void setQualificationAvg(double qualificationAvg) {
        this.qualificationAvg = qualificationAvg;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public static QualificationAverage build(ResultSet resultSet, SubjectsEntity subjectsEntity) {
        try {
            return new QualificationAverage(resultSet.getInt("id"),
                    resultSet.getDouble("qualification_avg"),
                    subjectsEntity.findById(resultSet.getInt("id")));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
