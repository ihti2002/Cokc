import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import Connection.DB;

public class Insert {
    public static void Insert(){
        String insert1CD;
        String insert1ID;
        String insert2CD;
        String insert2ID;
        String insert1TD;
        String insert2TD;

        Connection connection = null;

        try{
            connection= DB.getConnection();

            insert1CD="insert into customers (Name , ID , Dateofbirth, Gender , Phonenumber, Email, Country , Availablefunds) values ('Nickolas', 1, '03/13/2001', 'Female', '203-794-5780', 'nmiskelly0@businessinsider.com', 'Ukraine', 210);\n" +
                    "insert into customers (Name , ID , Dateofbirth, Gender , Phonenumber, Email, Country , Availablefunds) values ('Jarad', 2, '07/25/1997', 'Polygender', '949-653-9444', 'jlorne1@rakuten.co.jp', 'Sweden', 749);";
            insert1ID="insert into Item (Item_name , Item_ID, Item_Category, Item_Price , Item_Cost, Item_Units_available, Item_Discount_code) values ('Gösta', 1, 1, 1302, 9985, 672, '10096-0171');\n" +
                    "insert into Item (Item_name , Item_ID, Item_Category, Item_Price , Item_Cost, Item_Units_available, Item_Discount_code) values ('Lucrèce', 2, 2, 4442, 8826, 374, '63187-110');";
//                insert2TD=" ";
//                insert2CD=" ";
//                insert2ID=" ";
            insert1TD="insert into Transaction (Transaction_ID, Date_of_Transaction, Customer_ID, Item_ID, Return, total_cost, Total_price, Discount_code, Status) values (1, '12/5/2020', 1, 1, 1, 95, 9340, '60681-2501', 10);\n" +
                    "insert into Transaction (Transaction_ID, Date_of_Transaction, Customer_ID, Item_ID, Return, total_cost, Total_price, Discount_code, Status) values (2, '1/23/2021', 2, 2, 1, 8, 9021, '41520-442', 100); ";

            Statement statement=connection.createStatement();
            statement.executeUpdate(insert1CD);
//                statement.executeUpdate(insert2CD);
            statement.executeUpdate(insert1ID);
//                statement.executeUpdate(insert2ID);
            statement.executeUpdate(insert1TD);
//                statement.executeUpdate(insert2TD);
    } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

