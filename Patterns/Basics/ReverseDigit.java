import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        System.out.println("Original Number : " + n);
        System.out.print("Reversed Number : ");
        
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;    
            rev = rev*10+lastdigit;
            n=n/10;
        }
        System.out.println(rev);
    }
}

