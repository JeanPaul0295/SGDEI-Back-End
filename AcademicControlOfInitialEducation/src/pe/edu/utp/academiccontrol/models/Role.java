package pe.edu.utp.academiccontrol.util.models;

/**
 * Created by Admin on 2/21/2017.
 */
public class Role {
    private int idRole;
    private String name;
    private String label;

    public Role () {
    }

    public Role(int idRole, String name, String label) {
        this.idRole = idRole;
        this.name = name;
        this.label = label;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
