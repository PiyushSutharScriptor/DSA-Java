import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t!=0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int total = 0;
            for (int i = 0; i < n - 1; i++) {
                total += Math.abs(a[i] - a[i + 1]);
            }

            int red = 0;

            red = Math.max(red, Math.abs(a[0] - a[1]));
            red = Math.max(red, Math.abs(a[n - 2] - a[n - 1]));

            for (int k = 1; k <= n - 2; k++) {
                int remove =
                        Math.abs(a[k - 1] - a[k]) +
                        Math.abs(a[k] - a[k + 1]);

                int add = Math.abs(a[k - 1] - a[k + 1]);

                int redNew = remove - add;
                red = Math.max(red, redNew);
            }

            System.out.println(total - red);
            
            t--;
        }

        
    }
}
