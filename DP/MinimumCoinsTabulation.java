public class MinimumCoinsTabulation {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 4};
        int amount = 3;
        int n = arr.length;

        int[][] dp = new int[n][amount + 1];
        int INF = (int)1e8;

        // Base case: to make amount 0 -> need 0 coins
        for (int i = 0; i < n; i++) dp[i][0] = 0;

        // Base case for first coin
        for (int target = 1; target <= amount; target++) {
            if (target % arr[0] == 0)
                dp[0][target] = target / arr[0];
            else
                dp[0][target] = INF;
        }

        // Fill the DP table
        for (int i = 1; i < n; i++) {
            for (int target = 1; target <= amount; target++) {
                int notTake = dp[i - 1][target];
                int take = INF;
                if (arr[i] <= target)
                    take = 1 + dp[i][target - arr[i]];
                dp[i][target] = Math.min(take, notTake);
            }
        }

        int ans = dp[n - 1][amount];
        System.out.println(ans >= INF ? -1 : ans);
    }
}
