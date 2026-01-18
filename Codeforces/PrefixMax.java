import java.util.Scanner;

public class PrefixMax {

    static long value(int[] a) {
        long sum = 0;
        int currentMax = 0;
        for (int x : a) {
            currentMax = Math.max(currentMax, x);
            sum += currentMax;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long ans = value(a);

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                    ans = Math.max(ans, value(a));

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
