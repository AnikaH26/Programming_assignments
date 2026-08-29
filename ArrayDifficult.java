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

      List<Integer> PrimeNum=new ArrayList<>();
      for (int i=0;i<=50;i++) {
        if (isPrime(i)) {
          PrimeNum.add(i);
        }
      }
      
}
}
    


