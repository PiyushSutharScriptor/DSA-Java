public class LongestIncreasingSubsequenceTabulationOpt {

    public static int findMax(int[] arr){

        int n = arr.length;

        int[]dp = new int[n+1];

        for(int curr=n-1 ; curr>=0 ; curr--){

            int[] temp = new int[n+1];
            for(int prev=curr-1 ; prev>=-1 ; prev--){

                int notTake = dp[prev+1];

                int take = 0;
                if(prev==-1 || arr[curr]>arr[prev]){
                    take = 1 + dp[curr+1];
                }

                temp[prev+1] = Math.max(notTake, take);
            }

            dp = temp;
        }
        
        //note : the dp[][this should be +1 because of prev>=-1]    
        return dp[0];
    }

    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};

        int res = findMax(arr);
        System.out.println(res);
    }
}
