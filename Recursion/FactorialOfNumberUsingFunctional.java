import java.util.Scanner;

class Factorial{
    public int findFactorial(int n){
        if(n==1){
            return 1;
        }
        return n*(findFactorial(n-1));
    }
}
public class FactorialOfNumberUsingFunctional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value : ");
        int n = sc.nextInt();

        Factorial f1 = new Factorial();
        int res = f1.findFactorial(n);
        System.out.println("Factorial : " + res);
    }
}
