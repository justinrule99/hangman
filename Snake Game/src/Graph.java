
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;



public class Graph extends JFrame{
    
    public static double vertP1;
    public static double vertP2;
    
        public Graph(){
            JFrame jGraph = new JFrame();
            jGraph.setVisible(true);
            jGraph.setSize(400,400);
            jGraph.setLocation(700,400);
            //jGraph.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jGraph.setResizable(false);
            jGraph.setTitle("Graph");
            PaintGraph pg = new PaintGraph();
            jGraph.add(pg);
            
            JFrame jInfo = new JFrame();
            jInfo.setVisible(true);
            jInfo.setSize(300,300);
            jInfo.setLocation(200,200);
            jInfo.setVisible(true);
            jInfo.setLayout(null);
            JLabel lblType = new JLabel("Graph Type: ");
            lblType.setLocation(100,100);
            jInfo.add(lblType);
            //add button
            JButton btnTest = new JButton("Click Me");
            btnTest.setSize(90,25);
            btnTest.setLocation(100,100);
            jInfo.add(btnTest);
           
            
            
        }
}
