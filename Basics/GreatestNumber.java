import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Greatest number is: " + greatest);
        scanner.close();
    }
}
