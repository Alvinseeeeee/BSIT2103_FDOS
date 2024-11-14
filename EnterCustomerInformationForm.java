/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BSIT2103_FDOS;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import BSIT2103_FDOS.Control_Connector.DBConnect;
/**
 *
 * @author berna
 */
public class EnterCustomerInformationForm extends javax.swing.JFrame {
    
    Customer customer = new Customer();
    /**
     * Creates new form CustomerForm
     */
    public EnterCustomerInformationForm() {
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
        jPanel2 = new javax.swing.JPanel();
        FullNameLabel = new javax.swing.JLabel();
        customerFullNameField = new javax.swing.JTextField();
        customerEmailField = new javax.swing.JTextField();
        customerContactNoField = new javax.swing.JTextField();
        EmailAddressLabel = new javax.swing.JLabel();
        ContactNumberLabel = new javax.swing.JLabel();
        CustomerInformation = new javax.swing.JLabel();
        customerEnter = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        RestaurantNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(228, 224, 225));
        jPanel1.setPreferredSize(new java.awt.Dimension(415, 390));

        jPanel2.setBackground(new java.awt.Color(161, 138, 121));
        jPanel2.setPreferredSize(new java.awt.Dimension(301, 210));

        FullNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        FullNameLabel.setForeground(new java.awt.Color(100, 75, 57));
        FullNameLabel.setText("Full Name:");

        customerFullNameField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        customerFullNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerFullNameFieldActionPerformed(evt);
            }
        });

        customerEmailField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        customerEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerEmailFieldActionPerformed(evt);
            }
        });

        customerContactNoField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        customerContactNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerContactNoFieldActionPerformed(evt);
            }
        });

        EmailAddressLabel.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        EmailAddressLabel.setForeground(new java.awt.Color(100, 75, 57));
        EmailAddressLabel.setText("Email Address:");

        ContactNumberLabel.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        ContactNumberLabel.setForeground(new java.awt.Color(100, 75, 57));
        ContactNumberLabel.setText("Contact Number:");

        CustomerInformation.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustomerInformation.setForeground(new java.awt.Color(100, 75, 57));
        CustomerInformation.setText("CUSTOMER INFORMATION");

        customerEnter.setBackground(new java.awt.Color(228, 224, 225));
        customerEnter.setFont(new java.awt.Font("Century Gothic", 1, 8)); // NOI18N
        customerEnter.setForeground(new java.awt.Color(100, 75, 57));
        customerEnter.setText("ENTER");
        customerEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FullNameLabel)
                    .addComponent(customerContactNoField)
                    .addComponent(customerEmailField)
                    .addComponent(customerFullNameField)
                    .addComponent(EmailAddressLabel)
                    .addComponent(ContactNumberLabel)
                    .addComponent(CustomerInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(customerEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(CustomerInformation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FullNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerFullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailAddressLabel)
                .addGap(4, 4, 4)
                .addComponent(customerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(ContactNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerContactNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerEnter)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel5.setForeground(new java.awt.Color(161, 138, 121));
        jLabel5.setText("Enter Management Interface");

        jButton2.setForeground(new java.awt.Color(100, 75, 57));
        jButton2.setText("Log In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        RestaurantNameLabel.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        RestaurantNameLabel.setForeground(new java.awt.Color(100, 75, 57));
        RestaurantNameLabel.setText("Baggy's Diner");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(RestaurantNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(RestaurantNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerFullNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerFullNameFieldActionPerformed

    }//GEN-LAST:event_customerFullNameFieldActionPerformed

    private void customerEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerEnterActionPerformed
        
        String fullName = customerFullNameField.getText().trim();
        String email = customerEmailField.getText().trim();
        String contactNo = customerContactNoField.getText().trim();
        
        if(fullName.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill out Username");
        }
        else if(email.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill out Email");
        }
        else if(contactNo.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill out Contact Number");
        }
        else{
            customer.setFullName(fullName); 
            customer.setEmail(email);
            customer.setContactNo(contactNo);

            ReservationForm reserve = new ReservationForm();
            reserve.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_customerEnterActionPerformed

    /*private boolean insertCustomerInfoDB(String fullName, String Email, String contactNo){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try{
            connection = DBConnect.getDBConnect().getConnection();
            
            String sql = "INSERT INTO customers (fullName, email, contactNo) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, fullName);
            preparedStatement.setString(2, Email);
            preparedStatement.setString(3, contactNo);
            
            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0;
        }
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error has occurred while saving customer information");
            return false;
        }
        finally{
            try{
                if(preparedStatement != null) preparedStatement.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }*/
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LogInManagementForm managementlog = new LogInManagementForm();
        managementlog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void customerEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerEmailFieldActionPerformed

    private void customerContactNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerContactNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerContactNoFieldActionPerformed

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
            java.util.logging.Logger.getLogger(EnterCustomerInformationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterCustomerInformationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterCustomerInformationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterCustomerInformationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterCustomerInformationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContactNumberLabel;
    private javax.swing.JLabel CustomerInformation;
    private javax.swing.JLabel EmailAddressLabel;
    private javax.swing.JLabel FullNameLabel;
    private javax.swing.JLabel RestaurantNameLabel;
    private javax.swing.JTextField customerContactNoField;
    private javax.swing.JTextField customerEmailField;
    private javax.swing.JButton customerEnter;
    private javax.swing.JTextField customerFullNameField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
