import javax.swing.*;
import java.awt.*;
import java.awt.Event;


public class HangmanCoded extends javax.swing.JPanel{

    
 

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //JPanel panel = new JPanel();
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Handddgman");
        //panel.setSize(600,600);
        //panel.setVisible(true);
        //panel.setBackground(Color.GREEN);
        //frame.add(panel);
        
      
       PanelClass p = new PanelClass();
       frame.add(p);
       
    }
    
}
