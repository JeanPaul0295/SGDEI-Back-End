package pe.edu.utp.academiccontrol.util.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Admin on 2/28/2017.
 */
public class PeoplesEntity extends BaseEntity {
    private static String DEFAULT_SQL = "SELECT * FROM people";

    private List<People> findByCriteria(String sql) {
        List<People> peoples;
        if(getConnection() != null) {
            peoples = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
                while (resultSet.next()) {
                    People people = People.build(resultSet);
                    peoples.add(people);
                }
                return peoples;
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<People> findAll() {
        return findByCriteria(DEFAULT_SQL);
    }

    public People findById(int id) {
        List<People> peoples = findByCriteria(DEFAULT_SQL + "WHERE idPerson =" + String.valueOf(id));
        return (peoples != null) ? peoples.get(0) : null;
    }

    public People findByName(String name) {
        List<People> peoples = findByCriteria(DEFAULT_SQL + " WHERE name = '" + name + "'");
        return (peoples.isEmpty()) ? null : peoples.get(0);
    }
    //TODO: Consult if is necesary implement this function in all entities
    /*
    private int getMaxId() {
        String sql = "SELECT MAX(idPerson) as max_id FROM people";
        if(getConnection() != null) {
            try {
                ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
                return resultSet.next() ? resultSet.getInt(1) : 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0; v
    */

    public People create(int id, String user, String password, String name, String father_lastname, String mother_lastname, String dni, String born_date, String picture) {
        if(findByName(name) == null) {

            if(getConnection() != null) {
                String sql = "INSERT INTO people(id, user, password, name, father_lastname, mother_lastname, dni, born_date, picture) VALUES(" +
                        String.valueOf(id + ", '" +
                                user + ", '" +
                                password + ", '" +
                                name + ", '" +
                                father_lastname + ", '" +
                                mother_lastname + ", '" +
                                dni + ", '" +
                                born_date + ", '" +
                                picture + "')");
                try {
                    int results = getConnection().createStatement().executeUpdate(sql);
                    if(results > 0) {
                        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                        Date br_date = df.parse(born_date);
                        People people = new People(id, user, password, name, father_lastname, mother_lastname, dni, br_date, picture);
                        return people;
                    }
                } catch (SQLException|ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public People create(String user, String password, String name, String father_lastname, String mother_lastname, String dni, String born_date, String picture) {
        if(findByName(name) == null) {
            if(getConnection() != null) {
                String sql = "INSERT INTO people(user, password, name, father_lastname, mother_lastname, dni, born_date, picture) VALUES(" +
                        String.valueOf(user + ", '" + password + ", '" + name + ", '" + father_lastname + ", '" + mother_lastname + ", '" + dni + ", '" + born_date + ", '" + picture + "')");
                try {
                    int results = getConnection().createStatement().executeUpdate(sql);
                    if(results > 0) {
                        People people = new People(user, password, name, father_lastname, mother_lastname, dni, born_date, picture);
                        return people;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
