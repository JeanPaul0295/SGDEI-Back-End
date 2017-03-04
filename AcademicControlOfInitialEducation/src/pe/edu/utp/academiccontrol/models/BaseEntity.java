package pe.edu.utp.academiccontrol.models;

import java.sql.Connection;

/**
 * Created by walbe on 20/02/2017.
 */
public class BaseEntity {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }


}
