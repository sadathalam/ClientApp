/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import Models.InstructorEarning;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mdala
 */
public class InstructorEarningUI extends javax.swing.JFrame {
    

    /**
     * Creates new form InstructorEarningUI
     */
    
    Connection con;
    public InstructorEarningUI() {
        initComponents();
        createConnection();
        displayToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Office Location", "Income"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InstructorEarningUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructorEarningUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructorEarningUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructorEarningUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructorEarningUI().setVisible(true);
            }
        });
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
    public ArrayList<InstructorEarning> userList(){
        ArrayList<InstructorEarning> userList = new ArrayList<>();
        try { 
            Statement stmt = con.createStatement();
            String query = "select x.fname as employee_fname, x.lname as employee_lname, o.address as office_location, ((x.total * i.commission)/100) as income\n" +
"from(\n" +
"select o.employee_id, e.fname, e.lname,sum(price) as total, e.office_id \n" +
"from orders o, employee e, services s\n" +
"where o.employee_id = e.employee_id AND o.service_id = s.service_id \n" +
"group by o.employee_id\n" +
") as x, instructor i, office as o\n" +
"where i.employee_id = x.employee_id AND o.office_id = x.office_id ";
            ResultSet rs = stmt.executeQuery(query);
           InstructorEarning instructorEarning;
            while(rs.next()){
                instructorEarning = new InstructorEarning(rs.getString("employee_fname"),rs.getString("employee_lname"),rs.getString("office_location"),rs.getInt("income"));
                userList.add(instructorEarning);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GrossEarningUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userList; 
    }
    
    public void displayToTable(){
        ArrayList<InstructorEarning> list = userList();
        DefaultTableModel model =(DefaultTableModel) table.getModel();
        Object[] row = new Object[4];
        for(int i = 0; i< list.size(); i++){
            row[0] = list.get(i).getEmployeeFName();
            row[1] = list.get(i).getEmployeeLname();
             row[2] = list.get(i).getOfficeAddress();
              row[3] = list.get(i).getIncome();
            model.addRow(row);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
