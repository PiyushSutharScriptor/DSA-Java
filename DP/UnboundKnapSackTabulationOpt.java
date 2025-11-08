public class UnboundKnapSackTabulationOpt {

    public static int findMax(int[] wt, int[] val, int target){
        int n = wt.length;

        int[] dp = new int[target+1];

        for(int t=0 ; t<=target ; t++){
            if(t%wt[0]==0){
                dp[t] = t/wt[0]*val[0];
            }
        }

        for(int idx=1 ; idx<n ; idx++){
            int[] temp = new int[target+1];
            temp[0] = 0;

            for(int t=0 ; t<=target ; t++){
                int notTake = 0 + dp[t];

                int take = 0;
                if(wt[idx]<=t){
                    take = val[idx] + temp[t-wt[idx]];
                }
                temp[t] = Math.max(take, notTake);
            }

            dp = temp;
        }

        return dp[target];
    }

    public static void main(String[] args) {
        int[] wt = {2,4,6};
        int[] val = {5,11,13};
        int target = 10;

        int res = findMax(wt, val, target);
        System.out.println(res);
    }
}



