import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        // Basic logic
        // int count=0;
        // while(n>0){
        // int singleDigit = n%10;
        // count++;
        // n=n/10;
        // }
        // System.out.println(count);

        // log form logic
        int count = (int) (Math.log10(n) + 1);
        System.out.println(count);

    }

}
