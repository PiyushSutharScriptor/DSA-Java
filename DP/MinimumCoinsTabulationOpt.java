public class MinimumCoinsTabulationOpt {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 4};
        int amount = 3;
        int n = arr.length;

        int[] dp = new int[amount + 1];
        int INF = (int)1e8;

        dp[0] = 0;

        for (int target = 1; target <= amount; target++) {
            if (target % arr[0] == 0)
                dp[target] = target / arr[0];
            else
                dp[target] = INF;
        }

        for (int i = 1; i < n; i++) {

            int[] temp = new int[amount+1];
            temp[0] = 0;
            
            for (int target = 1; target <= amount; target++) {
                int notTake = dp[target];
                int take = INF;
                if (arr[i] <= target)
                    take = 1 + temp[target - arr[i]];
                temp[target] = Math.min(take, notTake);
            }

            dp = temp;
        }

        int ans = dp[amount];
        System.out.println(ans >= INF ? -1 : ans);
    }
}

