import javax.swing.*;
import java.awt.*;



public class PanelClass extends JPanel{
    
    
    
    public PanelClass(){
       
       
    }
    
   @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.fillRect(200, 200, 100, 100);
        g.setColor(Color.red);
        //use images and jpanels for all stages of hangman, cant run different paintcomponents
        
       
        
        
    }

  
}
