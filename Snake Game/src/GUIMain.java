
import javax.swing.JOptionPane;


public class GUIMain extends javax.swing.JFrame {

    String strX4;
    String strX3;
    String strX2;
    String strX;
    String strConst;
    String polynomial;
    static int degrees;
    static int xFourth;
    static int xCubed;
    static int xSquared;
    static int x;
    static double constant;
    static String grType;
    
    
    public GUIMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(700, 400));

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel1.setText("Graphing Calculator");

        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));

        jLabel2.setText("Degree Number: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        degrees = (int) jSpinner1.getValue();
        if(degrees==0){
            strConst = JOptionPane.showInputDialog("Constant: ",null);
            constant = Double.parseDouble(strConst);
            grType = "Horizontal Line";
        } 
        else if(degrees==1){
            strX = JOptionPane.showInputDialog("x Coefficient: ",null);
            strConst = JOptionPane.showInputDialog("Constant: ",null);
            x = Integer.parseInt(strX);
            constant = Integer.parseInt(strConst);
            grType = "Line";
        }
        else if(degrees==2){
            strX2 = JOptionPane.showInputDialog("x^2 Coefficient: ",null);
            strX = JOptionPane.showInputDialog("x Coefficient: ",null);
            strConst = JOptionPane.showInputDialog("Constant: ",null);
            xSquared = Integer.parseInt(strX2);
            x = Integer.parseInt(strX);
            constant = Integer.parseInt(strConst);
            grType = "Parabola";
        }
        else if(degrees==3){
            strX3 = JOptionPane.showInputDialog("x^3 Coefficient: ",null);
            strX2 = JOptionPane.showInputDialog("x^2 Coefficient: ",null);
            strX = JOptionPane.showInputDialog("x Coefficient: ",null);
            strConst = JOptionPane.showInputDialog("Constant: ",null);
            xCubed = Integer.parseInt(strX3);
            xSquared = Integer.parseInt(strX2);
            x = Integer.parseInt(strX);
            constant = Integer.parseInt(strConst);
            grType = "Cubic (x^3)";
            
        }
        else if(degrees==4){
            strX4 = JOptionPane.showInputDialog("x^4 Coefficient: ",null);
            strX3 = JOptionPane.showInputDialog("x^3 Coefficient: ",null);
            strX2 = JOptionPane.showInputDialog("x^2 Coefficient: ",null);
            strX = JOptionPane.showInputDialog("x Coefficient: ",null);
            strConst = JOptionPane.showInputDialog("Constant: ",null);
            xFourth = Integer.parseInt(strX4);
            xCubed = Integer.parseInt(strX3);
            xSquared = Integer.parseInt(strX2);
            x = Integer.parseInt(strX);
            constant = Integer.parseInt(strConst);
            grType = ("Quartic (x^4)");
        }
        Graph gr = new Graph();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
