/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradisemarquee;

import javax.swing.*;
/**
 *
 * @author samee
 */
public class Booking extends javax.swing.JFrame {

    /**
     * Creates new form Booking
     */
    public Booking() {
        initComponents();
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
        day = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        length = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        attendees = new javax.swing.JTextField();
        jToggleButton6 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton7 = new javax.swing.JToggleButton();
        amountval = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(93, 16, 73));

        day.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        day.setForeground(new java.awt.Color(78, 13, 58));
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        day.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 13, 58), 2));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(78, 13, 58));

        jToggleButton3.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(78, 13, 58));
        jToggleButton3.setText("Remove Booking");
        jToggleButton3.setBorder(null);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(78, 13, 58));
        jToggleButton4.setText("View History");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Booking");

        jLabel2.setBackground(new java.awt.Color(203, 109, 5));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Event Name : ");

        name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(203, 109, 5));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Start Time :");

        time.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(203, 109, 5));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Event length :");

        length.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(203, 109, 5));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No of attendees : ");

        attendees.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

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
        jLabel6.setText("Select Day :");

        jLabel7.setBackground(new java.awt.Color(203, 109, 5));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(max 150)");

        jLabel8.setBackground(new java.awt.Color(203, 109, 5));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(24 hour format)");

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

        amountval.setBackground(new java.awt.Color(93, 16, 73));
        amountval.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        amountval.setForeground(new java.awt.Color(255, 255, 255));
        amountval.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        jTextField1.setBackground(new java.awt.Color(93, 16, 73));
        jTextField1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(203, 109, 5));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("(in hours)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(72, 72, 72)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(37, 37, 37)
                                        .addComponent(attendees, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amountval, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(attendees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed

    }//GEN-LAST:event_dayActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed

        //Creating remove booking frame

//        RemoveBooking frameone=new RemoveBooking();
//        frameone.setTitle("Cancel Booking");
//        frameone.setResizable(false);
//        frameone.setVisible(true);
//        frameone.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed

        //Creating history frame

//        History frameone=new History();
//        frameone.setTitle("Booking History");
//        frameone.setResizable(false);
//        frameone.setVisible(true);
//        frameone.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed

        //Creating Log In & Sign Up frame if logout button is pressed

//        int input = JOptionPane.showConfirmDialog(null,"Are you sure?");
//        if(input==0){
//            Log_Sign frametwo=new Log_Sign();
//            frametwo.setVisible(true);
//            frametwo.setResizable(false);
//            frametwo.setTitle("Digital Maquee Booking");
//            this.setVisible(false);

        
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed

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

//        jTextField1.setText("The cost is : ");
//        try{
//            int lengthtime=Integer.parseInt(length.getText());
//            int attendeesno=Integer.parseInt(attendees.getText());
//            int amount;
//            amount=attendeesno*600;
//            amount*=lengthtime;
//            String st=String.valueOf(amount);
//            amountval.setText(st);
//        }catch(NumberFormatException e) {
//            JOptionPane.showMessageDialog(null,"Enter Valid Amount");
//
//        }
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
    private javax.swing.JTextField amountval;
    private javax.swing.JTextField attendees;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JTextField length;
    private javax.swing.JTextField name;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
