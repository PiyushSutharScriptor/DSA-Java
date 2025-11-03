import java.util.*;

public class SubsetSumEqualsKTabulation {

    public static boolean findSet(int target, int[] arr){

        int n = arr.length;

        int[][] dp = new int[n][target+1];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        for(int i=0 ; i<n; i++){
            dp[i][0] = 1;
        }

        if(arr[0]<=target) dp[0][arr[0]] = 1;

        for(int idx=1 ; idx<n ; idx++){
            for(int t=0 ; t<=target ; t++){
                int notTake = dp[idx-1][t];

                int take = -1;
                if(arr[idx]<=t){
                    take = dp[idx-1][t-arr[idx]];
                }
                dp[idx][t] = take==1||notTake==1 ? 1 : 0;
            }
        }

        return dp[n-1][target]==1; //if the value is 1 then true else false
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 5;

        System.out.println(findSet(target,arr));
    }
}

