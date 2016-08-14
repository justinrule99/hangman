
package eulertest;

import java.math.BigInteger;

public class EulerTest {

    int HUNDRED;
    int AND;
    int ONE, TWO, SIX, TEN;
    int FOUR, FIVE, NINE;
    int THREE, SEVEN, EIGHT, FIFTY, SIXTY, FORTY;
    int ELEVEN, TWELVE, TWENTY, THIRTY, EIGHTY, NINETY;
    int FIFTEEN, SIXTEEN, SEVENTY;
    int THIRTEEN, FOURTEEN, NINETEEN, EIGHTEEN;
    int SEVENTEEN;
     
    
    
    public EulerTest(){
         HUNDRED = 7;
         AND = 3;
         ONE = TWO = SIX = TEN = 3;
         FOUR = FIVE = NINE = 4;
         THREE = SEVEN = EIGHT = FIFTY = SIXTY = FORTY = 5;
         ELEVEN = TWELVE = TWENTY = THIRTY = EIGHTY = NINETY = 6;
         FIFTEEN = SIXTEEN = SEVENTY = 7;
         THIRTEEN = FOURTEEN = NINETEEN = EIGHTEEN = 8;
         SEVENTEEN = 9;
    }
     
     
    public static void main(String[] args) {
        
        long startTime = System.currentTimeMillis();
        
        EulerTest et = new EulerTest();
        //et.euler8("7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450");
        et.euler10();
        
        System.out.println(isPrime(5927));
        
        //for (int i = 1000; i < 2000; i++) {
        //   isPrime2(i);
        //}
         
        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
        System.out.println("Execution Time: "+elapsed+" milliseconds");
        
    }
    
    
    public double euler8(String str){
        
        double product = 0;
        double max = 0;
        
        char chA[] = str.toCharArray();
        double dbA[] = new double[chA.length];
        
        for (int i = 0; i < chA.length; i++) {
            //System.out.println(chA[i]);
            dbA[i] = (double) (chA[i]-'0');
        }
       
        if(dbA.length>13){
            for (int i = 0; i < dbA.length-1; i++) {
                //product of 13 starting at i
                product = findProduct(0, i, dbA);
                //System.out.println(product+" Starting With: "+dbA[i]+","+dbA[i+1]);
                if(product>max){
                    max = product;
                }
            }   
        }
        System.out.printf("Max Product: %f\n", max);
        
        return max;
    }
    
    public double findProduct(double product, int i, double d[]){
        product = 1;
        int left = d.length - i;
        
        if(left<13){
            return 0;
        }
        else{
            for (int j = 0; j < 13; j++) {
                product*=d[i+j];
            }
        
        }
        return product; 
    }
    
    
    static boolean isTriplet(int a,int b,int c){
	int legsSq = (a*a) + (b*b);
	int hypSq = c*c;
	if(legsSq==hypSq){
            return true;
	}
	else{
            return false;
	}
}

    static boolean hasPythagTriple(int c){

	int numTrip = 0;
	for (int b = c-1; b >= 0; b--) {
		for (int a = b-1; a >= 0; a--) {
			if(isTriplet(a,b,c)){
				numTrip++;
				int sum = a+b+c;
				if(sum==1000){
					System.out.println("Winner: ( "+a+" , "+b+" , "+c+" )");
                                        System.out.println("Product: "+a*b*c);
				}
				
			}
			
		}
	}
	if(numTrip>0){
		return true;
	}
	else return false;
          
    }
    

    static boolean isPrime(int number){
    
        boolean tempPrime = true;
        
        if(number<1000){
            for (int i = number-1; i > 1; i--) {
                if(number%i==0){
                    tempPrime = false;//not prime
                }
            }
        }
        else{
            if(number%2==0 || number%3==0 || number%5==0 || number%7==0 || number%11==0 || number%13==0 || number%17==0 || number%19==0 || number%23==0 || number%29==0){ //if even/mult 3/mult 5
                //not prime
                
                return false;
            }
            else{
                int root = (int)Math.sqrt((double)number);
                
                for (int i = root; i > 1; i--) {
                    if(number%i==0){
                        return false;//not prime
                    }
                }
            
            }

        }
        
        return tempPrime;
    }
    
    
    static void euler10(){

	int i = 3;
	int nPrimes = 1;
	double sum = 0;
        double di;

	while(i<=2000000){
            di = (double) i;
            if(isPrime(i)){ 
                    sum+=di;
                    nPrimes++;
                    if(nPrimes%5000==0){
                        System.out.println(nPrimes);
                        System.out.println("I: "+i);
                    }
            }
            i+=2;
	}
        sum+=2;
	System.out.println("Primes under 2 million: "+nPrimes);   //148933
	System.out.printf("Sum of said primes:  %f",sum);         //142913828922
    }
    
    
    static void euler16(){
        BigInteger b1;
        b1 = new BigInteger("2");
       
        BigInteger b = b1.pow(1000);
        String str = b.toString();
        
        char chA[] = str.toCharArray();
        System.out.println("Digits: "+chA.length);
        int indNum[] = new int[chA.length];
        for (int i = 0; i < chA.length; i++) {
            indNum[i] = Character.getNumericValue(chA[i]);
        }
        System.out.println(indNum[301]);
        int sum = 0;
        for (int j = 0; j < indNum.length; j++) {
            sum+=indNum[j];
        }
        
        System.out.println("Sum of digits: "+sum);
    }
    
