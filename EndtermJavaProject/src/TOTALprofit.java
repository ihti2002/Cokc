import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import Connection.DB;

public class TOTALprofit extends Insert {
    public static void TOTALprofit(){
        try{

        Connection connection = null;

        connection=DB.getConnection();
        String query1 = "SELECT total_price, total_cost FROM transaction where return =1";

        Statement st = connection.createStatement();

        ResultSet rs = st.executeQuery(query1);

        int totalsum = 0;

        while (rs.next()) {
            int total_price = rs.getInt("total_price");
            int total_cost = rs.getInt("total_cost");
            totalsum += (total_price - total_cost);



        }
        System.out.println("TOTAL Profitability of the company: " + totalsum);

} catch (SQLException throwables) {
        throwables.printStackTrace();
        } }
}
