package dataAccessLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Useful {

    public static void close (Connection c) throws SQLException{
        if(c!=null){
            try{
                c.close();
            }catch(SQLException e){
                //do nothing
            }
        }
    }

    public static void close(Statement s) throws SQLException{
        if(s!=null){
            try{
                s.close();
            }catch(SQLException e){
                //do nothing
            }
        }
    }

    public static void close(ResultSet rs) throws SQLException{
        if(rs!=null){
            try{
                rs.close();
            }catch(SQLException e){
                //do nothing
            }
        }
    }
}
