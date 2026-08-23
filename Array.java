import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
    int[] array = {3, 6, 4, 5};
    int max = array[0];
    for (int i=0; i<array.length; i++)
        {if (array[i]>max)
            {max= array[i];}
         
        }
           System.out.println(max);
    
    List<Double> list=new ArrayList<>();
    list.add(5.5);
    list.add(19.4);
    list.add(55.2);
    double sum= list.get(0);
    for (int i=1; i<list.size(); i++){
        sum+=list.get(i);
    }
    double Average= sum/list.size();
    System.out.println(Average);
    }
}

