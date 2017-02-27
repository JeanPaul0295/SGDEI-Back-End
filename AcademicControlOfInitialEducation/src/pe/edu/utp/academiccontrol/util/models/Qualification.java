package pe.edu.utp.academiccontrol.util.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Admin on 2/20/2017.
 */
public class Qualification {
    private int id;
    private String month;
    private double qualifications;
    private Institution institution;

    public Qualification() {
    }

    public Qualification(int id, String month, double qualifications/*, Institution institution*/) {
        this.setId(id);
        this.setMonth(month);
        this.setQualifications(qualifications);
        //this.setInstitution(institution);
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

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public static Qualification build(ResultSet resultSet) {
        try {
            return new Qualification(resultSet.getInt("id"),
                    resultSet.getString("month"),
                    resultSet.getDouble("qualifications"));
                    //TODO:Implement getInstitutionEntity

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
