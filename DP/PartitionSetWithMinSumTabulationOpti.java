public class PartitionSetWithMinSumTabulationOpti {
    public static void main(String[] args) {
        int[] arr = {3,2,7};

        int sum = 0;
        for(int el : arr){
            sum += el;
        }

        int n = arr.length;

        boolean[]dp = new boolean[sum+1];

        if(arr[0]<=sum) dp[arr[0]] = true;

        for(int idx=1 ; idx<n ; idx++){

            boolean[] temp = new boolean[sum+1];
            temp[0] = true;

            for(int target=1 ; target<=sum ; target++){
                boolean notTake = dp[target];

                boolean take = false;
                if(arr[idx]<=target){
                    take = dp[target-arr[idx]];
                }

                temp[target] = take||notTake;
            }

            dp = temp;
        }

        int mini = Integer.MAX_VALUE;

        for(int i=0 ; i<=sum ; i++){
        // for(int i=0 ; i<=sum/2 ; i++){ optimized
            if(dp[i]){
                int s1 = i;
                int s2 = sum-s1;

                mini = Math.min(mini,Math.abs(s1-s2));
            }
        }

        System.out.println(mini);
    }
}