     void euler17(){
        int sum = 0;
        //System.out.println(howManyLetters(999));
        //NINE HUNDRED AND FIFTY EIGHT = 24 Letters
        for (int i = 1; i < 1001; i++) {
            sum+=howManyLetters(i);
            //System.out.println(howManyLetters(i));
           
        }
        System.out.println(sum);
         System.out.println(howManyLetters(43));
    }
    
     int howManyLetters(int number){
        
        int currentTotal = 0;
        
        String strNum = Integer.toString(number);
        
        char chA[] = strNum.toCharArray();
        
        int intA[] = new int[chA.length];
        
        for (int i = 0; i < chA.length; i++) {
            intA[i] = Character.getNumericValue(chA[i]);
            //System.out.println("Real Place "+i+": "+intA[i]);
        }                                         
        
        // System.out.println("Digits: "+intA.length);
        if(intA.length==4){
            return 11;
        }
        if(intA.length==3){
            currentTotal+=getHundreds(intA[0], number);
            currentTotal+=getTens(intA[1], intA[2]);
           
            if(intA[1]!=1){
                currentTotal+=getOnes(intA[2]);
            }
            
        }
        if(intA.length==2){
            currentTotal+=getTens(intA[0], intA[1]);
            if(intA[0]!=1){
                currentTotal+=getOnes(intA[1]);
            }   
        }
        if(intA.length==1){
            currentTotal+=getOnes(intA[0]);
        }

        return currentTotal;
    }
     
    private int getHundreds(int hundreds, int number){
        int total = 0;
        //where hundreds is between 1 and 9
        total = getOnes(hundreds);
        total+=HUNDRED;
        if(number%100!=0){
            total+=AND;
        }
        return total;
    }
    
    private int getTens(int tens, int ones){
        int total = 0;

        switch (tens){
            case 1:
                switch (ones){
                    case 1: total+=ELEVEN;
                        break;
                    case 2: total+=TWELVE;
                        break;
                    case 3: total+=THIRTEEN;
                        break;
                    case 4: total+=FOURTEEN;
                        break;
                    case 5: total+=FIFTEEN;
                        break;
                    case 6: total+=SIXTEEN;
                        break;
                    case 7: total+=SEVENTEEN;
                        break;
                    case 8: total+=EIGHTEEN;
                        break;
                    case 9: total+=NINETEEN;
                        break;
                    case 0: total+=TEN;
                        break;
                    
                }
                break;
            case 2:
                total=TWENTY; 
                break;
            case 3:
                total=THIRTY;
                break;
            case 4:
                total=FORTY; 
                break;
            case 5:
                total=FIFTY;
                break;
            case 6:
                total=SIXTY; 
                break;
            case 7:
                total=SEVENTY;
                break;
            case 8:
                total=EIGHTY; 
                break;
            case 9:
                total=NINETY;
                break;
            default: 
                total=0;
                break;
        }
        return total;
    }
    
    private int getOnes(int ones){
        int total;
        //where ones is between 0 and 9
        //if its in the teens, don't run this
        switch (ones){
            case 1:
                total=ONE;
                break;
            case 2:
                total=TWO; 
                break;
            case 3:
                total=THREE;
                break;
            case 4:
                total=FOUR; 
                break;
            case 5:
                total=FIVE;
                break;
            case 6:
                total=SIX; 
                break;
            case 7:
                total=SEVEN;
                break;
            case 8:
                total=EIGHT; 
                break;
            case 9:
                total=NINE;
                break;
            default: 
                total=0;
                break;
        }
        //System.out.println("In Ones column: "+ones);
        return total;
    }
     

}
