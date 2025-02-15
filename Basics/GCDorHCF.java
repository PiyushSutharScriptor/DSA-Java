import java.util.Scanner;

public class GCDorHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number : ");
        int n2 = sc.nextInt();

        int fact = 1;
        for(int i=1 ; i<=Math.min(n1,n2) ; i++){
            if(n1%i==0 && n2%i==0){
                fact = i;
            }
        }
        System.out.println(fact);

    }
}
