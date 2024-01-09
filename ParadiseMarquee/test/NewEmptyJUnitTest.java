/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import paradisemarquee.BookingInfo;
import paradisemarquee.Signup;
import paradisemarquee.User;
import paradisemarquee.ViewHistory;
import paradisemarquee.newpassword;

/**
 *
 * @author samee
 */
public class NewEmptyJUnitTest {
    
  public NewEmptyJUnitTest() {
    }
   @Test
   public void Test_Authenticate(){
      User obj=User.getInstance();
        boolean restult=obj.authenticate("dummyemail","Test");
        assertEquals(false,restult);
    }
   
    public void Test_SaveUser() throws SQLException{
        User obj=User.getInstance();
       boolean restult=obj.save("test","test","test");
       assertEquals(true,restult);
    }
    public void Test_Bookingsave() throws SQLException{
        boolean result=BookingInfo.AddBooking(15, "wedding", "2024-01-9","ture", "slot1", 50, 5000, "booked");
       assertEquals(true,result);
    }
     public void Test_EmailAvailablility() throws SQLException{
       boolean result=Signup.checkemail("sameer.asif.mughal@gmail.com");
       assertEquals(true,result);
    }
       public void Test_passwordvalidity() throws SQLException{
       boolean result=Signup.passwordvalidator("abcd");
       assertEquals(false,result);
    }
        public void Test_updatestatus() throws SQLException{
       boolean result=ViewHistory.updatestatus(75);
       assertEquals(true,result);
    }
         public void Test_resetpassword() throws SQLException{
       boolean result=newpassword.resetpassword(75, "aaski@786");
       assertEquals(true,result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
