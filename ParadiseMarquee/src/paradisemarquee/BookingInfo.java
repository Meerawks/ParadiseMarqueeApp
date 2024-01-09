/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradisemarquee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;


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
    static public boolean AddBooking(){
       for (int j = 0; j<1000; j++)
    {
        Booking_No = rand.nextInt(1000)+5;
        
    }
       
       try{  
Class.forName("com.mysql.jdbc.Driver");  
//here sonoo is database name, root is username and password
    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/paradisemarquee","root","")) {
        //here sonoo is database name, root is username and password
        String newDate,SlotNo;
        Statement stmt=con.createStatement();
        
        ResultSet rs=stmt.executeQuery("select * from booking");
        while(rs.next()){
            newDate=rs.getString(4);
            SlotNo=rs.getString(5);

           if (Date == null ? newDate == null : Date.equals(newDate)){
               if (SlotNo == null ? slot == null : SlotNo.equals(slot)){
                JOptionPane.showMessageDialog(null,"This slot has been taken!");
                System.out.println(newDate);
                System.out.println(Date);
                System.out.println("here we are "+SlotNo+" "+ slot);
                return false;
               }
           }
   
        }
         User obj=User.getInstance();
       
        stmt.executeUpdate("INSERT into booking VALUES ( '"+obj.ID+"', '"+Booking_No+"','"+event_type+"','"+Date+"','"+slot+"','"+meal+"','"+attendees+"','"+price+"','"+status+"')");
        JOptionPane.showMessageDialog(null,"Booking Confirmed");
        
               
    }
}catch(Exception e){ System.out.println(e);} 
        return true;
    }
    
    }

