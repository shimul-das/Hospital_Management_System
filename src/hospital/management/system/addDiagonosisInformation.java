/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;
//import Project.ConnectionProvider;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class addDiagonosisInformation extends javax.swing.JFrame {

    private int flag;
    

  //public int flag=0;
    public addDiagonosisInformation() {
        initComponents();
        jLabel1.setVisible(false);
        jLabel7.setVisible(false);
        jComboBox1.setVisible(false);
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PatientTI does not exit!!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 104, -1, 29));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 67, 100, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/search.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 64, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, 740, 43));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("PatientID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 64, -1, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Symptoms:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Diagonosis:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 293, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Medicines:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 333, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 246, 220, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 290, 220, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 330, 220, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Ward Required?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 249, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Type of Ward");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 333, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jCheckBox1.setText("YES");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 245, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Singe", "Duo" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 330, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/save-icon--1.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 443, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/rsz_close1.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/add new patient background.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
        jLabel7.setVisible(true);
        jComboBox1.setVisible(true);
        }
        else{
        jLabel7.setVisible(false);
        jComboBox1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int flag=0;
        String url="jdbc:mysql://localhost:3306/mysql?useSSL=true";
        String user="root";
        String pass="1315418698";
        String patientID=jTextField1.getText();
       try{
       class.forName("com.mysql.jdbc.Driver");
       Connection conn=DriverManager.getConnection(url,user,pass);
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select *from patient1 where patientID='"+patientID+"'");
       jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        if(rs.next())
            jLabel1.setVisible(true);
        else{
            jLabel1.setVisible(false);
            jTextField1.setEditable(false);
            flag=1;
            JOptionPane.showMessageDialog(null,"Find data!");
        }
            
      }
      catch(Exception e){
      JOptionPane.showMessageDialog(null,"Connection Error!");
      }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String url="jdbc:mysql://localhost:3306/mysql?useSSL=true";
     String user="root";
     String pass="1315418698";
        
     if(flag==0){
     String patientID=jTextField1.getText();
     String symptom=jTextField2.getText();
     String diagonosis=jTextField3.getText();
     String medicines=jTextField4.getText();
     String warReq;
     String typeWard;
     if(jCheckBox1.isSelected()){
     warReq="YES";
     typeWard=(String)jComboBox1.getSelectedItem();
     }
     else{
     warReq="NO";
     typeWard="";
     }
     try{
         class.forName("com.mysql.jdbc.Driver");
       Connection conn=DriverManager.getConnection(url,user,pass);
       Statement st=conn.createStatement();
       st.executeUpdate("insert into patientreport1 values('"+patientID+"','"+symptom+"','"+diagonosis+"','"+medicines+"','"+warReq+"','"+typeWard+"')");
       JOptionPane.showMessageDialog(null,"Update Successfully");
       setVisible(false);
       new addDiagonosisInformation().setVisible(true);
       
     
     }
     catch(Exception e){
     JOptionPane.showMessageDialog(this,e);
     }
     
     } 
else 
         JOptionPane.showMessageDialog(null,"PatientID Field is empty!");
      
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(addDiagonosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDiagonosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDiagonosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDiagonosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new addDiagonosisInformation().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
