import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int original = n;

        int res=0;
        while(n>0){
            int lastdigit = n%10;
            res = res + lastdigit*lastdigit*lastdigit;
            n=n/10;
        }

        if(res==original){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not a Armstrong");
        }
    }
}
