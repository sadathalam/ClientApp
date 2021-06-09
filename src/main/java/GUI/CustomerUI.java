/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Models.Customer;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mdala
 */
public class CustomerUI extends javax.swing.JFrame {

    Connection con; 
    int i;
    /**
     * Creates new form CustomerUI
     */
    public CustomerUI() {
        initComponents();
        this.officeLocation.add("Atlanta");
        this.officeLocation.add("Kennesaw");
        this.gender.add("M");
        this.gender.add("F");
        i = 0;
        createConnection();
        
    }
    
    public void createConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
             this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/drivingschool", "root", "sadath2010");
             System.out.println("connected");
            
        }catch (Exception ex){
            ex.getMessage();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jButton1 = new javax.swing.JButton();
        customerLabel = new javax.swing.JLabel();
        customerNum = new javax.swing.JTextField();
        fNameLabel = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        lNameLabel = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        officeLabel = new javax.swing.JLabel();
        officeLocation = new java.awt.Choice();
        add = new javax.swing.JButton();
        gender = new java.awt.Choice();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayMessage = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        customerLabel.setText("Customer Number");

        customerNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNumActionPerformed(evt);
            }
        });

        fNameLabel.setText("First Name");

        lNameLabel.setText("Last Name");

        ageLabel.setText("Age");

        genderLabel.setText("Gender");

        addressLabel.setText("Address");

        officeLabel.setText("Office");

        officeLocation.setName(""); // NOI18N

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        gender.setName(""); // NOI18N

        displayMessage.setColumns(20);
        displayMessage.setRows(5);
        jScrollPane1.setViewportView(displayMessage);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ageLabel)
                        .addGap(149, 149, 149)
                        .addComponent(age))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addressLabel)
                                    .addGap(123, 123, 123))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(officeLabel)
                                    .addGap(137, 137, 137)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genderLabel)
                                .addGap(130, 130, 130)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(officeLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerLabel)
                                    .addComponent(fNameLabel)
                                    .addComponent(lNameLabel))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerNum, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add)
                                .addGap(47, 47, 47)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerLabel)
                    .addComponent(customerNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameLabel)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderLabel)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(officeLabel)
                    .addComponent(officeLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNumActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String officeID = "";
        if(officeLocation.getSelectedItem().equals("Atlanta")){
            officeID = "000001";
            
        }else{
            officeID = "000002";
        }
        
       Customer customer = new Customer(customerNum.getText(),fName.getText(),lname.getText(),Integer.parseInt(age.getText()),gender.getSelectedItem(),address.getText(),officeID);
       
       try {
            Statement statement = con.createStatement();
            String insertCommand = "INSERT INTO CUSTOMER VALUES('" +customer.getCustomerNum()+ "','" + customer.getfName() + "','" + customer.getlName() + "','"+ customer.getAge() + "','" + customer.getGender() + "','" + customer.getAddress() + "','"+customer.getOfficeId()+"')";
            statement.execute(insertCommand);
            i++;
            statement.close();
            displayMessage.setText(i + " Student(s) added");
            customerNum.setText("");
            fName.setText("");
            lname.setText("");
            age.setText("");
            address.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(CustomerUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String officeID = "";
        if(officeLocation.getSelectedItem().equals("Atlanta")){
            officeID = "000001";
            
        }else{
            officeID = "000002";
        }
        try {
            // TODO add your handling code here:
           String update = "UPDATE customer SET fname=?, lname=?, age=?, gender=?, address=?, office_id=? WHERE customer_number=?";
            PreparedStatement pst = con.prepareStatement(update);
           pst.setString(1, fName.getText());
            pst.setString(2, lname.getText());
             pst.setInt(3, Integer.parseInt(age.getText()));
              pst.setString(4, gender.getSelectedItem());
               pst.setString(5, address.getText());
                pst.setString(6, officeID);
                pst.setString(7, customerNum.getText());
                pst.executeUpdate();
             customerNum.setText("");
            fName.setText("");
            lname.setText("");
            age.setText("");
            address.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(CustomerUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

     public void close(){
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
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
            java.util.logging.Logger.getLogger(CustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField age;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JTextField customerNum;
    private javax.swing.JTextArea displayMessage;
    private javax.swing.JTextField fName;
    private javax.swing.JLabel fNameLabel;
    private java.awt.Choice gender;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel officeLabel;
    private java.awt.Choice officeLocation;
    // End of variables declaration//GEN-END:variables
}
