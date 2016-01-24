
import javax.swing.JFrame;




public class Graph extends JFrame{
    
    public static double vertP1;
    public static double vertP2;
    
        public Graph(){
            JFrame jGraph = new JFrame();
            jGraph.setVisible(true);
            jGraph.setSize(400,400);
            jGraph.setLocation(700,400);
            //jGraph.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jGraph.setResizable(true);
            jGraph.setLocationRelativeTo(null);
            jGraph.setTitle("Graph");
            PaintGraph pg = new PaintGraph();
            jGraph.add(pg);
            
            OptionsPanel op = new OptionsPanel();
            op.setVisible(true);
            
            
            
        }
}
