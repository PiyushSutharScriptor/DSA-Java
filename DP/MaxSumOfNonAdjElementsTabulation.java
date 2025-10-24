import java.util.*;

public class MaxSumOfNonAdjElementsTabulation {

    public static int findMax(int[] arr,int idx){
        int n = arr.length;

        //edge case : 
        if(n==1) return arr[0];

        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for(int i=2 ; i<n ; i++){
            int pick = arr[i] + dp[i-2];
            int notPick = 0 + dp[i-1];
            dp[i] = Math.max(pick, notPick);
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9};
        int n = arr.length;
        
        int res = findMax(arr, n-1);
        System.out.println(res);
    }
}



