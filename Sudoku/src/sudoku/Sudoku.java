
package sudoku;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Sudoku extends JFrame implements ActionListener{
    public static void main(String[] args) {
        Sudoku sd = new Sudoku();
    }
    
    public Sudoku(){
        init();
    }
   
    
    public static void init(){
        JFrame frame = new JFrame("Sudoku");
        JFrame settings = new JFrame("Settings");
        settings.setSize(300,300);
        settings.setLocationRelativeTo(null);
        settings.setVisible(true);
        settings.setLayout(new FlowLayout());
        JButton btnStart = new JButton("New Game");
        btnStart.setSize(100,50);
        btnStart.setLocation(20,50);
        settings.add(btnStart);
        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        
        
        /*
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("tru");
            }
        });  */
        
       
        
        
        frame.add(panel);
        panel.setLayout(new GridLayout(9,9,20,20));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton btn = new JButton("hi");
        panel.add(btn);
        for(int i=1;i<82;i++){
            String stI = Integer.toString(i);
            btn = new JButton(stI);
            btn.setPreferredSize(new Dimension(50,50));
            panel.add(btn);
        }        
        frame.pack();
        frame.setVisible(true);
        
        btn.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("ayylmao");
            }
        });
        
    }
    
    
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawLine(100, 100, 300, 322);
        System.out.println("i did stuff");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
