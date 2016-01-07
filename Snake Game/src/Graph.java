
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;



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
            
            OptionsPanel op = new OptionsPanel();
            
            /*
            Border raisedEtched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
            JFrame jInfo = new JFrame();
            JPanel infoPanel = new JPanel();
            infoPanel.setPreferredSize(new Dimension(200,200));
            infoPanel.setLocation(50,50);
            infoPanel.setBorder(raisedEtched);
            jInfo.add(infoPanel);
            jInfo.pack();
            jInfo.setVisible(true);
            jInfo.setSize(300,300);
            jInfo.setLocation(200,200);
            jInfo.setVisible(true);
            jInfo.setLayout(null);
            JLabel lblType = new JLabel("Graph Type: "+ GUIMain.grType);
            lblType.setLocation(100,100);
            lblType.setVisible(true);
            infoPanel.add(lblType);
            //add button
            
            JButton btnTest = new JButton("Click Me");
            btnTest.setSize(90,25);
            btnTest.setLocation(200,200);
            jInfo.add(btnTest);
            */
            
        }
}
