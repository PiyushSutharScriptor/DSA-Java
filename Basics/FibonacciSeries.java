import java.util.Scanner;
// 0 1 1 2 3 5
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Count : ");  
        int n = sc.nextInt();      

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series : " + first + " , " + second);
        for(int i=2 ; i<n ; i++){
            int next = first + second;
            System.out.print(" , " + next);
            first = second;
            second = next;
        }
    }
}
