import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Date;

public class Customer extends Main {
   public String Name;
   public int ID;
   public Date DOB;
   public String Gender;
   public String PhoneNumber;
   public String Email;
   public int AvailableFunds;
   public String Country;


//   public Customer(String name, int id, Date dob, String gender, String phoneNumber, String email, String ageGroup, String occupancy, int availableFunds) {
//      Name = name;
//      ID=ID;
//      DOB=dob;
//      PhoneNumber=phoneNumber;
//      Gender=gender;
//      Email=email;
//      AgeGroup=ageGroup;
//      Occupancy=occupancy;
//      AvailableFunds=availableFunds;
//   }

   public Customer() { }
   public Customer(String name,int ID,Date DOB,String Gender,String PhoneNumber,String Email,String Country,int AvailableFunds){
      this.ID=ID;
      this.Name=name;
      this.Country=Country;
      this.AvailableFunds=AvailableFunds;
      this.Gender=Gender;
      this.DOB=DOB;
      this.Email=Email;

      this.PhoneNumber=PhoneNumber;
   }
@Override
public String toString(){
      return "Name: "+Name+" ID: "+ID+" DOB: "+DOB+" Gender: "+Gender+" Phone Number: "+PhoneNumber+" Email: "+Email+" Country: "+Country+" Available Funds"+AvailableFunds;
}

   public int AddFunds(int AvailableFunds,int AddFunds){
      int AddingFunds=AddFunds;
      AvailableFunds=AvailableFunds+AddingFunds;
      return AvailableFunds;
   } 
}
