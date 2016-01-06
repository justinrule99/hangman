
import javax.swing.*;


public class SnakeGame extends JFrame{
    public static int a;
    public static int b;
    public static int c;
    
    public static void main(String[] args) {
        GUIMain gm = new GUIMain();
        gm.setVisible(true);
    }

    
    public static double posQuad(int a, int b, int c){
        double preRoot = (b*b)-4*a*c;
        if(preRoot<0){
            return 0;
        }
        else{
            double root = Math.sqrt(preRoot);
            double result = (-b+root)/(2*a);
            return result;
        }
    }
    
    public static double negQuad(int a, int b, int c){
        double preRoot = (b*b)-4*a*c;
        if(preRoot<0){
            return 0;
        }
        else{
            double root = Math.sqrt(preRoot);
            double result = (-b-root)/(2*a);
            return result;
        }
    }
    
    public static String posFactor(double posAns){
                
        if(posAns!=0){
            //put them in factor form
            String posFactor;
            if(posAns<0){
                posFactor = "(x+"+posAns*-1+")";
            }   
            else{
                posFactor = "(x-"+posAns+")";
            }
            return posFactor; 
        }
        else{
            System.out.println("The answer is comprised of imaginary numbers");
            return null;
        } 
    }
    
    
    public static String negFactor(double negAns){
                
        if(negAns!=0){
            //put them in factor form
            String negFactor;
            if(negAns<0){
                negFactor = "(x+"+negAns*-1+")";
            }   
            else{
                negFactor = "(x-"+negAns+")";
            }
            return negFactor; 
        }
        else{
            System.out.println("The answer is comprised of imaginary numbers");
            return null;
        } 
    }

}

