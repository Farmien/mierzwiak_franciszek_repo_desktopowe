/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.home.mierzwiak.franciszek.rejestracjalogowanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frane
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
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

        jTabbedPane = new javax.swing.JTabbedPane();
        jPRejestracja = new javax.swing.JPanel();
        jLUsername = new javax.swing.JLabel();
        jTFUsername = new javax.swing.JTextField();
        jLEmail = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jLPassword = new javax.swing.JLabel();
        jLConfirmPassword = new javax.swing.JLabel();
        jPFPassword = new javax.swing.JPasswordField();
        jPFPConfirmPassword = new javax.swing.JPasswordField();
        JBRejestracja = new javax.swing.JButton();
        jLRejestracja = new javax.swing.JLabel();
        jLBlad = new javax.swing.JLabel();
        jPLogowanie = new javax.swing.JPanel();
        jLPassword2 = new javax.swing.JLabel();
        jTFEmail2 = new javax.swing.JTextField();
        jLEmail2 = new javax.swing.JLabel();
        jLLogowanie = new javax.swing.JLabel();
        jBZaloguj = new javax.swing.JButton();
        jPFPassword2 = new javax.swing.JPasswordField();
        jLBlad2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLUsername.setText("Username");

        jTFUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsernameActionPerformed(evt);
            }
        });

        jLEmail.setText("Email");

        jLPassword.setText("Password");

        jLConfirmPassword.setText("Confirm Password");

        JBRejestracja.setText("Rejestracja");
        JBRejestracja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRejestracjaActionPerformed(evt);
            }
        });

        jLRejestracja.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLRejestracja.setText("Rejestracja");
        jLRejestracja.setToolTipText("");

        javax.swing.GroupLayout jPRejestracjaLayout = new javax.swing.GroupLayout(jPRejestracja);
        jPRejestracja.setLayout(jPRejestracjaLayout);
        jPRejestracjaLayout.setHorizontalGroup(
            jPRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRejestracjaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPFPConfirmPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPFPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFUsername)
                    .addGroup(jPRejestracjaLayout.createSequentialGroup()
                        .addGroup(jPRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLUsername)
                            .addComponent(jLEmail)
                            .addComponent(jLPassword)
                            .addComponent(jLConfirmPassword)
                            .addComponent(jLRejestracja, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPRejestracjaLayout.createSequentialGroup()
                        .addComponent(JBRejestracja, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLBlad, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPRejestracjaLayout.setVerticalGroup(
            jPRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRejestracjaLayout.createSequentialGroup()
                .addComponent(jLRejestracja, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLConfirmPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFPConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLBlad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBRejestracja, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane.addTab("Rejestracja", jPRejestracja);

        jLPassword2.setText("Password");

        jTFEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmail2ActionPerformed(evt);
            }
        });

        jLEmail2.setText("Email");

        jLLogowanie.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLLogowanie.setText("Logowanie");
        jLLogowanie.setToolTipText("");

        jBZaloguj.setText("Zaloguj");
        jBZaloguj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBZalogujActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPLogowanieLayout = new javax.swing.GroupLayout(jPLogowanie);
        jPLogowanie.setLayout(jPLogowanieLayout);
        jPLogowanieLayout.setHorizontalGroup(
            jPLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLogowanieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFEmail2)
                    .addComponent(jPFPassword2)
                    .addGroup(jPLogowanieLayout.createSequentialGroup()
                        .addGroup(jPLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEmail2)
                            .addComponent(jLPassword2)
                            .addComponent(jLLogowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPLogowanieLayout.createSequentialGroup()
                        .addComponent(jBZaloguj, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLBlad2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPLogowanieLayout.setVerticalGroup(
            jPLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLogowanieLayout.createSequentialGroup()
                .addComponent(jLLogowanie, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLEmail2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLPassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLBlad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBZaloguj, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(167, 167, 167))
        );

        jTabbedPane.addTab("Logowanie", jPLogowanie);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsernameActionPerformed

    private void JBRejestracjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRejestracjaActionPerformed
        try {
            SprawdzankoRejestracji();
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBRejestracjaActionPerformed

    private void jTFEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmail2ActionPerformed

    private void jBZalogujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBZalogujActionPerformed

    }//GEN-LAST:event_jBZalogujActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }
    
    private void SprawdzankoRejestracji() throws IOException{
        //Sprawdzanie Username
        boolean usernamespr = true;
        String username = jTFUsername.getText();
        if(username.length() < 2 || username.length() > 20){
            usernamespr = false;
        }else{
            for(int i=0; i<username.length(); i++){
                char ch = username.charAt(i);
                if(ch < 'A' || ch > 'z'){
                    usernamespr = false;
                }
            }
        }
        
        //Sprawdzanie Email
        boolean emailspr = true;
        String email = jTFEmail.getText();
        if(email.contains("@")){
            String tab[] = email.split("@");
            if(tab[0] == "@"){
                emailspr = false;
            }else{
                for(int i=0; i<tab[0].length(); i++){
                    char ch = tab[0].charAt(i);
                    if(ch < 'A' || ch > 'z'){
                        emailspr = false;
                    }
                }
                if(tab[1].contains(".")){
                    String []tab2 = tab[1].split(".");
                    if(tab2[0].length() < 1 || tab2[1].length() < 1){
                        emailspr = true;
                    }
                }
            }
        }else{
            emailspr = false;
        }
        
        //Sprawdzanie Password
        boolean passwordspr = true;
        String password = String.valueOf(jPFPassword.getPassword());
        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            if(password.length() >= 4){
                if(!(ch >= 'A' && ch <= 'z' || ch >= '0' && ch <= '9')){
                    passwordspr = true;
                }else{
                    passwordspr = false;
                }
            }
        }
        //confirm password
        boolean cpasswordspr = true;
        String cpassword = String.valueOf(jPFPConfirmPassword.getPassword());
        if(cpassword.equals(password)){
            cpasswordspr = false;
        }else{
            cpasswordspr = true;
        }
        
        //bladzik
        String blad = "<html>";
        if(usernamespr == false){
            blad += "Niepoprawna nazwa uzytkownika ";
        }
        if(emailspr == false){
            blad += "Niepoprawny email ";
        }
        if(passwordspr == true){
            blad += "Niepoprawne haslo ";
        }
        if(passwordspr == true){
            blad += "Hasla sa rozne";
        }
        blad += "</html>";
        jLBlad.setText(blad);
        
        if(usernamespr == true && passwordspr == false && cpasswordspr == false){
            FileUtils stf = new FileUtils();
            String text = username+";"+email+";"+password;
            stf.saveToFile(text);
        }
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBRejestracja;
    private javax.swing.JButton jBZaloguj;
    private javax.swing.JLabel jLBlad;
    private javax.swing.JLabel jLBlad2;
    private javax.swing.JLabel jLConfirmPassword;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEmail2;
    private javax.swing.JLabel jLLogowanie;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLPassword2;
    private javax.swing.JLabel jLRejestracja;
    private javax.swing.JLabel jLUsername;
    private javax.swing.JPasswordField jPFPConfirmPassword;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JPasswordField jPFPassword2;
    private javax.swing.JPanel jPLogowanie;
    private javax.swing.JPanel jPRejestracja;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEmail2;
    private javax.swing.JTextField jTFUsername;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration//GEN-END:variables
}
