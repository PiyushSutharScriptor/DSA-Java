public class CountPartitionWithDIffTabulation {

    public static int findCount(int[] arr, int target){
        int n = arr.length;

        int dp[][] = new int[n][target+1];

        for(int i=0 ; i<n ; i++){
            dp[i][0] = 1;
        }

        if(arr[0]<=target) dp[0][arr[0]] = 1;

        for(int idx=1; idx<n ; idx++){
            for(int t=1 ; t<=target; t++){
                int notTake = dp[idx-1][t];

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
        int[] arr = {1, 1, 2, 3};
        int d = 1;

        int sum = 0;    
        for(int el : arr){
            sum += el;
        }
        
        int target = (sum-d)/2;
        int res = findCount(arr,target);

        System.out.println(res);
    }
}

