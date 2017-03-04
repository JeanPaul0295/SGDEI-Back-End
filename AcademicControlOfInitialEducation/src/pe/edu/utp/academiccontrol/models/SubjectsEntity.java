package pe.edu.utp.academiccontrol.models;

import java.util.List;

/**
 * Created by Administrador on 03/03/2017.
 */
public class SubjectsEntity extends BaseEntity {
    private static String DEFAULT_SQL = "SELECT * FROM subjects";

    public List<Subject> findAll() {
        
    }

    public Subject findById(int id) {
        //List<People> peoples = findByCriteria(DEFAULT_SQL + "WHERE idPerson =" + String.valueOf(id));
        //return (peoples != null) ? peoples.get(0) : null;
        return null;
    }
}
