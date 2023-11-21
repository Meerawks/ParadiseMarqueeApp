/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradisemarquee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import static paradisemarquee.User.ID;
/**
 *
 * @author samee
 */
public class BookingInfo {
    static int Booking_No;
    static Random rand = new Random();
    static  int ID;
    static  String event_type="";
  static String Date="";
    static String meal="false";
    static  String slot="";
    static  int attendees=0;
    static  int price=10000;
    static String status="booked";
    
    public static void setPrice (){
        price=attendees*700;
        if (slot.equals("slot1"))
            price+=5000;
        
        if(meal=="true")
            price+=15000;
    }
    static public void AddBooking(){
       for (int j = 0; j<1000; j++)
    {
        Booking_No = rand.nextInt(88)+5;
        
    }
        try{  
Class.forName("com.mysql.jdbc.Driver");  

    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/paradisemarquee","root","")) {

        Statement stmt=con.createStatement();
        stmt.executeUpdate("INSERT into booking VALUES ( '"+User.ID+"', '"+Booking_No+"','"+event_type+"','"+Date+"','"+slot+"','"+meal+"','"+attendees+"','"+price+"','"+status+"')");
        JOptionPane.showMessageDialog(null,"Booking Confirmed");

    }
}catch(Exception e){ System.out.println(e);}  
    }
    
    }

