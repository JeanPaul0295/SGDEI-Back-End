package pe.edu.utp.academiccontrol.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Administrador on 25/02/2017.
 */
public class Student {
    private int id;
    private Person person;
    private StudentStatus status;
    private Date registry;
    private String degree;
    private Institution institution;

    public Student() {
    }

    public Student(int id, /*Person person, StudentStatus status,*/ Date registry, String degree/*, Institution institution*/) {
        this.id = id;
        //this.person = person;
        //this.status = status;
        this.registry = registry;
        this.degree = degree;
        //this.institution = institution;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
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
                    resultSet.getDate("register_date"),
                    resultSet.getString("degree"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
