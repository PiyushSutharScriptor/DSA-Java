import java.util.*;

public class MaxSumOfNonAdjElementsMemoization {

    public static int findMax(int[] arr, int[] dp, int idx){
        if(idx==0) return arr[0];
        if(idx==1) return Math.max(arr[0],arr[1]);

        if(idx<0) return 0; //no need of this 

        if(dp[idx]!=-1) return dp[idx];
        int pick = arr[idx] + findMax(arr, dp, idx-2);
        int notPick = 0 + findMax(arr, dp, idx-1);

        dp[idx] = Math.max(pick,notPick);
        return dp[idx];
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9};
        int n = arr.length;
        
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = arr[0];

        int res = findMax(arr, dp,  n-1);
        System.out.println(res);
    }
}

