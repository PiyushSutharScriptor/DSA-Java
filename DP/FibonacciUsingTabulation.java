import java.util.*;

class Fibo{
    int[] arr;
    int n;

    Fibo(int n1){
        this.n = n1;
        this.arr = new int[n+1];

        Arrays.fill(arr,-1);
        arr[0] = 0;
        arr[1] = 1;

    }
    
    public int findVal(int n){
        for(int i=2 ; i<=n ; i++){
            arr[i] = findVal(i-1)+findVal(i-2);
        }
        
        return arr[n];
    }
}

public class FibonacciUsingTabulation{

    public static void main(String[] args) {
        int n = 5;

        Fibo f1 = new Fibo(n);
        System.out.println(f1.findVal(n));
    }
}
