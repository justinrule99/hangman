
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JColorChooser;

public class Draw extends javax.swing.JFrame {

    int timePressedWS = 0;
    int timePressedAD = 0;
    int[] currentPosition = {0,0};
    
    public Draw() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCursor = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btnChgColor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        pnlCursor.setBackground(new java.awt.Color(153, 255, 153));
        pnlCursor.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout pnlCursorLayout = new javax.swing.GroupLayout(pnlCursor);
        pnlCursor.setLayout(pnlCursorLayout);
        pnlCursorLayout.setHorizontalGroup(
            pnlCursorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlCursorLayout.setVerticalGroup(
            pnlCursorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenu4.setText("Save");
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        btnChgColor.setText("Change Color");
        btnChgColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChgColorActionPerformed(evt);
            }
        });
        jMenu2.add(btnChgColor);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCursor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(580, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCursor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(458, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChgColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChgColorActionPerformed
        Color c=JColorChooser.showDialog(this,"Choose a color",Color.WHITE);
        System.out.println(c);
        pnlCursor.setBackground(c);
    }//GEN-LAST:event_btnChgColorActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       
        int pressed = evt.getKeyCode();
        
        System.out.println(pressed);
        if(pressed == 87){
            timePressedWS--;
            currentPosition[1] = timePressedWS*5;
            pnlCursor.setLocation(currentPosition[0],currentPosition[1]);
        }
        if(pressed == 83){
            timePressedWS++;
            currentPosition[1] = timePressedWS*5;
            pnlCursor.setLocation(currentPosition[0],currentPosition[1]);
        }
        if(pressed == 65){
            timePressedAD--;
            currentPosition[0] = timePressedAD*5;
            pnlCursor.setLocation(currentPosition[0],currentPosition[1]);
        }
        if(pressed == 68){
            timePressedAD++;
            currentPosition[0] = timePressedAD*5;
            pnlCursor.setLocation(currentPosition[0],currentPosition[1]);
        }
    }//GEN-LAST:event_formKeyPressed

    @Override
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(0,0,20,20);
        
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
            java.util.logging.Logger.getLogger(Draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Draw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnChgColor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel pnlCursor;
    // End of variables declaration//GEN-END:variables
}
