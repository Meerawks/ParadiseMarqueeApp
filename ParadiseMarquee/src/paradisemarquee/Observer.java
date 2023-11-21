/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradisemarquee;

/**
 *
 * @author samee
 */
public  class Observer {

public void Notify(){
    System.out.println("Notifying Admin");
    Admin obj=new Admin();
    obj.NotifyAdmin();
}
}