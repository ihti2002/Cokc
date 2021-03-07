package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection getConnection()throws SQLException{
        String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";
        String username="postgres";
        String password ="2002";
        try{
            Connection connection= DriverManager.getConnection(jdbcURL,username,password);
            return connection;
        }catch (SQLException e){
            System.out.println("Error");
            e.printStackTrace();
            return null;
        }
    }
}
