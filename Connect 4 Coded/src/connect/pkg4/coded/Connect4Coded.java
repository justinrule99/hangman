
package connect.pkg4.coded;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Connect4Coded {
    int numGuessed;
    boolean hasWon;
    int compLocation;
    int uterLocation;
    
    
    public Connect4Coded(){
        System.out.println("project here");
        JFrame jGraph = new JFrame();
        jGraph.setVisible(true);
        jGraph.setLocation(700, 400);
        jGraph.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jGraph.setResizable(true);
        jGraph.setLocationRelativeTo(null);
        jGraph.setPreferredSize(new Dimension(500,500));
        jGraph.setTitle("Hidden Prizes");
        JPanel panel = new JPanel();
        jGraph.add(panel);
        
        
        panel.setLayout(new GridLayout(5,5,25,25));
        JButton btn[] = new JButton[26];
        for(int i=1;i<26;i++){
            String stI = Integer.toString(i);
            btn[i] = new JButton();
            btn[i].setPreferredSize(new Dimension(50,50));
            panel.add(btn[i]);
        } 
        jGraph.pack();
        numGuessed = 0;
        hasWon = false;
        compLocation = (int)(Math.random() * 25 + 1);
        uterLocation = (int)(Math.random() * 25 + 1);
        
        btn[compLocation].setText("Comp");
        btn[uterLocation].setText("uter");
        
        for (int i=1;i<26;i++) {
             btn[i].addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    System.out.println("ayylmao");
                    //Connect4Coded.btn[i].setText("X");
                    numGuessed++;
                    if(numGuessed>4&&hasWon==false){
                        JOptionPane.showMessageDialog(null, "You Lose!", "Loss", 1);
                    }
                }
            });
        }
        initHide();
    }
    
    
    public static void initHide(){
        JFrame prize = new JFrame();
        prize.setVisible(true);
        prize.setLocation(700, 400);
        prize.setResizable(true);
        prize.setSize(200,200);
        prize.setTitle("Hide the Prizes!");
        JButton btnHide = new JButton("Hide the Prizes!");
        prize.add(btnHide);
        
    }
    public static void main(String[] args) {
        Connect4Coded cc = new Connect4Coded();
    }
    
    
    public void actionPerformed(ActionEvent e) {
        System.out.println("button clicked");
        //To change body of generated methods, choose Tools | Templates.
    }
}
