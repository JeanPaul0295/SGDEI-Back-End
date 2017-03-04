package pe.edu.utp.academiccontrol.util.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Administrador on 25/02/2017.
 */
public class Student {
    private int id;
    private People people;
    private String address;
    private String sex;
    private StudentStatus status;
    private Date registry;
    private Degree degree;
    private String academicYear;
    private String picture;
    private Institution institution;

    public Student() {
    }

    public Student(int id, /*People people,*/ String address, String sex, /*StudentStatus status,*/ Date registry, /*Degree degree,*/ String academicYear, String picture/*, Institution institution*/) {
        this.setId(id);
        //this.setPeople(people);
        this.setAddress(address);
        this.setSex(sex);
        //this.setStatus(status);
        this.setRegistry(registry);
        //this.setDegree(degree);
        this.setAcademicYear(academicYear);
        this.setPicture(picture);
        //this.setInstitution(institution);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public Date getRegistry() {
        return registry;
    }

    public void setRegistry(Date registry) {
        this.registry = registry;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public static Student build(ResultSet resultSet) {
        try {
            return new Student(resultSet.getInt("id"),
                    resultSet.getString("address"),
                    resultSet.getString("sex"),
                    resultSet.getDate("registry"),
                    resultSet.getString("academicYear"),
                    resultSet.getString("picture"));
                    //TODO:Implement getPersonEntity
                    //TODO:Implement getStudentStatusEntity
                    //TODO:Implement getDegreeEntity
                    //TODO:Implement getInstitutionEntity

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
