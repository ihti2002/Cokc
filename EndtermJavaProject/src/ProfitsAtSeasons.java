import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import Connection.DB;


public class ProfitsAtSeasons {
        public static void ProfitsAtSeasons(){
            try{

                Connection connection = null;
                connection=DB.getConnection();

                //profit at winter

                String query2 = "select total_price,total_cost from transaction where Date_of_Transaction between '2020/12/01' and '2021/02/28';";

                Statement st1 = connection.createStatement();

                ResultSet rs1 = st1.executeQuery(query2);
                int totalsum1 = 0;
                while (rs1.next()) {
                    int total_price = rs1.getInt("total_price");
                    int total_cost = rs1.getInt("total_cost");
                    totalsum1 += (total_price - total_cost);
                }
                System.out.println("Profitability at winter: " + totalsum1);

                //profit at spring


                String query3 = "select total_price,total_cost from transaction where Date_of_Transaction between '2021/03/01' and '2021/05/31'";

                Statement st2 = connection.createStatement();

                ResultSet rs2 = st2.executeQuery(query3);
                int totalsum2 = 0;
                while (rs2.next()) {
                    int total_price = rs1.getInt("total_price");
                    int total_cost = rs1.getInt("total_cost");
                    totalsum2 += (total_price - total_cost);
                }
                System.out.println("Profitability at spring: " + totalsum2);


                //profit at summer

                String query4 = "select total_price,total_cost from transaction where Date_of_Transaction between '2021/06/01' and '2021/08/30'";

                Statement st3 = connection.createStatement();

                ResultSet rs3 = st3.executeQuery(query4);
                int totalsum3 = 0;
                while (rs3.next()) {
                    int total_price = rs3.getInt("total_price");
                    int total_cost = rs3.getInt("total_cost");
                    totalsum3 += (total_price - total_cost);
                }
                System.out.println("Profitability at summer: " + totalsum3);

                //profit at autumn

                String query5 = "select total_price,total_cost from transaction where Date_of_Transaction between '2021/09/01' and '2021/11/30'";

                Statement st4 = connection.createStatement();

                ResultSet rs4 = st4.executeQuery(query5);
                int totalsum4 = 0;
                while (rs4.next()) {
                    int total_price = rs4.getInt("total_price");
                    int total_cost = rs4.getInt("total_cost");
                    totalsum4 += (total_price - total_cost);
                }
                System.out.println("Profitability at autumn: " + totalsum4);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } }
    }

