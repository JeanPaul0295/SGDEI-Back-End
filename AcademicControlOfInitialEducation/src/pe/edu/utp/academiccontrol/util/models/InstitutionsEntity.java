package pe.edu.utp.academiccontrol.util.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Administrador on 25/02/2017.
 */
public class InstitutionsEntity extends BaseEntity {
    private static String DEFAULT_SQL = "SELECT * FROM sgdi.institutions";

    public List<Institution> findAll() {
        return findByCriteria(DEFAULT_SQL);
    }

    public Institution findById(int id) {
        List<Institution> institutions = findByCriteria(DEFAULT_SQL + " WHERE idInstitution = " + String.valueOf(id));
        return (institutions != null) ? institutions.get(0) : null;
    }

    public Institution findByName(String name) {
        List<Institution> institutions = findByCriteria(DEFAULT_SQL + " WHERE name = '" + name + "'");
        return (institutions.isEmpty()) ? null : institutions.get(0);
    }

    private List<Institution> findByCriteria(String sql) {
        List<Institution> institutions;
        if(getConnection() != null) {
            institutions = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
                while(resultSet.next()) {
                    Institution institution = Institution.build(resultSet);
                    institutions.add(institution);
                }
                return institutions;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private int getMaxId() {
        String sql = "SELECT MAX(idInstitution) as max_id FROM institutions";
        if(getConnection() != null) {
            try {
                ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
                return resultSet.next() ? resultSet.getInt(1) : 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public Institution create(String name, String label, String description, String tradename, String ruc, String address, String picture) {
        if(findByName(name) == null) {
            if(getConnection() != null) {
                String sql = "INSERT INTO institution(name, label, description, tradename, ruc, address, picture) VALUES(" +
                        String.valueOf(name + ", '" + label + ", '" + description + ", '" + tradename + ", '" + ruc + ", '" + address + ", '" + picture + "')");
                try {
                    int results = getConnection().createStatement().executeUpdate(sql);
                    if(results > 0) {
                        Institution institution = new Institution(getMaxId(), name, label, description, tradename, ruc, address, picture);
                        return institution;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    private int updateByCriteria(String sql) {
        if(getConnection() != null) {
            try {
                return getConnection().createStatement().executeUpdate(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public boolean update(Institution institution) {
        return updateByCriteria("UPDATE institutions SET name = '" +
                institution.getName() +
                "' label = '" + institution.getLabel() +
                "' description = '" + institution.getDescription() +
                "' tradename = '" + institution.getTradename() +
                "' ruc = '" + institution.getRuc() +
                "' address = '" + institution.getAddress() +
                "' picture = '" + institution.getPicture() +
                "' WHERE idInstitution = " + String.valueOf(institution.getIdInstitution())) > 0;
    }

    public boolean delete(int id) {
        return updateByCriteria("DELETE FROM institutions WHERE idInstitutions= "+
                String.valueOf(id)) > 0;
    }

    public boolean delete(String name) {
        return updateByCriteria("DELETE FROM institutions WHERE name = '"+
                name + "'") > 0;
    }
}
