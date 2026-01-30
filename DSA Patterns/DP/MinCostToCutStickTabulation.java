import java.util.*;

public class MinCostToCutStickTabulation {

    public static int findCost(int[] arr) {

        int k = arr.length - 2; 
        int[][] dp = new int[k + 2][k + 2];

        for (int i = k; i >= 1; i--) {
            for (int j = i; j <= k; j++) {

                int mini = Integer.MAX_VALUE;

                for (int idx = i; idx <= j; idx++) {
                    int cost = (arr[j + 1] - arr[i - 1]) +
                               dp[i][idx - 1] +
                               dp[idx + 1][j];

                    mini = Math.min(mini, cost);
                }

                dp[i][j] = mini;
            }
        }

        return dp[1][k];
    }

    public static void main(String[] args) {
        int n = 9;
        int[] arr = {5, 6, 1, 4, 2};
        
        Arrays.sort(arr);
        int k = arr.length;

        int[] cut = new int[k + 2];
        cut[0] = 0;
        for (int i = 1; i <= k; i++) {
            cut[i] = arr[i - 1];
        }
        cut[k + 1] = n;

        int res = findCost(cut);
        System.out.println(res);
    }
}
