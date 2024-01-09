/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradisemarquee;

import java.util.ArrayList;
import java.util.List;

public class Subject extends Thread{
	
    static List<Observer> observers = new ArrayList<Observer>();
   private int state;

   
   public int getStates() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
       Thread myThreads[] = new Thread[observers.size()];
       //each thread notifies a single observer
       for (int j = 0; j < observers.size(); j++) {
    
      myThreads[j] = new Thread(new Runnable(){

        @Override
        public void run() {    
        for (Observer observer : observers) {
         observer.update();
      }    
        }
    });
     myThreads[j].start();
      
}
 
   } 	
}