package pe.edu.utp.academiccontrol.util.models;

/**
 * Created by Admin on 2/20/2017.
 */
public class Qualification {
    private int idQualifications;
    private String month;

    public Qualification () {
    }

    public Qualification(int idQualifications, String month) {
        this.idQualifications = idQualifications;
        this.month = month;
    }

    public int getIdQualifications() {
        return idQualifications;
    }

    public void setIdQualifications(int idQualifications) {
        this.idQualifications = idQualifications;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
