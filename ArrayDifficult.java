import java.util.ArrayList;
import java.math.*;


public class ArrayDifficult {
  
    
        public static void main(String[] args) {
          int[] blackjack = {18, 19, 26, 16, 20, 23, 13, 30, 15, 28};
          int max= blackjack[0];
          for (int i=0; i<blackjack.length;i++){
            if (blackjack[i]<=21 && blackjack[i]>max){
                max = blackjack[i];
          }
          
        } 
          System.out.println(max);
    
          ArrayList<Integer> PrimeNum=new ArrayList<Integer>();
          int limits= 50;
          double a;
          double b;
          for (a=2;a<=limits;a++); 
          {
            boolean isPrime = true;
            
          
            for (b=2;b<=Math.sqrt(a);b++);
        {
              if (a%b==0);{
                  isPrime = false;
              } 
              if (isPrime=true); {
                PrimeNum.add(a);
              }

              
          

        }

      
      }
    }
  }