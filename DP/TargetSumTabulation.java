//for both positive and negative elements 

public class TargetSumTabulation {

    public static int findWays(int[] arr,int target){
        int n = arr.length;

        int total = 0;
        for(int el : arr){
            total+=el;
        }

        if((total+target)%2!=0 || total<Math.abs(target)) return 0;

        target = (total+target)/2;
        int[][] dp = new int[n][target+1];

        if (arr[0] == 0) dp[0][0] = 2;
        else dp[0][0] = 1;

        if (arr[0] != 0 && arr[0] <= target)
            dp[0][arr[0]] = 1;

        for(int idx=1 ; idx<n ; idx++){
            for(int t=1 ; t<=target ; t++){
                int notTake =  dp[idx-1][t];

                int take = 0;
                if(arr[idx]<=t){
                    take = dp[idx-1][t-arr[idx]];
                }

                dp[idx][t] = take+notTake;
            }
        }

        return dp[n-1][target];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 1, 5};
        int target = 4; 

        int res = findWays(arr,target);
        System.out.println(res);
    }
}