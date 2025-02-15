import java.util.Scanner;

public class EuclideanAlgorithmGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int n2 = sc.nextInt();

        while(n1>0 && n2>0){
            if(n1>n2){
                n1 = n1%n2;
            }
            else{
                n2 = n2%n1;
            }

            if(n1==0){
                System.out.println("The GCF or HCF : " + n2);
                break;
            }
            else{
                System.out.println("The GCF or HCF : " + n1);
                break;
            }
        }
    }
}
