import java.util.Arrays;

public class Function {
    static boolean EvenOdd(int a) {
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    static int Factorial(int f){
        int result=1;
        for (int index=1; index <=f; index++){
            result*=index;
        }
        f=result;
        return f;
    }
    static int[] FactorialArray(int[] array){
        int[] value= new int[array.length];
        for (int i=0;i<array.length;i++){
            
            value[i]= Factorial(array[i]);
            
        }
        return value;
    }

    public static void main(String[] args) {
        int a=2;
        System.out.println(EvenOdd(a));
        if (EvenOdd(a)){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        int f=4;
        System.out.println(Factorial(f));
        int[] array={2, 6, 7, 10};
        System.out.println(Arrays.toString(FactorialArray(array)));

    }
}

