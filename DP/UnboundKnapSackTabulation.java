public class UnboundKnapSackTabulation {

    public static int findMax(int[] wt, int[] val, int target){
        int n = wt.length;

        int[][] dp = new int[n][target+1];

        for(int t=0 ; t<=target ; t++){
            if(t%wt[0]==0){
                dp[0][t] = t/wt[0]*val[0];
            }
        }

        for(int idx=1 ; idx<n ; idx++){
            for(int t=1 ; t<=target ; t++){
                int notTake = 0 + dp[idx-1][t];

                int take = 0;
                if(wt[idx]<=t){
                    take = val[idx] + dp[idx][t-wt[idx]];
                }
                dp[idx][t] = Math.max(take, notTake);
            }
        }

        return dp[n-1][target];
    }

    public static void main(String[] args) {
        int[] wt = {2,4,6};
        int[] val = {5,11,13};
        int target = 10;

        int res = findMax(wt, val, target);
        System.out.println(res);
    }
}



