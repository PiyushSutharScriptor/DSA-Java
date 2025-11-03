public class PartitionEqualSubsetSumTabulation {

    public static boolean findSum(int[] arr, int t){

        int n = arr.length;

        boolean[][] dp = new boolean[n][t+1];

        for(int i=0 ; i<n ; i++){
            dp[i][0] = true;
        }

        if(arr[0]<=t) dp[0][arr[0]] = true;

        for(int i=1 ; i<n ; i++){
            for(int target=1 ; target<=t ; target++){
                boolean notTake = dp[i-1][target];
                boolean take = false;

                if(arr[i]<=target){
                    take = dp[i-1][target-arr[i]];
                }

                dp[i][target] = take||notTake;
            }
        }

        return dp[n-1][t];
    }
    public static void main(String[] args) {
        int[] arr = {1, 10, 21, 10};

        int sum =0;
        for(int el : arr){
            sum+=el;
        }

        if(sum%2==0){
            System.out.println(findSum(arr, sum/2));
        }
        else System.out.println(false);
    }
}


