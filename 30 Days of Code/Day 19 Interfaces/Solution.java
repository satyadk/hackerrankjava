import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
//Write your code here
class Calculator implements AdvancedArithmetic {
    
    public int divisorSum( int n) {
        int iMaxDiv = ( int) Math.sqrt( n);
        int iOtherDiv ;
        int iSum = 0;
        for( int i =1 ; i<=iMaxDiv; i++ ) {
            if ( n%i == 0 )  {
                iSum += i;
                iOtherDiv = n/i ;
                if ( i != iOtherDiv ) iSum += iOtherDiv;
            }
        }
        return iSum;
    }
    
   
}
class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}