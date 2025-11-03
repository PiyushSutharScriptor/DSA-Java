public class PartitionEqualSubsetSumTabulationOpti {

    public static boolean findSum(int[] arr, int t){

        int n = arr.length;

        boolean[] dp = new boolean[t+1];

        if(arr[0]<=t) dp[arr[0]] = true;

        for(int i=1 ; i<n ; i++){

            boolean[] temp = new boolean[t+1];
            temp[0] = true;

            for(int target=1 ; target<=t ; target++){
                boolean notTake = dp[target];
                boolean take = false;

                if(arr[i]<=target){
                    take = dp[target-arr[i]];
                }

                temp[target] = take||notTake;
            }

            dp = temp;
        }

        return dp[t];
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


