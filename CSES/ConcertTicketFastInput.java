import java.util.*;
import java.io.*;

public class ConcertTicketFastInput {

    public static int upperBound(List<Integer> li, int x) {

        int n = li.size();
        int l = 0;
        int r = n - 1;
        int ans = n;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (li.get(mid) > x) {
                ans = mid;
                r = mid - 1;
            } else l = mid + 1;
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // ticket
        int m = Integer.parseInt(st.nextToken()); // customer

        int[] customer = new int[m];
        List<Integer> ticket = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ticket.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            customer[i] = Integer.parseInt(st.nextToken());
        }

        Collections.sort(ticket);

        for (int i = 0; i < m; i++) {
            int up = upperBound(ticket, customer[i]);

            if (up >= 1 && up <= ticket.size()) {
                int idx = up - 1;
                int el = ticket.get(idx);
                System.out.println(el);
                ticket.remove(ticket.indexOf(el));
            } else {
                System.out.println(-1);
            }
        }
    }
}

