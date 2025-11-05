public class CountPartitionWithDIffTabulationOpt {

    public static int findCount(int[] arr, int target){
        int n = arr.length;

        int[] dp = new int[target+1];

        dp[0] = 1;
        if(arr[0]<=target) dp[arr[0]] = 1;

        for(int idx=1; idx<n ; idx++){

            int[] temp = new int[target+1];
            temp[0] = 1;

            for(int t=1 ; t<=target; t++){
                int notTake = dp[t];

                int take = 0;
                if(arr[idx]<=t){
                    take = dp[t-arr[idx]];
                }

                temp[t] = take+notTake;
            }

            dp = temp;
        }   

        return dp[target];
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

