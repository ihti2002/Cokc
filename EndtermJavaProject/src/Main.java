import java.sql.*;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import Connection.DB;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args){


        Insert.Insert();
        Connection connection=null;
        try {
            connection=DB.getConnection();

            //TOTAL PROFIT
            TOTALprofit.TOTALprofit();

            //profits at the Seasons
            ProfitsAtSeasons.ProfitsAtSeasons();

            //Analyze of the AVERAGE TARGET CUSTOMER (ATC)
            // and TRANSACTIONS DATA BASE OUTPUT
            AnalyzeAndOutput.AnalyzeAndOutput();



            connection.close();
        }
        catch (SQLException e){
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
