import java.io.*;
import java.util.*;

public class JavaCpTemplate {

    static FastReader fr = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = 1; // For single test case problems
        // t = fr.nextInt(); // Uncomment if multiple test cases
        while (t-- > 0) {
            solve();
        }
        out.flush();
    }

    static void solve() {
        // Example: read array and print sum
        int n = fr.nextInt();
        int k = fr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = fr.nextInt();

        // Your logic here
        int sum = 0;
        for (int x : arr) sum += x;

        out.println("Sum = " + sum);
    }

    // --------------- Fast Input ---------------
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
