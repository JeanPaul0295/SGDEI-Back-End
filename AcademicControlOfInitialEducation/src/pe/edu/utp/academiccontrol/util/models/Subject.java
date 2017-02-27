package pe.edu.utp.academiccontrol.util.models;

/**
 * Created by Administrador on 25/02/2017.
 */
public class Subject {
    private int id;
    private Course course;
    private Degree degree;
    private String academicYear;
    private Institution institution;

    public Subject() {
    }

    public Subject(int id, Course course, Degree degree, String academicYear, Institution institution) {
        this.setId(id);
        this.setCourse(course);
        this.setDegree(degree);
        this.setAcademicYear(academicYear);
        this.setInstitution(institution);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }
}
