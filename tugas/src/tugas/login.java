/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        labeljudul = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        ButtonLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        labeljudul.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labeljudul.setForeground(new java.awt.Color(255, 255, 255));
        labeljudul.setText("SISTEM PENDATAAN OBAT");

        UsernameField.setBackground(new java.awt.Color(153, 255, 153));

        UsernameLabel.setBackground(new java.awt.Color(204, 204, 204));
        UsernameLabel.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password");

        PasswordField.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/img/rsz_o.jpg"))); // NOI18N

        ButtonLogin.setBackground(new java.awt.Color(153, 255, 153));
        ButtonLogin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ButtonLogin.setText("LOGIN");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/img/ijo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(labeljudul, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(UsernameLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(ButtonLogin))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(labeljudul)
                .addGap(18, 18, 18)
                .addComponent(UsernameLabel)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(ButtonLogin))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        // TODO add your handling code here:
        //        String kataSandi = new String(PasswordField.getPassword());
        //
        //       if((UsernameField.getText().equals("yaya"))&&(kataSandi.equals("12345"))){
            //            JOptionPane.showMessageDialog(this, "Anda berhasil login", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            //            new tampilan().setVisible(true); //untuk ngeset biar form tampilan nya nanti keluar
            //            this.dispose(); //nutup/keluar dari form ini karna maw ngebuka form lain
            //       }else{
            //           JOptionPane.showMessageDialog(this, "Maaf tidak berhasil login", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            //       }
        String kataSandi = new String(PasswordField.getPassword());
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/apotek_pbol?" +"user=root&passsword=");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT COUNT(*) FROM user WHERE username='"+UsernameField.getText()+"' and password='"+kataSandi+"'");
            rs = stmt.getResultSet();
            //ngambil nilainya
            rs.next();
            int ada = rs.getInt(1);
            if(ada==0){
                JOptionPane.showMessageDialog(this, "Username atau password salah!","Error Login!", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Berhasil Login!", "Login", JOptionPane.INFORMATION_MESSAGE);
                new tampilan().setVisible(true);
                this.dispose();
            }

            //gunakan variabel rs
        }
        catch (SQLException ex){
            //mengatasi error
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally{
            if(rs != null){
                try{
                    rs.close();
                } catch (SQLException sqlEx) { } //ignore

                rs = null;
            }

            if(stmt != null){
                try{
                    stmt.close();
                } catch (SQLException sqlEx) { } //ignore

                stmt = null;
            }
        }
    }//GEN-LAST:event_ButtonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labeljudul;
    // End of variables declaration//GEN-END:variables
}
