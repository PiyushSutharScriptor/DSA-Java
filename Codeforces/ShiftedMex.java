import java.util.*;

public class ShiftedMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            Set<Long> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextLong());
            }

            List<Long> list = new ArrayList<>(set);
            Collections.sort(list);

            int maxi = 0;
            int curr = 0;

            for (int i = 0; i < list.size(); i++) {
                if (i == 0 || list.get(i) != list.get(i - 1) + 1) {
                    curr = 1;
                } else {
                    curr++;
                }
                maxi = Math.max(maxi, curr);
            }

            System.out.println(maxi);
        }

        sc.close();
    }
}
