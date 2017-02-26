package pe.edu.utp.academiccontrol.util.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrador on 25/02/2017.
 */
public class Institution {
    private int id;
    private String name;
    private String label;
    private String description;
    private String tradename;
    private String ruc;
    private String address;
    private String picture;


    public Institution() {
    }

    public Institution(int id, String name, String label, String description, String tradename, String ruc, String address, String picture) {
        this.setId(id);
        this.setName(name);
        this.setLabel(label);
        this.setDescription(description);
        this.setTradename(tradename);
        this.setRuc(ruc);
        this.setAddress(address);
        this.setPicture(picture);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public static Institution build(ResultSet resultSet) {
        try {
            return new Institution(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("label"),
                    resultSet.getString("description"),
                    resultSet.getString("tradename"),
                    resultSet.getString("ruc"),
                    resultSet.getString("address"),
                    resultSet.getString("picture"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
