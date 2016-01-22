
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;

import javax.swing.JPanel;


public class PaintGraph extends JPanel{
    int a = GUIMain.xFourth;
    int b = GUIMain.xCubed;
    int c = GUIMain.xSquared;
    int d = GUIMain.x;
    double e = GUIMain.constant;
    int deg = GUIMain.degrees;
    
    @Override
    public void paintComponent(Graphics g) {  
        Graphics2D g2 = (Graphics2D) g;
        Graphics2D g3 = (Graphics2D) g;
        QuadCurve2D q = new QuadCurve2D.Float();
        
        //improved copy (x>0)
        for(double i=0;i<10;i+=.1){
            double ptX = i; 
            //double ptY = 0;
            double ptY = findPointY(a,b,c,d,e,i,true, false);
            
            //System.out.println(ptX + " , " + ptY);
            double graphPTX = 200+(ptX*20);
            double graphPTY = (200-(ptY*20));
            int intX = (int) graphPTX;
            int intY = (int) graphPTY;
            g.fillOval(intX,intY,1,1);

            // draw QuadCurve2D.Float with set coordinates
            int x1 = (int) findPointX(a,b,c,d,e,i-.1,true);
            int y1 = (int) findPointY(a,b,c,d,e,i-.1,true, true);
            int x2 = (int) findPointX(a,b,c,d,e,i+.1,true);
            int y2 = (int) findPointY(a,b,c,d,e,i+.1,true, true);
            q.setCurve(x1, y1, intX, intY, x2, y2);
            String curvePts = "("+x1+" , "+y1+")"+"("+intX+" , "+intY+")"+"("+x2+" , "+y2+")";
            g2.draw(q);
                    
        }
        
        //improved copy (x<0)
        for(double i=10;i>0;i-=.1){
            double ptX = i; 
            double negi = i*-1;
            //double ptY = ((SnakeGame.a*negi)*(SnakeGame.a*negi)) + (SnakeGame.b*negi) + SnakeGame.c;
            double ptY = findPointY(a,b,c,d,e,i,false, false);
            //System.out.println(ptX + " , " + ptY);
            double graphPTX = 200-(ptX*20);
            double graphPTY =200-(ptY*20);
            int intX = (int) graphPTX;
            int intY = (int) graphPTY;
            //System.out.println(intX + " , " + intY);
            g.fillOval(intX,intY,1,1);
            
            
            // draw QuadCurve2D.Float with set coordinates
            int x1 = (int) findPointX(a,b,c,d,e,i+.1,false);
            int y1 = (int) findPointY(a,b,c,d,e,i+.1,false, true);
            int x2 = (int) findPointX(a,b,c,d,e,i-.1,false);
            int y2 = (int) findPointY(a,b,c,d,e,i-.1,false, true);
            q.setCurve(x1, y1, intX, intY, x2, y2);
            g2.draw(q);
                
        }
        g3.setColor(Color.RED); //color of axes
        g.drawLine(200,0,200,1400);
        g.drawLine(0,200,1400,200);
        //draw lines on x axis
        for(int i=0;i<100;i++){
            int x1 = (20*i);
            int y1 = 205;
            int x2 = x1;
            int y2 = 195;
            g.drawLine(x1,y1,x2,y2);
        }
        //draw lines on y axis
        for(int i=0;i<100;i++){
            int x1 = 195;
            int y1 = 20*i;
            int x2 = 205;
            int y2 = y1;
            g.drawLine(x1,y1,x2,y2);
        }   
    }
    
    public String findVertex(int c, int d, double e){
        double xVert = (-1*d)/(2*c);
        double yVert = (Math.pow(xVert, 2)*c)+(d*xVert)+e;
        String vertex = "( "+xVert+" , "+yVert+" )";
        return vertex;
    }
    
    public String findMin(int a, int b, int c, int d, int e){
        double xMin = 0;
        double yMin = 0;
        String min = null; //= "( "+xMin+" , "+yMin+" )";
        boolean canFindMin = false;
        
        if(deg==2){
            if(c>0){
                
                
                canFindMin = true;
            }
        }
        
        if(canFindMin){
            return min;
        }
        else{
            return("There is no Minimum!");
        }
        
    }
    
    public double findPointX(int a,int b, int c, int d, double e, double i, boolean isPositive){
        if (!isPositive) {
            double ptX = i;
            double graphPTX = 200 - (ptX * 20);
            int intX = (int) graphPTX;
            return intX;
        }
        else{
            double ptX = i; 
            double graphPTX = 200+(ptX*20);
            int intX = (int) graphPTX;
            return intX;
        }
    }
    
    public double findPointY(int a,int b, int c, int d, double e, double i, boolean isPositive, boolean isCurve){
        if (!isPositive) {
            double negi = i * -1;
            double ptY;
            if(deg==0){
                ptY = e;
            }
            else if(deg==1){
                ptY = (d*negi)+e;
            }
            else if(deg==2){
                ptY = (Math.pow(negi,2)*c)+(d*negi)+e;
            }
            else if(deg==3){
                ptY = (Math.pow(negi,3)*b)+(Math.pow(negi,2)*c)+(d*negi)+e;
            }
            else{
                ptY = (Math.pow(negi,4)*a)+(Math.pow(negi,3)*b)+(Math.pow(negi,2)*c)+(d*negi)+e;
            }
            if(isCurve){
                double graphPTY = 200 - (ptY * 20);
                int intY = (int) graphPTY;
                return intY;
            }
            else{
                return ptY;
            }
            
        }
        else{
            double ptY;
            if(deg==0){
                ptY = e;
            }
            else if(deg==1){
                ptY = (d*i)+e;
            }
            else if(deg==2){
                ptY = (Math.pow(i,2)*c)+(d*i)+e;
            }
            else if(deg==3){
                ptY = (Math.pow(i,3)*b)+(Math.pow(i,2)*c)+(d*i)+e;
            }
            else{
                ptY = (Math.pow(i,4)*a)+(Math.pow(i,3)*b)+(Math.pow(i,2)*c)+(d*i)+e;
            }
            if(isCurve){
                double graphPTY = 200 - (ptY * 20);
                int intY = (int) graphPTY;
                return intY;
            }
            else{
                return ptY;
            }
        }
    }
}
