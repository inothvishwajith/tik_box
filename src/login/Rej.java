/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package login;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import connection.connection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Asus
 */
public class Rej extends javax.swing.JPanel {

    /**
     * Creates new form Rej
     */
    public Rej() {
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

        roundPanel2 = new com.raven.swing.RoundPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_FN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_LN = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_UN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField_PASS = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField_REPASS = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_ADDRESS = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonrej = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1101, 651));

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("First Name");
        roundPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 27, 130, -1));

        jTextField_FN.setBackground(new java.awt.Color(102, 102, 102));
        jTextField_FN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField_FN.setForeground(new java.awt.Color(204, 204, 204));
        jTextField_FN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FNActionPerformed(evt);
            }
        });
        roundPanel2.add(jTextField_FN, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 23, 394, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Last Name");
        roundPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 91, 130, -1));

        jTextField_LN.setBackground(new java.awt.Color(102, 102, 102));
        jTextField_LN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField_LN.setForeground(new java.awt.Color(204, 204, 204));
        jTextField_LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LNActionPerformed(evt);
            }
        });
        roundPanel2.add(jTextField_LN, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 87, 394, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Username");
        roundPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 151, 130, -1));

        jTextField_UN.setBackground(new java.awt.Color(102, 102, 102));
        jTextField_UN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField_UN.setForeground(new java.awt.Color(204, 204, 204));
        roundPanel2.add(jTextField_UN, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 147, 394, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password");
        roundPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 212, 130, -1));

        jPasswordField_PASS.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordField_PASS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        roundPanel2.add(jPasswordField_PASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 208, 394, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Retype PW");
        roundPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 275, 110, -1));

        jPasswordField_REPASS.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordField_REPASS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        roundPanel2.add(jPasswordField_REPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 275, 394, -1));

        jTextArea_ADDRESS.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea_ADDRESS.setColumns(20);
        jTextArea_ADDRESS.setRows(5);
        jScrollPane1.setViewportView(jTextArea_ADDRESS);

        roundPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 398, 394, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Address");
        roundPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 398, 96, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Type");
        roundPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 527, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));
        roundPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 538, 394, -1));

        jButtonrej.setBackground(new java.awt.Color(14, 246, 204));
        jButtonrej.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonrej.setText("Register");
        jButtonrej.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonrejMouseClicked(evt);
            }
        });
        jButtonrej.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonrejActionPerformed(evt);
            }
        });
        roundPanel2.add(jButtonrej, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 583, 394, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        roundPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 628, 394, -1));

        jPanel1.setBackground(new java.awt.Color(136, 151, 170));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Add New Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1213, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_FNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FNActionPerformed

    private void jTextField_LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LNActionPerformed

    private void jButtonrejMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonrejMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonrejMouseClicked
  // private JDateChooser jDateChooser_BDATE;
    private void jButtonrejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrejActionPerformed
     
  String jTextField_FNn = jTextField_FN.getText();
String jTextField_LNn = jTextField_LN.getText();
String jTextField_UNn = jTextField_UN.getText();
String jPasswordField_PASSs = jPasswordField_PASS.getText();
String jPasswordField_REPASSs = jPasswordField_REPASS.getText();
//Date dob = jDateChooser_BDATE.getDate();
String jTextArea_ADDRESSs = jTextArea_ADDRESS.getText();
String comboBoxSelectedItem = (String) jComboBox1.getSelectedItem();

// Check if passwords match
if (!jPasswordField_PASSs.equals(jPasswordField_REPASSs)) {
    JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
    return; // Exit the method without proceeding further
}

// TODO add your handling code here:
try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tinvat", "tinvat", "123456")) {
    // SQL query to insert data into the company table
    String sql = "INSERT INTO log (fn, ln, un, pw, rpw, address, type) VALUES (?, ?, ?, ?, ?, ?, ?)";
    String u_pass = encryptPassword(jPasswordField_PASSs);
    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        // Set values for the parameters
        preparedStatement.setString(1, (jTextField_FNn.isEmpty() ? null : jTextField_FNn));
        preparedStatement.setString(2, jTextField_LNn);
        preparedStatement.setString(3, (jTextField_UNn.isEmpty() ? null : jTextField_UNn));
        preparedStatement.setString(4, (jPasswordField_PASSs.isEmpty() ? null : u_pass));
        preparedStatement.setString(5, (jPasswordField_REPASSs.isEmpty() ? null : jPasswordField_REPASSs));

        // Convert java.util.Date to java.sql.Date
        

        preparedStatement.setString(6, jTextArea_ADDRESSs);
        preparedStatement.setString(7, comboBoxSelectedItem);

        // Execute the query
        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Company data saved successfully!");
            jTextField_FN.setText("");
            jTextField_LN.setText("");
              jTextField_UN.setText("");
             jPasswordField_PASS.setText("");
              jPasswordField_REPASS.setText("");
                      // jDateChooser_BDATE.setDate(null); // If using JDateChooser, set the date to null
                     jTextArea_ADDRESS.setText("");
                     jComboBox1.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to save company data.");
        }
    }
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_jButtonrejActionPerformed
public static String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            // Handle the exception if necessary
        }
        return null; // Return null in case of an error
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonrej;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_PASS;
    private javax.swing.JPasswordField jPasswordField_REPASS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_ADDRESS;
    private javax.swing.JTextField jTextField_FN;
    private javax.swing.JTextField jTextField_LN;
    private javax.swing.JTextField jTextField_UN;
    private com.raven.swing.RoundPanel roundPanel2;
    // End of variables declaration//GEN-END:variables
}
