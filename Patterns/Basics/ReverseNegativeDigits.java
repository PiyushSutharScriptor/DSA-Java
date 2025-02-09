import java.util.Scanner;

public class ReverseNegativeDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.println("Original Number : " + num);
        System.out.print("Reversed Number : ");
        
        int rev = 0;

        int n = Math.abs(num);

        while(n>0){
            int lastdigit = n%10;    
            rev = rev*10+lastdigit;
            n=n/10;
        }

        if(num<0){
            rev= -rev;
        }

        System.out.println(rev);

        sc.close();
    }
}