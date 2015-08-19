import java.util.Scanner;




public class HangmanTest {
    public static void main(String[] args) {
        String gu = getGuess();
        getPos(gu);
        
        
    }
    
    public static void getPos(String a){  //gets custom letter to check for
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String userString = sc.next();
        char[] brokenUp = userString.toCharArray();
        int firstA = userString.indexOf(a);
        int numA = 0;
        char chA = a.charAt(0);
        int posA[] = new int[120];
        for(int i=0; i<brokenUp.length;i++){
            if (brokenUp[i] == chA){
                numA++;
                posA[numA-1] = i;   //idea: make posA an array, each time there is an a, throw i into a new slot in the array.
                            //throw into slot of numA-1
            }       
        }
        System.out.println("There are " + numA +" "+chA+ "'s in the string you entered");
        if(numA==0){
            System.out.println("There is no "+ chA +" in the string");
        }
        else
        {    
            for(int j=0;j<numA;j++){
                int fakeJ = j + 1;
                int posAJ = posA[j];
                int posAJ1 = posAJ + 1;
                String message;
                if(fakeJ==1){
                    message = "The " + fakeJ + "st occurrence is at position " + posAJ1;
                }
                else if(fakeJ==2){
                    message = "The " + fakeJ + "nd occurrence is at position " + posAJ1;
                }
                else if(fakeJ==3){
                    message = "The " + fakeJ + "rd occurrence is at position " + posAJ1;
                }
                else
                    message = "The " + fakeJ + "th occurrence is at position " + posAJ1;
                System.out.println(message);
            }
        }
    }
    
    public static String getGuess(){
        Scanner sc = new Scanner(System.in);
        String guess = "";
        boolean isValid = false;
        while(!isValid){
            System.out.print("Enter a letter to find within the word: ");
            guess = sc.next();
            isValid = true;
        }

        return guess;
    }
    
}
