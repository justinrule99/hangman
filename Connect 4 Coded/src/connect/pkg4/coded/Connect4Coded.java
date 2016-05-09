
package connect.pkg4.coded;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class Connect4Coded {

    public Connect4Coded(){
        System.out.println("project here");
        JFrame jGraph = new JFrame();
        jGraph.setVisible(true);
        jGraph.setSize(800, 600);
        jGraph.setLocation(700, 400);
        jGraph.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jGraph.setResizable(true);
        jGraph.setLocationRelativeTo(null);
        jGraph.setTitle("Connect 4");
        JPanel panel = new JPanel();
        jGraph.add(panel);
        
        
        panel.setLayout(new GridLayout(1,8,50,50));
        JButton btn;
        for(int i=1;i<9;i++){
            String stI = Integer.toString(i);
            btn = new JButton(stI);
            btn.setPreferredSize(new Dimension(50,50));
            panel.add(btn);
        } 
        jGraph.pack();
    }
    public static void main(String[] args) {
        Connect4Coded cc = new Connect4Coded();
    }
    
}
