package databseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String USER = "denisalazar";
    private static final String PASSWORD = "vrWALObk2Za7DIyH";
    private static final String CONN="jdbc:mysql://localhost/assignment1";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONN,USER,PASSWORD);

    }




}
