/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradisemarquee;

import com.toedter.calendar.JTextFieldDateEditor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Date;

/**
 *
 * @author samee
 */
public class Booking extends javax.swing.JFrame {
    Subject subject;
    

  
   public void update() {
      System.out.println("Update added from Admin"); 
   }
  Boolean inputconfirmed=true;
  
    /**
     * Creates new form Booking
     */
    public Booking() {
        //Adding observer to list
        Observer obj=null;
        Subject.observers.add(obj);
        
        //initialization
      
        initComponents();
        Date date=new Date();
       JTextFieldDateEditor editor = (JTextFieldDateEditor) jDateChooser2.getDateEditor();
    editor.setEditable(false);
        jDateChooser2.setMinSelectableDate(date);
      
        jDateChooser2.setDate(date);
     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton6 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton7 = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        day1 = new javax.swing.JComboBox<>();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(93, 16, 73));

        jPanel2.setBackground(new java.awt.Color(78, 13, 58));

        jToggleButton4.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(78, 13, 58));
        jToggleButton4.setText("View & Edit Bookings");
        jToggleButton4.setBorder(null);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton5.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jToggleButton5.setForeground(new java.awt.Color(78, 13, 58));
        jToggleButton5.setText("Log Out");
        jToggleButton5.setBorder(null);
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton10.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton10.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jToggleButton10.setForeground(new java.awt.Color(78, 13, 58));
        jToggleButton10.setText("FAQ");
        jToggleButton10.setBorder(null);
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Booking");

        jLabel2.setBackground(new java.awt.Color(203, 109, 5));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Event Type : ");

        jLabel3.setBackground(new java.awt.Color(203, 109, 5));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select slot :");

        jLabel5.setBackground(new java.awt.Color(203, 109, 5));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No of attendees : ");

        jToggleButton6.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jToggleButton6.setForeground(new java.awt.Color(78, 13, 58));
        jToggleButton6.setText("Confirm");
        jToggleButton6.setBorder(null);
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(203, 109, 5));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Date :");

        jLabel7.setBackground(new java.awt.Color(203, 109, 5));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(max 150)");

        jLabel8.setBackground(new java.awt.Color(203, 109, 5));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Note: Slot 1 : 12pm - 5pm | Slot 2 : 7pm - 12am");

        jToggleButton7.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jToggleButton7.setForeground(new java.awt.Color(78, 13, 58));
        jToggleButton7.setText("Calculate Price");
        jToggleButton7.setBorder(null);
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        day1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        day1.setForeground(new java.awt.Color(78, 13, 58));
        day1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wedding", "Birthday Party", "Music event", "Corporate event", " " }));
        day1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 13, 58), 2));

        jToggleButton8.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jToggleButton8.setForeground(new java.awt.Color(78, 13, 58));
        jToggleButton8.setText("Slot 1");
        jToggleButton8.setBorder(null);
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jToggleButton9.setForeground(new java.awt.Color(78, 13, 58));
        jToggleButton9.setText("Slot 2");
        jToggleButton9.setBorder(null);
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(20, 20, 150, 1));

        jLabel4.setBackground(new java.awt.Color(203, 109, 5));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Meal Included :");

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(93, 16, 73));
        jTextField2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(day1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel8))
                                .addComponent(jCheckBox1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(233, 233, 233))))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox1))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed

        ViewHistory frame1=new ViewHistory();
        frame1.setTitle("Booking History");
        frame1.setResizable(false);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed

        this.setVisible(false);
       Authentication frame2=new Authentication();
        frame2.setVisible(true);

        
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        
         try{
          
          BookingInfo.attendees = (Integer) jSpinner1.getValue();
          if (BookingInfo.attendees<=0){
              inputconfirmed=false;
              
               JOptionPane.showMessageDialog(null,"Enter Number of Attendees");
          }
          System.out.println(BookingInfo.attendees);
           BookingInfo.event_type=day1.getSelectedItem().toString();
           if (BookingInfo.event_type==""){
              inputconfirmed=false;
              
               JOptionPane.showMessageDialog(null,"Enter Event Type");
          }
           System.out.println(BookingInfo.event_type);
             BookingInfo.Date= new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate());
              if (BookingInfo.Date==""){
              inputconfirmed=false;
              
               JOptionPane.showMessageDialog(null,"Enter Date");
          }
           System.out.println(BookingInfo.Date);
           boolean check=jCheckBox1.isSelected();
           if(check==true){
               BookingInfo.meal="true";
           }
            if(BookingInfo.slot==""){
               inputconfirmed=false;
               JOptionPane.showMessageDialog(null,"Select Slot");
               
           }
            if(inputconfirmed==true){
           BookingInfo.setPrice();
           System.out.println(BookingInfo.price);
           String setprice=Integer.toString(BookingInfo.price); 
          jTextField2.setText("the cost is : "+ setprice);
        
            }
       }catch(NumberFormatException e) {
           JOptionPane.showMessageDialog(null,"Enter Valid Amount");

      }
         if(inputconfirmed==true){
          BookingInfo.AddBooking();
          int i=subject.getStates();
             subject.setState(i++);
           
         }

        //Reading from file and inserting data into linked list

