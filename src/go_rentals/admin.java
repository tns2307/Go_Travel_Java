/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package go_rentals;

import go_rentals.KoneksiDB.con;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author USER-ACER-PC
 */
public class admin extends javax.swing.JFrame {
ResultSet resultset;
    Statement statement;
    KoneksiDB con;
    private server m;
    /**

     */
    public admin() {
          initComponents();
        con = new KoneksiDB();
          m=new server();setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        adminadmin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        back = new javax.swing.JButton();
        adminsign = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\X\\Music\\pbo\\Go Rentals logo.JPG")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("MENU"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("DaunPenh", 1, 36)); // NOI18N
        jLabel3.setText("ADMIN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        adminadmin.setForeground(new java.awt.Color(102, 102, 102));
        adminadmin.setText("LOG IN");
        adminadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminadminActionPerformed(evt);
            }
        });
        jPanel2.add(adminadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, -1));

        jLabel5.setText("Terima Rental Motor , ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel6.setText("Jl.Danau Buatan, Kota Malang");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel7.setText("085 908 890 098");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 190, -1));
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, -1));

        back.setForeground(new java.awt.Color(102, 102, 102));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 190, -1));

        adminsign.setForeground(new java.awt.Color(102, 102, 102));
        adminsign.setText("SIGN UP");
        adminsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminsignActionPerformed(evt);
            }
        });
        jPanel2.add(adminsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 190, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 210, 370));

        jLabel9.setText("\"Jangan malu, jangan risau ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel8.setText("kami selalu ada disini :)\"");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void adminadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminadminActionPerformed
 try{
    String sql = "SELECT * FROM tb_admin WHERE user= '"+username.getText()+"' and pass = '"+String.valueOf(password.getPassword())+"'";
    statement = con.connection.createStatement();
    resultset = statement.executeQuery(sql);
    if(resultset.next()){    
        variabel.user = resultset.getString(1);
        String password = resultset.getString(2);
  
        
        JOptionPane.showMessageDialog(null, "Login Berhasil");
    
 new server().show();
dispose();  

    }else{
        JOptionPane.showMessageDialog(null, "Gagal Login","Pesan",JOptionPane.ERROR_MESSAGE);
        new admin().show();
dispose(); 
    }
  }catch(Exception e){
      JOptionPane.showMessageDialog(null, e.getMessage(),"Pesan",JOptionPane.ERROR_MESSAGE);
  }
      
        this.dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_adminadminActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
  new home().show();
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void adminsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminsignActionPerformed
     if ("".equals(username.getText()) || "".equals(password.getText())){
JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);



}else{
    String SQL = "INSERT INTO tb_admin (user,pass)"+
            "VALUES('"+username.getText()+"','"+password.getText()+"')";
int status = KoneksiDB.execute(SQL);
if(status == 1){
    JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan","Sukses", JOptionPane.INFORMATION_MESSAGE);
    selectData();
}else{
    JOptionPane.showMessageDialog(this,"Data gagal ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
}} // TODO add your handling code here:
    }//GEN-LAST:event_adminsignActionPerformed
    
     public void selectData(){
        String kolom[] = {"user","pass"};
           //To change body of generated methods, choose Tools | Templates.
        String SQL = "SELECT * FROM tb_admin";
       
        
  
        
    
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminadmin;
    private javax.swing.JButton adminsign;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
