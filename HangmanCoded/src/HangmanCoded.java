import javax.swing.*;
import java.awt.*;
import java.awt.Event;


public class HangmanCoded extends javax.swing.JPanel{

    
 
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel lblPic = new JLabel();
        
        //JPanel panel = new JPanel();
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Handddgman");
        lblPic.setLocation(300,300);
        lblPic.setSize(200,200);
        lblPic.setBackground(new java.awt.Color(255, 255, 255));
        lblPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Justin\\Documents\\GitHub\\hangman\\HangmanGUI\\src\\base.png"));
        frame.add(lblPic);
        
      
       PanelClass p = new PanelClass();
       frame.add(p);
       
    }
    
}
