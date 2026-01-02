import java.util.*;
import java.io.*;

public class ApartmentFastScanner {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] application = new int[n];
        int[] apartment = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            application[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            apartment[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(apartment);
        Arrays.sort(application);

        int i = 0;
        int j = 0;

        int res = 0;
        while (i < m && j < n) {

            int low = application[j] - k;
            int high = application[j] + k;

            if (apartment[i] < low) {
                i++;
            } else if (apartment[i] > high) {
                j++;
            } else {
                i++;
                j++;
                res++;
            }

        }

        System.out.println(res);

    }
}
