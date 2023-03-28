/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management_system.adminForm;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author RaviRaj
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Index() {
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

        Gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        insertNewResultButton = new javax.swing.JButton();
        registeredStudentsButton = new javax.swing.JButton();
        allStudentResultButton = new javax.swing.JButton();
        addNewStudentButton3 = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        courseNameLabel = new javax.swing.JLabel();
        branchNameLabel = new javax.swing.JLabel();
        rollNumberLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        fatherNameLabel = new javax.swing.JLabel();
        courseComboBox = new javax.swing.JComboBox<>();
        branchComboBox = new javax.swing.JComboBox<>();
        rollTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        fatherTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        insertNewResultButton.setText("Insert New Result");
        insertNewResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNewResultButtonActionPerformed(evt);
            }
        });

        registeredStudentsButton.setText("Registered Students");
        registeredStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredStudentsButtonActionPerformed(evt);
            }
        });

        allStudentResultButton.setText("All Student Result");
        allStudentResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudentResultButtonActionPerformed(evt);
            }
        });

        addNewStudentButton3.setBackground(new java.awt.Color(153, 255, 153));
        addNewStudentButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addNewStudentButton3.setText("Add New Student");
        addNewStudentButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudentButton3ActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(255, 204, 204));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 51, 51));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon/icons8-log-out-30.png"))); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertNewResultButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registeredStudentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(allStudentResultButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(logoutButton)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(addNewStudentButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(insertNewResultButton)
                .addGap(47, 47, 47)
                .addComponent(registeredStudentsButton)
                .addGap(44, 44, 44)
                .addComponent(allStudentResultButton)
                .addGap(56, 56, 56)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(addNewStudentButton3)
                    .addContainerGap(381, Short.MAX_VALUE)))
        );

        courseNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        courseNameLabel.setText("Course Name");

        branchNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        branchNameLabel.setText("Branch Name");

        rollNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rollNumberLabel.setText("Roll Number");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Full Name");
        jLabel1.setToolTipText("");

        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        genderLabel.setText("Gender");

        fatherNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fatherNameLabel.setText("Father's Name");

        courseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTech", "MTech", "BBA", "MBA" }));

        branchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE ", "IT ", "ECE", "EEE" }));

        rollTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollTextFieldActionPerformed(evt);
            }
        });

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(204, 255, 153));
        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon/icons8-submit-progress-32.png"))); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        Gender.add(maleRadioButton);
        maleRadioButton.setText("Male");

        Gender.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(courseNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(branchNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rollNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fatherNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(courseComboBox, 0, 118, Short.MAX_VALUE)
                                .addComponent(branchComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rollTextField)
                                .addComponent(nameTextField)
                                .addComponent(fatherTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maleRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(femaleRadioButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseNameLabel)
                    .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branchNameLabel)
                    .addComponent(branchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rollNumberLabel)
                    .addComponent(rollTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatherNameLabel)
                    .addComponent(fatherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertNewResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNewResultButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new InsertResult().setVisible(true);
    }//GEN-LAST:event_insertNewResultButtonActionPerformed

    private void registeredStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredStudentsButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new RegisteredStudent().setVisible(true);
    }//GEN-LAST:event_registeredStudentsButtonActionPerformed

    private void allStudentResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentResultButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AllStudentsResult().setVisible(true);
    }//GEN-LAST:event_allStudentResultButtonActionPerformed

    private void addNewStudentButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudentButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Index().setVisible(true);
    }//GEN-LAST:event_addNewStudentButton3ActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        var course = (String)courseComboBox.getSelectedItem();
        var branch = (String)branchComboBox.getSelectedItem();
        var rollNo = rollTextField.getText();
        var name = nameTextField.getText();
        var gender = maleRadioButton.isSelected() ? "Male" : "Female";
        var fatherName = fatherTextField.getText();
        
        // JDBC driver name and database URL
        final String JDBC_DRIVER = "org.postgresql.Driver";
        final String DB_URL = "jdbc:postgresql://localhost:5432/student_result_management_system";

        // Database credentials
        final String USER = "postgres";
        final String PASS = "postgres";

        Connection con = null;
        
        
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, USER,PASS);
            
            Statement st = con.createStatement();
            st.execute("INSERT INTO student(rollno, course, branch, fullname, gender, fathername) values('"+rollNo+"', '"+course+"', '"+branch+"', '"+name+"','"+gender+"', '"+fatherName+"')");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            
            // Close the connection
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException se) {
                JOptionPane.showMessageDialog(null, se.toString());
            }
        }
        JOptionPane.showMessageDialog(null, "Student Created Successfully !!!");
        setVisible(false);
        new Index().setVisible(true);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void rollTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rollTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JButton addNewStudentButton3;
    private javax.swing.JButton allStudentResultButton;
    private javax.swing.JComboBox<String> branchComboBox;
    private javax.swing.JLabel branchNameLabel;
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JLabel courseNameLabel;
    private javax.swing.JLabel fatherNameLabel;
    private javax.swing.JTextField fatherTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton insertNewResultButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton registeredStudentsButton;
    private javax.swing.JLabel rollNumberLabel;
    private javax.swing.JTextField rollTextField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
