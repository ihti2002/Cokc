import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import Connection.DB;


public class AnalyzeAndOutput {
    public static void AnalyzeAndOutput(){
        try{

            Connection connection = null;
            connection=DB.getConnection();

            // analyze target customers of the shop (to evaluate the average value)

            String query6 = "select dateofbirth from customers";

            Statement st5 = connection.createStatement();

            ResultSet rs5 = st5.executeQuery(query6);
            long totalsum5 = 0;
            int counter =0;
            while (rs5.next()) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                Date date = new Date();
                Date dateofbirth = rs5.getDate("dateofbirth");

                totalsum5 += date.getYear() - dateofbirth.getYear();
                counter++;

            }

            System.out.println("Average customer is: " + totalsum5/counter);





            //OUTPUT DATASET OF TRANSACTIONS




            String queryF = "SELECT * from transaction";

            Statement stF = connection.createStatement();

            ResultSet rsF = stF.executeQuery(queryF);


            while (rsF.next()) {
                int total_price = rsF.getInt("total_price");
                int total_cost = rsF.getInt("total_cost");
                Date date_of_transaction=rsF.getDate("date_of_transaction");
                int transaction_id=rsF.getInt("transaction_id");
                int item_id=rsF.getInt("item_id");
                int customer_id=rsF.getInt("customer_id");
                int Return=rsF.getInt("return");
                String discount_code=rsF.getString("discount_code");
                Transaction transaction=new Transaction(total_cost,total_price,date_of_transaction,transaction_id,item_id,customer_id,Return,discount_code);
                System.out.println(transaction.toString());

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } }
}
