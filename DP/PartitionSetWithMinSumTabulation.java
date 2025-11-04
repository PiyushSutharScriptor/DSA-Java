public class PartitionSetWithMinSumTabulation {
    public static void main(String[] args) {
        int[] arr = {3,2,7};

        int sum = 0;
        for(int el : arr){
            sum += el;
        }

        int n = arr.length;

        boolean[][] dp = new boolean[n][sum+1];

        for(int i=0 ; i<n ; i++){
            dp[i][0] = true;
        }

        if(arr[0]<=sum) dp[0][arr[0]] = true;

        for(int idx=1 ; idx<n ; idx++){
            for(int target=1 ; target<=sum ; target++){
                boolean notTake = dp[idx-1][target];

                boolean take = false;
                if(arr[idx]<=target){
                    take = dp[idx-1][target-arr[idx]];
                }

                dp[idx][target] = take||notTake;
            }
        }

        int mini = Integer.MAX_VALUE;

        for(int i=0 ; i<=sum ; i++){
        // for(int i=0 ; i<=sum/2 ; i++){ optimized
            if(dp[n-1][i]){
                int s1 = i;
                int s2 = sum-s1;

                mini = Math.min(mini,Math.abs(s1-s2));
            }
        }

        System.out.println(mini);
    }
}
