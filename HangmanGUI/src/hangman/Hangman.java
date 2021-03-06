
package hangman;

import javax.swing.*;
import java.awt.*;


public class Hangman extends javax.swing.JFrame {
    boolean finished = false;
    static int numDraw =0;
    /**
     * Creates new form Hangman
     */
    public Hangman() {
        initComponents();
        lblPic.setVisible(false);
        
        
      
    }
    

    @Override
    public void paint(Graphics g){
        super.paint(g);
        getContentPane().setBackground(Color.WHITE); 
        g.setColor(Color.RED);
        g.drawOval(200, 200, 50, 50);
        //need to work on z index
    }
    
    public void drawNext(){
        if(numDraw==1){
            //Draw head
        }
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPic = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frame 1");
        setAutoRequestFocus(false);

        lblPic.setBackground(new java.awt.Color(255, 255, 255));
        lblPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Justin\\Documents\\GitHub\\hangman\\HangmanGUI\\src\\base.png")); // NOI18N
        lblPic.setName(""); // NOI18N

        btnStart.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 544, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 188, Short.MAX_VALUE)
                        .addComponent(lblPic))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lblPic))
        );

        getAccessibleContext().setAccessibleName("frame1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        String p1name = JOptionPane.showInputDialog(null, "Enter your name: ");
        lblPic.setVisible(true);
        
        
        
        while(!finished){
            String guess = JOptionPane.showInputDialog(null, "Enter your guess");
            getPos(guess);
        }
       
        
      
        
        
    }//GEN-LAST:event_btnStartActionPerformed

    
  public static void getPos(String a){  //gets custom letter to check for
        
        String word = "apple";
        char[] brokenUp = word.toCharArray();
        int firstA = word.indexOf(a);
        int numA = 0;
        char chA = a.charAt(0);
        int posA[] = new int[120];
        for(int i=0; i<brokenUp.length;i++){
            if (brokenUp[i] == chA){
                numA++;
                posA[numA-1] = i;   //idea: make posA an array, each time there is an a, throw i into a new slot in the array.
                            //throw into slot of numA-1
            }       
        }
        if(numA!=0){
            JOptionPane.showMessageDialog(null, "There are " + numA +" "+chA+ "'s in the word", "Alert", 2);
        }
        
        
        if(numA==0){
            JOptionPane.showMessageDialog(null, "There is no "+ chA +" in the word. Try again", "Alert", 1);
            numDraw++;
            System.out.println(numDraw);
        }
        else
        {    
            for(int j=0;j<numA;j++){
                int fakeJ = j + 1;
                int posAJ = posA[j];
                int posAJ1 = posAJ + 1;
                String message;
                if(fakeJ==1){
                    message = "The " + fakeJ + "st occurrence is at position " + posAJ1;
                }
                else if(fakeJ==2){
                    message = "The " + fakeJ + "nd occurrence is at position " + posAJ1;
                }
                else if(fakeJ==3){
                    message = "The " + fakeJ + "rd occurrence is at position " + posAJ1;
                }
                else
                    message = "The " + fakeJ + "th occurrence is at position " + posAJ1;
                System.out.println(message);
            }
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
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hangman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel lblPic;
    // End of variables declaration//GEN-END:variables
}
