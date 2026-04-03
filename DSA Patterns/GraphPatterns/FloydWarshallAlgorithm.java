import java.util.*;

public class FloydWarshallAlgorithm {

    public static void print(int[][] cost, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cost[i][j] == (int)1e8)
                    System.out.print("INF ");
                else
                    System.out.print(cost[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] edges = { { 0, 1, 2 }, { 1, 0, 1 }, { 3, 0, 3 }, { 3, 2, 4 }, { 3, 1, 5 }, { 1, 2, 3 } };
        int n = 4;

        int cost[][] = new int[n][n];
        int MAXI = (int) 1e8;
        // int len = edges.length;

        for (int[] arr : cost) {
            Arrays.fill(arr, MAXI);
        }

        for (int[] arr : edges) {
            int u = arr[0];
            int v = arr[1];
            int wt = arr[2];

            cost[u][v] = wt;
        }

        for (int i = 0; i < n; i++) {
            cost[i][i] = 0;
        }

        for (int via = 0; via < n; via++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    cost[i][j] = Math.min(
                            cost[i][j],
                            (cost[i][via] + cost[via][j]));
                }
            }
        }

        print(cost, n);

    }
}
