import java.util.Scanner;
public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double n2 = sc.nextDouble();
        System.out.print("Sum : " + (n1+n2));
        System.out.print("Subtraction : " + (n1-n2));
        System.out.print("Multiplication : " + (n1*n2));
        System.out.print("Division : " + (n1%n2));
        sc.close();
    }
}