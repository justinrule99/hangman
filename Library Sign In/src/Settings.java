
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    public Settings() {
        initComponents();
        lblSDate.setText(Library.fmdy);
        //ideas: Create formatted reports with date on them, create new file for every day, terminate files every 30 days
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSeeReport = new javax.swing.JButton();
        btnChgPW = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        chkView = new javax.swing.JCheckBox();
        chkDelete = new javax.swing.JCheckBox();
        btnGoToday = new javax.swing.JButton();
        lblSDate = new javax.swing.JLabel();
        btnDatePick = new javax.swing.JButton();
        jdt1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");

        btnSeeReport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSeeReport.setText("View Old Reports");
        btnSeeReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeReportActionPerformed(evt);
            }
        });

        btnChgPW.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChgPW.setText("Change Password");
        btnChgPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChgPWActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setText("Delete Old Reports");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        chkView.setText("View");

        chkDelete.setText("Delete");

        btnGoToday.setText("Today's Reports");
        btnGoToday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoTodayActionPerformed(evt);
            }
        });

        lblSDate.setText("text");

        btnDatePick.setText("Go");
        btnDatePick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDatePickMouseClicked(evt);
            }
        });
        btnDatePick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatePickActionPerformed(evt);
            }
        });

        jdt1.setMaxSelectableDate(new java.util.Date(1893481317000L));
        jdt1.setMinSelectableDate(new java.util.Date(1441087317000L));

        jLabel1.setText("Enter a Date to View its Reports");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeeReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(btnChgPW)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDatePick))
                    .addComponent(jdt1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSDate)
                            .addComponent(btnGoToday))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSeeReport)
                    .addComponent(btnChgPW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(68, 68, 68)
                .addComponent(lblSDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGoToday)
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkView)
                    .addComponent(chkDelete)
                    .addComponent(btnDatePick))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChgPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChgPWActionPerformed
        Library lib = new Library();
        try {
            lib.getPassword("Enter old password",0);
        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnChgPWActionPerformed

    private void btnSeeReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeReportActionPerformed
        JPanel mainPanel = new JPanel();//use JDatePicker instead
        mainPanel.setSize(300,300);
        mainPanel.setBackground(Color.RED);
        mainPanel.setLayout(new GridLayout(5,7,5,10));
        mainPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        JFrame showReports = new JFrame();
        showReports.setLocationRelativeTo(null);
        showReports.setSize(600,400);
        showReports.setVisible(true);
        showReports.setTitle("View Sign In Reports");
        JButton btnShow = new JButton("Hi");
        //btnShow.setPreferredSize(new Dimension(100, 100));
        btnShow.setLayout(null);
        btnShow.setBounds(100,100,200,200);
        
        JButton btnShow2 = new JButton("Hdi");
        //btnShow.setPreferredSize(new Dimension(100, 100));
        btnShow2.setLayout(null);
        
        btnShow2.setBounds(100,100,200,200);
        for (int i = 0; i <32; i++) {
            JButton btn = new JButton("btn"+i);
            btn.setBackground(Color.green);
            
            btn.setHorizontalAlignment(JButton.RIGHT);
            mainPanel.add(btn);
            
        }
        openFile(Library.mdy);
        //mainPanel.add(btnShow);
        //mainPanel.add(btnShow2);
        showReports.add(mainPanel);
    }//GEN-LAST:event_btnSeeReportActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //bring list of dates, probably new form to delete certain files
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnGoTodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoTodayActionPerformed
        //if(chkView.isSelected()){
            openFile(Library.mdy);
        //}
    }//GEN-LAST:event_btnGoTodayActionPerformed

    private void btnDatePickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatePickMouseClicked
        String rawDay = Integer.toString(jdt1.getCalendar().get(Calendar.DAY_OF_MONTH));
        String rawMonth = Integer.toString(jdt1.getCalendar().get(Calendar.MONTH)+1);
        String rawYear = Integer.toString(jdt1.getCalendar().get(Calendar.YEAR));
        String selectMDY = rawMonth+rawDay+rawYear;
        System.out.println("You Selected: "+rawMonth+"/"+rawDay+"/"+rawYear);
        System.out.println(selectMDY);
        System.out.println(Library.mdy);
        
        if(!chkView.isSelected()&&!chkDelete.isSelected()){
            JOptionPane.showMessageDialog(null, "Please Check Either View or Delete");
        }
        if(chkView.isSelected()){
            openFile(selectMDY);
            
        }
    }//GEN-LAST:event_btnDatePickMouseClicked

    private void btnDatePickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatePickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDatePickActionPerformed

                                        

    
    public static void openFile(String name){
        Runtime rt = Runtime.getRuntime();
        String file = name;
        File today = new File(name);
        boolean fExists = today.exists();
        System.out.println(fExists);
        if(!fExists){//file.exists() is faulty
            System.out.println("that file doesnt exist");
            JOptionPane.showMessageDialog(null, "Either these records don't exist, or they were deleted");
        }
        try {
            Process p = rt.exec("notepad "+file);  
        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChgPW;
    private javax.swing.JButton btnDatePick;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGoToday;
    private javax.swing.JButton btnSeeReport;
    private javax.swing.JCheckBox chkDelete;
    private javax.swing.JCheckBox chkView;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JDateChooser jdt1;
    private javax.swing.JLabel lblSDate;
    // End of variables declaration//GEN-END:variables

}
