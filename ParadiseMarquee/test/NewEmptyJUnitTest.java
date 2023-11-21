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
import paradisemarquee.User;

/**
 *
 * @author samee
 */
public class NewEmptyJUnitTest {
    
  public NewEmptyJUnitTest() {
    }
   @Test
   public void Test_Fun(){
      User obj=User.getInstance();
        boolean restult=obj.authenticate("Test","Test");
        assertEquals(false,restult);
    }
   
    public void Test_Fun2() throws SQLException{
        User obj=User.getInstance();
       boolean restult=obj.save("test","test");
       assertEquals(true,restult);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
