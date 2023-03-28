/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management_system.adminForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import student_result_management_system.AdminCreatePage;
import student_result_management_system.AdminIndex;

/**
 *
 * @author RaviRaj
 */
public class AdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     */
    public AdminHome() {
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

        jLabel1 = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        showPasswordButton = new javax.swing.JButton();
        passwordNameLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DALL·E 2023-03-26 13.22.39 - fairy land.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameLabel.setBackground(new java.awt.Color(204, 255, 255));
        userNameLabel.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(204, 255, 204));
        userNameLabel.setText("User Name ");
        getContentPane().add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 110, 20));

        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 248, -1));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 248, -1));

        loginButton.setBackground(new java.awt.Color(204, 255, 204));
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon/icons8-enter-30.png"))); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 109, 40));

        backButton.setBackground(new java.awt.Color(255, 153, 153));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon/icons8-back-arrow-30.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 110, 40));

        showPasswordButton.setText("Show Password");
        showPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(showPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        passwordNameLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        passwordNameLabel1.setForeground(new java.awt.Color(204, 255, 255));
        passwordNameLabel1.setText("Password");
        getContentPane().add(passwordNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 90, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon/icons8-add-user-male-32.png"))); // NOI18N
        jButton1.setText("Register New Admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 190, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/abc.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        var userName = userNameTextField.getText();
        var password = passwordField.getText();
        
        // JDBC driver name and database URL
        final String JDBC_DRIVER = "org.postgresql.Driver";
        final String DB_URL = "jdbc:postgresql://localhost:5432/student_result_management_system";

        // Database credentials
        final String USER = "postgres";
        final String PASS = "postgres";

        Connection con = null;
        ResultSet rs = null;
        Statement st = null;

        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, USER,PASS);

            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM admin where username = '" +userName+ "'");
            
            if(rs.next()){
                if(!rs.getString("pass").equals(password)) {
                    JOptionPane.showMessageDialog(null, "Wrong Password!!!");
                } else {
                    setVisible(false);
                    new Index().setVisible(true);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Wrong user name !!!");
            }          
                        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {

            // Close the connection
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException se) {
                JOptionPane.showMessageDialog(null, se.toString());
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminIndex().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void showPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordButtonActionPerformed
        // TODO add your handling code here:
        var password = passwordField.getPassword();
        var toStrPass = new String(password);
        JOptionPane.showMessageDialog(null, "Entered Password is :" + toStrPass);
    }//GEN-LAST:event_showPasswordButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        var user = JOptionPane.showInputDialog( "Enter Super User Name");
        if (user.equals("admin")) {
            var pass = JOptionPane.showInputDialog( "Enter Super User Password");
            if (pass.equals("1234")) {
                setVisible(false);
                new AdminCreatePage().setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Username");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordNameLabel1;
    private javax.swing.JButton showPasswordButton;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}