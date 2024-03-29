/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradisemarquee;

import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author samee
 */
public class Admin extends javax.swing.JFrame {
    static  String newDate="";
    boolean dateselected=false;
    
    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) jDateChooser3.getDateEditor();
    editor.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(93, 16, 73));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 13, 58), 10));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Bookings");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Booking ID", "Event Type", "Event Date", "Slot", "Meal ", "Attendees", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(78, 13, 58));
        jButton18.setText("Cancel");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(78, 13, 58));
        jButton19.setText("Fulfill");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Click on a booking to edit it.");

        jTextField1.setText(" Search by Booking ID");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(78, 13, 58));
        jButton20.setText("Go");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(78, 13, 58));
        jButton21.setText("Refresh");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(78, 13, 58));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jDateChooser3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser3PropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search by date:");

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(78, 13, 58));
        jButton22.setText("Go");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jTextField2.setText(" Search by User ID");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(78, 13, 58));
        jButton23.setText("Go");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton20))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton23))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton22)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(101, 101, 101)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(392, 392, 392))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton21))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton18)
                                .addComponent(jButton19))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jButton20))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addComponent(jButton22))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jButton23)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public  void NotifyAdmin(){
        System.out.println("Admin Notified about new booking");
 }
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
       int row=1000;
               row=jTable1.getSelectedRow();
        
       System.out.println(jTable1.getModel().getValueAt(row,1));
     int ID = (int) jTable1.getModel().getValueAt(row,1);
        String status=jTable1.getModel().getValueAt(row,8).toString();
        System.out.println(status);
        System.out.println(ID);
              if (row==1000){
                  JOptionPane.showMessageDialog(null,"Select Booking ID");
              }else if("Fulfilled".equals(status)){
                  JOptionPane.showMessageDialog(null,"Fulfilled bookings cannot be cancelled");
              }else if("Cancelled".equals(status)){
                  JOptionPane.showMessageDialog(null,"Booking cancelled already");
              }
              else{
                   try{  
Class.forName("com.mysql.jdbc.Driver");  

    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/paradisemarquee","root","")) {
         int input = JOptionPane.showConfirmDialog(null, "You sure you want to cancel booking?");
       if (input==0){
        Statement stmt=con.createStatement();
    
    String query = "update booking set status = ? where booking_id = ?";
PreparedStatement preparedStatement = con.prepareStatement(query);

preparedStatement.setString(1, "Cancelled");
preparedStatement.setInt(2, ID);

preparedStatement.executeUpdate();
        
       
       
          
           
       }
      
        
    }
}catch(Exception e){ System.out.println(e);} 
              }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
          int row=1000;
               row=jTable1.getSelectedRow();
        
       System.out.println(jTable1.getModel().getValueAt(row,1));
     int ID = (int) jTable1.getModel().getValueAt(row,1);
     String status=jTable1.getModel().getValueAt(row,8).toString();
        System.out.println(status);
        System.out.println(ID);
              if (row==1000){
                  JOptionPane.showMessageDialog(null,"Select Booking ID");
              }else if("Cancelled".equals(status)){
                  JOptionPane.showMessageDialog(null,"Cancelled bookings cannot be fulfilled");
              }else if("Fulfilled".equals(status)){
                  JOptionPane.showMessageDialog(null,"Booking fulfilled already");
              }
              else{
                   try{  
Class.forName("com.mysql.jdbc.Driver");  

    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/paradisemarquee","root","")) {
         int input = JOptionPane.showConfirmDialog(null, "You sure you want to Fulfill booking?");
       if (input==0){
        Statement stmt=con.createStatement();
    String query = "update booking set status = ? where booking_id = ?";
PreparedStatement preparedStatement = con.prepareStatement(query);

preparedStatement.setString(1, "Fulfilled");
preparedStatement.setInt(2, ID);

preparedStatement.executeUpdate();
        
       
       
          
           
       }
      
        
    }
}catch(Exception e){ System.out.println(e);} 
              }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
      
      
        int ID=0;
        try{  
          try { 
              
        ID=Integer.parseInt(jTextField1.getText());
    } catch(NumberFormatException e) { 
        JOptionPane.showMessageDialog(null,"Enter a valid booking ID");
    }
              DefaultTableModel model = (DefaultTableModel) jTable1.getModel();   
              model.setRowCount(0);
Class.forName("com.mysql.jdbc.Driver");  

    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/paradisemarquee","root","")) {
       
        Statement stmt=con.createStatement();
    
           ResultSet rs;
//            if(dateselected==true){
//              rs=stmt.executeQuery("select * from booking where booking_id='"+ID+"' AND date='"+newDate+"' ");
//            }
//            else 
                  rs=stmt.executeQuery("select * from booking where booking_id='"+ID+"'");
        
            
            
            Vector row=new Vector();
        
        while(rs.next()){
            
        row.add(0,rs.getInt(1));
        row.add(1,rs.getInt(2));
        row.add(2,rs.getString(3));
        row.add(3,rs.getString(4));
        row.add(4,rs.getString(5));
        row.add(5,rs.getString(6));
        row.add(6,rs.getString(7));
        row.add(7,rs.getInt(8));
        row.add(8,rs.getString(9));
         model.addRow(new Object[]{row.get(0), row.get(1), row.get(2),row.get(3),row.get(4),row.get(5),row.get(6),row.get(7),row.get(8)});
           
            
        }
        
    }
}catch(Exception e){ System.out.println(e);} 
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
           try{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            User obj=User.getInstance();
            int userID=obj.ID;
            Class.forName("com.mysql.jdbc.Driver");
            
            try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/paradisemarquee","root","")) {

            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("select * from booking order by date DESC");

            Vector row=new Vector();
                
            while(rs.next()){

                row.add(0,rs.getInt(1));
                row.add(1,rs.getInt(2));
                row.add(2,rs.getString(3));
                row.add(3,rs.getString(4));
                row.add(4,rs.getString(5));
                row.add(5,rs.getString(6));
                row.add(6,rs.getString(7));
                row.add(7,rs.getInt(8));
                row.add(8,rs.getString(9));
                model.addRow(new Object[]{row.get(0), row.get(1), row.get(2),row.get(3),row.get(4),row.get(5),row.get(6),row.get(7),row.get(8)});

            }

        }
        }catch(Exception e){ System.out.println(e);}
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed

      this.setVisible(false);
       Authentication frame2=new Authentication();
        frame2.setVisible(true);

    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jDateChooser3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser3PropertyChange
     
    }//GEN-LAST:event_jDateChooser3PropertyChange

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
       
        String newDate= new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser3.getDate());
              if (newDate==""){
     
               JOptionPane.showMessageDialog(null,"Select a Date");
          }
              else {
                  
               try{  
 
              DefaultTableModel model = (DefaultTableModel) jTable1.getModel();   
              model.setRowCount(0);
Class.forName("com.mysql.jdbc.Driver");  

    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/paradisemarquee","root","")) {
       
        Statement stmt=con.createStatement();
    
           ResultSet rs;
//            if(dateselected==true){
//              rs=stmt.executeQuery("select * from booking where booking_id='"+ID+"' AND date='"+newDate+"' ");
//            }
//            else 
                  rs=stmt.executeQuery("select * from booking where date='"+newDate+"'");
        
            
            
            Vector row=new Vector();
        
        while(rs.next()){
            
        row.add(0,rs.getInt(1));
        row.add(1,rs.getInt(2));
        row.add(2,rs.getString(3));
        row.add(3,rs.getString(4));
        row.add(4,rs.getString(5));
        row.add(5,rs.getString(6));
        row.add(6,rs.getString(7));
        row.add(7,rs.getInt(8));
        row.add(8,rs.getString(9));
         model.addRow(new Object[]{row.get(0), row.get(1), row.get(2),row.get(3),row.get(4),row.get(5),row.get(6),row.get(7),row.get(8)});
           
            
        }
        
    }
}catch(Exception e){ System.out.println(e);} 
              }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
       jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
      
      
        int ID=0;
        try{  
          try { 
              
        ID=Integer.parseInt(jTextField2.getText());
    } catch(NumberFormatException e) { 
        JOptionPane.showMessageDialog(null,"Enter a valid User ID");
    }
              DefaultTableModel model = (DefaultTableModel) jTable1.getModel();   
              model.setRowCount(0);
Class.forName("com.mysql.jdbc.Driver");  

    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/paradisemarquee","root","")) {
       
        Statement stmt=con.createStatement();
    
           ResultSet rs;
//            if(dateselected==true){
//              rs=stmt.executeQuery("select * from booking where booking_id='"+ID+"' AND date='"+newDate+"' ");
//            }
//            else 
                  rs=stmt.executeQuery("select * from booking where user_id='"+ID+"'");
        
            
            
            Vector row=new Vector();
        
        while(rs.next()){
            
        row.add(0,rs.getInt(1));
        row.add(1,rs.getInt(2));
        row.add(2,rs.getString(3));
        row.add(3,rs.getString(4));
        row.add(4,rs.getString(5));
        row.add(5,rs.getString(6));
        row.add(6,rs.getString(7));
        row.add(7,rs.getInt(8));
        row.add(8,rs.getString(9));
         model.addRow(new Object[]{row.get(0), row.get(1), row.get(2),row.get(3),row.get(4),row.get(5),row.get(6),row.get(7),row.get(8)});
           
            
        }
        
    }
}catch(Exception e){ System.out.println(e);} 
    }//GEN-LAST:event_jButton23ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton5;
    // End of variables declaration//GEN-END:variables
}
