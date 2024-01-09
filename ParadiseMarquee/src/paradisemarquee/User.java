/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradisemarquee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author samee
 */
public class User {
     private static User obj;
    private User() {}
 
    // Only one thread can execute this at a time
    public static synchronized User getInstance()
    {
        if (obj==null)
            obj = new User();
        return obj;
    }
    
     int ID;
     String username;
     String email;
     String password;
     int admin=0;
    static Random rand = new Random();
    


    public boolean save (String email,String user,String pass) throws SQLException{
        for (int j = 0; j<1000; j++)
    {
        ID = rand.nextInt(88)+5;
        
    }
        System.out.println(ID);
        System.out.println(user);
 try{  
Class.forName("com.mysql.jdbc.Driver");  
//here sonoo is database name, root is username and password
    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/paradisemarquee","root","")) {
        //here sonoo is database name, root is username and password
        Statement stmt=con.createStatement();
        stmt.executeUpdate("INSERT into userinfo VALUES ( '"+email+"','"+ID+"', '"+user+"','"+pass+"','0')");
        JOptionPane.showMessageDialog(null,"Sign Up Successful");
        return true;
//        ResultSet rs=stmt.executeQuery("select * from stdinfo");
//        while(rs.next())
//            System.out.println(rs.getString(1)+"  "+rs.getString(2));  
    }
}catch(Exception e){ System.out.println(e);}  
 return false;
    }
    
    
    public boolean authenticate(String email,String pass){
    try{  
Class.forName("com.mysql.jdbc.Driver");  
//here sonoo is database name, root is username and password
    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/paradisemarquee","root","")) {
        //here sonoo is database name, root is username and password
        Statement stmt=con.createStatement();
        String emailcheck=null;
        String passwordcheck=null;
        ResultSet rs=stmt.executeQuery("select * from userinfo");
        while(rs.next()){
            emailcheck=rs.getString(1);
            System.out.println(emailcheck);
            System.out.println(email);
        passwordcheck=rs.getString(4);
            if(emailcheck.equals(email)){
                System.out.println(passwordcheck);
                System.out.println(pass);
                if (passwordcheck.equals(pass)){
                    ID=Integer.parseInt(rs.getString(2));
                return true;
                }
                else {
                      JOptionPane.showMessageDialog(null,"password is incorrect");
                      return false;
                }
           
            }
           
                 
            
        }
        JOptionPane.showMessageDialog(null,"User not found");
                 return false;
    }
}catch(Exception e){ System.out.println(e);} 
    return false;
    }
}
