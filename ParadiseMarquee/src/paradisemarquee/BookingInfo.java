/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradisemarquee;
import java.util.Date;
/**
 *
 * @author samee
 */
public class BookingInfo {
    static int Booking_No;
    static  int ID;
    static  String event_type;
    static  Date date;
    static  boolean meal=false;
    static  String slot;
    static  int attendees=0;
    static  int price=10000;
    
    public static void setPrice (){
        price=attendees*700;
        if (slot.equals("slot1"))
            price+=5000;
        
        if(meal==true)
            price+=15000;
    }
}
