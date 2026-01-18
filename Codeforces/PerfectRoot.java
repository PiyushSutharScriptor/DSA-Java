import java.util.Scanner;

public class PerfectRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();  

            
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
                if (j < n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}