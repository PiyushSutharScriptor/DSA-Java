public class RodCuttingTabulation {

    public static int findMaxi(int[] price, int target){

        int n = price.length;

        int[][] dp = new int[n][target+1];

        for(int idx = 1 ; idx<n ; idx++){
            for(int t=0 ; t<=target ; t++){
                int notTake = 0 + dp[idx-1][t];

                int take = 0;
                if(idx+1<=t){
                    take = price[idx] + dp[idx][t-(idx+1)];
                }

                dp[idx][t] = Math.max(take,notTake);
            }
        }

        return dp[n-1][target];
 
    }

    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9};
        int target = 4;

        int res = findMaxi(price,target);
        System.out.println(res);
    }
}

