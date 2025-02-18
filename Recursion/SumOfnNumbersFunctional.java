import java.util.Scanner;

class Sum{
    public int sumOfNumbers(int n){
        if(n==0){
            return 0;
        }
        return n+(sumOfNumbers(n-1));
    }
}

public class SumOfnNumbersFunctional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n Number : ");
        int n = sc.nextInt();
        Sum s1 = new Sum();
        System.out.println("Sum : " + s1.sumOfNumbers(n));
    }
}
