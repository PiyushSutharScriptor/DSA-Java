import java.util.*;

public class KClosestPointToOriginOpt {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { -2, 2 }, { 2, -2 } };
        int k = 2;

        int n = arr.length;
        PriorityQueue<Map.Entry<int[], Integer>> heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (int i = 0; i < n; i++) {
            int value = ((0 - arr[i][0]) * (0 - arr[i][0])) + ((0 - arr[i][1]) * (0 - arr[i][1]));

            heap.add(Map.entry(new int[] { arr[i][0], arr[i][1] }, value));
        }

        int i = 0;
        int[][] res = new int[k][2];
        while (i < k) {
            Map.Entry<int[], Integer> el = heap.poll();
            int[] a = el.getKey();
            res[i][0] = a[0];
            res[i][1] = a[1];
            i++;
        }

        for (int idx = 0; idx < k; idx++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(res[idx][j] + " ");
            }
            System.out.println();
        }

    }
}
