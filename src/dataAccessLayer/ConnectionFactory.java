package dataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String CONN="jdbc:mysql://localhost/assignment1";

    public static Connection getConnection() throws SQLException{
        try{
            return DriverManager.getConnection(CONN,USER,PASSWORD);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }




}
