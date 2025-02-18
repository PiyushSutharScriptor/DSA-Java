import java.util.Scanner;;
public class FibonacciSeriesRecursion {

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Count : ");
        int n = sc.nextInt();

        fibonacci(n);
        for(int i=0 ; i<n ; i++){
            System.out.print(fibonacci(i) + " , ");
        }

    }

}
