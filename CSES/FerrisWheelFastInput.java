import java.io.*;
import java.util.*;

public class FerrisWheelFastInput {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());

        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        int l = 0, r = n - 1, ans = 0;
        while (l <= r) {
            if (arr[l] + arr[r] <= x) l++;
            r--;
            ans++;
        }

        System.out.println(ans);
    }
}
