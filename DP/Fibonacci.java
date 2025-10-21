import java.util.*;

class Fibo{
    int[] arr;
    int n;

    Fibo(int n1){
        this.n = n1;
        this.arr = new int[n+1];

        Arrays.fill(arr,-1);
    }

    public int findVal(int n){
        if(n<=1) return n;
        if(arr[n]!=-1) return arr[n];

        arr[n] = findVal(n-1)+findVal(n-2);
        return arr[n];
    }

}

public class Fibonacci {

    public static void main(String[] args) {
        int n = 5;

        Fibo f1 = new Fibo(n);
        System.out.println(f1.findVal(n));
    }
}
