import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long s = sc.nextLong();
            long k = sc.nextLong();
            long m = sc.nextLong();

            long last = (m / k) * k;
            long result;
            if (last == 0) {
                result = Math.max(0L, s - m);
            } else {
                long after = Math.min(s, k);
                long e = m - last;
                result = Math.max(0L, after - e);
            }

            System.out.println(result);
        }
        sc.close();
    }
}