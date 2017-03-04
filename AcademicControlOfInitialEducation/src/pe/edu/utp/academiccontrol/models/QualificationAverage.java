package pe.edu.utp.academiccontrol.util.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by walbe on 25/02/2017.
 */
public class QualificationAverage {
    private int id;
    private Subject subject;
    private double qualificationAvg;
    private Institution institution;


    public QualificationAverage() {
    }

    public QualificationAverage(int id, double qualificationAvg/*, Institution institution*/) {
        this.setId(id);
        this.setQualificationAvg(qualificationAvg);
        //this.setInstitution(institution);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getQualificationAvg() {
        return qualificationAvg;
    }

    public void setQualificationAvg(double qualificationAvg) {
        this.qualificationAvg = qualificationAvg;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public static QualificationAverage build(ResultSet resultSet) {
        try {
            return new QualificationAverage(resultSet.getInt("id"),
                    resultSet.getDouble("qualifications"));
                    //TODO:Implement getSubjectEntity
                    //TODO:Implement getInstitutionEntity

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
