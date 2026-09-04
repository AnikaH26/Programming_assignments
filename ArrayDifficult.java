import java.util.ArrayList;
import java.util.List;

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
      for (int j=2;j<=limits;j++) {
        
      }
       ArrayList <Integer> prime = new ArrayList<Integer>();
        int numberTest = 0;
        int limit = 50;
        for (int a = 0; a <= limit; a++)
        {
            numberTest = a;
            if (numberTest == 2)
            {
                prime.add(numberTest);
            }
            for (int b = 2; b <= numberTest;)
            {
                if ((numberTest % b) == 0)
                {
                    break;
                }
                else
                {
                    prime.add(numberTest);
                    break;
                }
            }
        }
        System.out.println("Prime numbers under " + limit + ": " + prime);

    }
    


      //add prime boolean??
       
    

}
      







