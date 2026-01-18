import java.util.*;

public class OutOfMemory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long h = sc.nextLong();

            long[] orig = new long[n];
            long[] cur = new long[n];

            for (int i = 0; i < n; i++) {
                orig[i] = sc.nextLong();
                cur[i] = orig[i];
            }

            for (int i = 0; i < m; i++) {
                int b = sc.nextInt() - 1;
                long c = sc.nextLong();

                cur[b] += c;

                if (cur[b] > h) {
                    for (int j = 0; j < n; j++) {
                        cur[j] = orig[j];
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(cur[i]);
                if (i + 1 < n) System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}

