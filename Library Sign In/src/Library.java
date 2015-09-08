import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Library extends javax.swing.JFrame {
    static String password;
    static String fileName = "passwod.txt";
    static String ideasName = "ideas.txt";
    static String studentName;
    
    public Library() {
        initComponents();
        //int day = cal.get(Calendar.DAY_OF_MONTH);
        //int minute = cal.get(Calendar.SECOND);
        //System.out.println(day);
        //System.out.println(minute);
        clock();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        btnSettings = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblSignIn = new javax.swing.JButton();
        lblPrd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setFont(new java.awt.Font("Quartz", 1, 48)); // NOI18N
        lblHeader.setText("ELKHORN SOUTH LIBRARY SIGN IN");
        lblHeader.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(0, 0, 204), null, null));

        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settings.png"))); // NOI18N
        btnSettings.setBorder(null);
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });

        lblTime.setFont(new java.awt.Font("Quartz", 1, 28)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 0, 204));
        lblTime.setText("jLabel1");

        lblDate.setFont(new java.awt.Font("Quartz", 1, 36)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 0, 255));
        lblDate.setText("jLabel1");

        lblSignIn.setBackground(new java.awt.Color(51, 51, 255));
        lblSignIn.setFont(new java.awt.Font("Quartz", 1, 36)); // NOI18N
        lblSignIn.setForeground(new java.awt.Color(255, 255, 51));
        lblSignIn.setText("Sign In");
        lblSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSignInActionPerformed(evt);
            }
        });

        lblPrd.setFont(new java.awt.Font("Quartz", 1, 24)); // NOI18N
        lblPrd.setText("Period _ Ends in _ minutes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(495, 495, 495)
                .addComponent(lblTime)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDate)
                                .addGap(436, 436, 436))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHeader)
                                .addGap(90, 90, 90)
                                .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrd)
                            .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(368, 368, 368))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader))
                .addGap(18, 18, 18)
                .addComponent(lblDate)
                .addGap(16, 16, 16)
                .addComponent(lblTime)
                .addGap(18, 18, 18)
                .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPrd)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        try {
            getPassword("Enter the password", 1);
        } catch (IOException ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
        File file = new File(fileName);
        long fLength = file.length();
        System.out.println(file.length());
        
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void lblSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblSignInActionPerformed
        studentName = JOptionPane.showInputDialog(null, "Enter your name");
        Date date = new Date();
        File file = new File("report.txt");
        PrintWriter writer;
        try {
            writer = new PrintWriter(new FileWriter(file, true)); 
            writer.println(studentName+"     Date: "+ date);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_lblSignInActionPerformed

    public static boolean fileHasPW() throws FileNotFoundException, IOException{
        
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        if(br.readLine()!=null){
            
            return true;
            
        }
        else
            return false;
    }
    
    public static void getPassword(String message, int version) throws FileNotFoundException, IOException{
        if(!fileHasPW()){
            password = JOptionPane.showInputDialog(null, "Enter new password:");
            try {
                //print password to file
                PrintWriter writer = new PrintWriter("passwod.txt", "UTF-8");
                writer.print(password);
                writer.close();//successfully writes password
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            
            String enteredPW = JOptionPane.showInputDialog(null, message);
            BufferedReader brTest = new BufferedReader(new FileReader(fileName));
            String pw1 = brTest.readLine();
            if(enteredPW.equals(pw1)){
                JOptionPane.showMessageDialog(null, "Access Granted");
                Settings st = new Settings();
                if(version==1){
                    st.setVisible(true);
                }
                if(version==0){
                    String newPW = JOptionPane.showInputDialog(null, "Enter new password");
                    resetPW(newPW);
                }
            }
            else
                JOptionPane.showMessageDialog(null, "Access Denied");
        }
    }
    
    public static void resetPW(String newPW){
        PrintWriter writer;
        try {
            writer = new PrintWriter(fileName, "UTF-8");
            writer.print("");
            writer.print(newPW);
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void clock(){
        //uses thread to show current time and date
        Thread clock = new Thread(){
            @Override
            public void run(){
                    try {
                        while(true){
                            Calendar cal = new GregorianCalendar();
                            int day = cal.get(Calendar.DAY_OF_MONTH);
                            int monthA = cal.get(Calendar.MONTH);
                            int month = monthA + 1;
                            int year = cal.get(Calendar.YEAR);

                            int hour = cal.get(Calendar.HOUR);
                            int minute = cal.get(Calendar.MINUTE);
                            int second = cal.get(Calendar.SECOND);
                            
                            int minsleft = 0;
                            lblDate.setText(month + "/" + day + "/" + year);
                            lblTime.setText(hour + ":" + minute + ":" + second);
                            if(hour==8 && minute>9 && minute<=59){
                               minsleft = 60-minute;
                               lblPrd.setText("Period 1 ends in " + minsleft + " minutes");
                            }
                            sleep(1000);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
                    } 
            }
        };
        clock.start();
    }
    
    
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
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSettings;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPrd;
    private javax.swing.JButton lblSignIn;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables
}