//        list1.getfromfile("Monday");
//        list2.getfromfile("Tuesday");
//        list3.getfromfile("Wednesday");
//        list4.getfromfile("Thursday");
//        list5.getfromfile("Friday");
//        list6.getfromfile("Saturday");
//
//        //clearing the file after reading
//
//        list1.fileclearing();
//
//        //taking input and adding to linked list and stack
//
//        int ID=Node.gen();
//
//        if(name.getText().isEmpty()||time.getText().isEmpty()||day.getSelectedItem().toString().isEmpty()||length.getText().isEmpty()||attendees.getText().isEmpty()){
//            JOptionPane.showMessageDialog(null,"Please enter complete information");
//
//        }
//        String user=LogIn.getusername();
//        try{
//            String Status="Pending";
//            String eventname=name.getText();
//            String Day=day.getSelectedItem().toString();
//            int newtime=Integer.parseInt(time.getText());
//            int lengthtime=Integer.parseInt(length.getText());
//            int attendeesno=Integer.parseInt(attendees.getText());
//            int amount=attendeesno*600;
//            amount*=lengthtime;
//
//            if(eventname==null||time.getText()==null||Day==null||length.getText()==null||attendees.getText()==null){
//
//                //checking if text fields are empty
//
//                JOptionPane.showMessageDialog(null,"Please enter complete information");
//            }
//            else if (lengthtime>6){
//
//                //checking if time length is greater than 6
//
//                JOptionPane.showMessageDialog(null,"Marquee cannot be booked for more than 6 hours");
//            }
//            else if (attendeesno>150){
//
//                //checking if attendees are greater than 150
//
//                JOptionPane.showMessageDialog(null,"Attendees limit is 150.");
//            }
//            else {
//                int input = JOptionPane.showConfirmDialog(null,"Confirm Booking?");
//                if(input==0){
//                    switch (Day) {
//                        case "Monday":
//                        if(list1.checking(newtime,lengthtime)){
//
//                            //Checking method checks if time slot is taken or not
//
//                            //adding to linked list
//                            list1.InsertAscending(user,ID,eventname, Day, newtime, lengthtime, attendeesno, amount,Status );
//
//                            //pushing to stack
//                            mystack.push(user,ID,eventname, Day, newtime, lengthtime, attendeesno, amount,Status);
//
//                            System.out.println("inserting from main");
//                            System.out.println(ID);
//                            list1.display();
//                        }else {
//                            JOptionPane.showMessageDialog(null,"Time Slot already taken");
//                        }
//                        break;
//                        case "Tuesday":
//                        if(list2.checking(newtime,lengthtime)){
//                            list2.InsertAscending(user,ID,eventname, Day, newtime, lengthtime, attendeesno, amount,Status );
//                            mystack.push(user,ID,eventname, Day, newtime, lengthtime, attendeesno, amount,Status);
//                            System.out.println("inserting from main");
//                            System.out.println(ID);
//                            list2.display();
//                        }else {
//                            JOptionPane.showMessageDialog(null,"Time Slot already taken");
//                        }
//
//                        break;
//                        case "Wednesday":
//                        if(list3.checking(newtime,lengthtime)){
//                            list3.InsertAscending(user,ID,eventname, Day, newtime, lengthtime, attendeesno, amount,Status );
//                            mystack.push(user,ID,eventname, Day, newtime, lengthtime, attendeesno, amount,Status);
//                            System.out.println("inserting from main");
//                            System.out.println(ID);
//                            list3.display();
//                        }else {
//                            JOptionPane.showMessageDialog(null,"Time Slot already taken");
//                        }
//
//                        break;
//                        case "Thursday":
//                        if(list4.checking(newtime,lengthtime)){
//                            list4.InsertAscending(user,ID,eventname, Day, newtime, lengthtime, attendeesno, amount,Status );
//                            mystack.push(user,ID,eventname, Day, newtime, lengthtime, attendeesno, amount,Status);
//                            System.out.println("inserting from main");
//                            System.out.println(ID);
//                            list4.display();
//                        }else {
//                            JOptionPane.showMessageDialog(null,"Time Slot already taken");
//                        }
//
//                        break;
//                        case "Friday":
//                        if(list5.checking(newtime,lengthtime)){
//                            list5.InsertAscending(user,ID,eventname, Day, newtime, lengthtime, attendeesno, amount,Status );
//                            mystack.push(user,ID,eventname, Day, newtime, lengthtime, attendeesno, amount,Status);
//                            System.out.println("inserting from main");
//                            System.out.println(ID);
//                            list5.display();
//                        }else {
//                            JOptionPane.showMessageDialog(null,"Time Slot already taken");
//                        }
//
//                        break;
//                        case "Saturday":
//                        if(list6.checking(newtime,lengthtime)){
//                            list6.InsertAscending(user,ID,eventname, Day, newtime, lengthtime, attendeesno, amount,Status );
//                            mystack.push(user,ID,eventname, Day, newtime, lengthtime, attendeesno, amount,Status);
//                            System.out.println("inserting from main");
//                            System.out.println(ID);
//                            list6.display();
//                        }else {
//                            JOptionPane.showMessageDialog(null,"Time Slot already taken");
//                        }
//
//                        break;
//                        default:
//                        break;
//                    }
//
//                }
//
//                //Writing linked list and stack data to file
//
//                list1.inserttofile();
//                list2.inserttofile();
//                list3.inserttofile();
//                list4.inserttofile();
//                list5.inserttofile();
//                list6.inserttofile();
//                mystack.inserttofile();
//
//            }
//        }  catch(NumberFormatException e) {
//            JOptionPane.showMessageDialog(null,"Enter Valid Amount");
//
//        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed

   //calculating and displaying cost of the event

    
          Boolean inputconfirmed=true;
         try{
          
          BookingInfo.attendees = (Integer) jSpinner1.getValue();
          if (BookingInfo.attendees<=0){
              inputconfirmed=false;
              
               JOptionPane.showMessageDialog(null,"Enter Number of Attendees");
          }
          System.out.println(BookingInfo.attendees);
           BookingInfo.event_type=day1.getSelectedItem().toString();
           if (BookingInfo.event_type==""){
              inputconfirmed=false;
              
               JOptionPane.showMessageDialog(null,"Enter Event Type");
          }
           System.out.println(BookingInfo.event_type);
             BookingInfo.Date= new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate());
              if (BookingInfo.Date==""){
              inputconfirmed=false;
              
               JOptionPane.showMessageDialog(null,"Enter Date");
          }
           System.out.println(BookingInfo.Date);
           boolean check=jCheckBox1.isSelected();
           if(check==true){
               BookingInfo.meal="true";
           }
           if(BookingInfo.slot==""){
               inputconfirmed=false;
               JOptionPane.showMessageDialog(null,"Select Slot");
               
           }
           
             if(inputconfirmed==true){
               
           
           BookingInfo.setPrice();
           System.out.println(BookingInfo.price);
           String setprice=Integer.toString(BookingInfo.price); 
          jTextField2.setText("the cost is : "+ setprice);
             }
       }catch(NumberFormatException e) {
           JOptionPane.showMessageDialog(null,"Enter Valid Amount");

      }
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
       int input = JOptionPane.showConfirmDialog(null, "You have selected slot 1. Do you want to confirm?");
       if (input==0){
           BookingInfo.slot="slot1";
           
       }
       else 
           inputconfirmed=false;
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "You have selected slot 2. Do you want to confirm?");
        if (input==0){
           BookingInfo.slot="slot2";
       }
         else 
           inputconfirmed=false;
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
       FAQclient frame1=new FAQclient();
       frame1.setVisible(true);
       frame1.setTitle("FAQ");
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Booking().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> day1;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
