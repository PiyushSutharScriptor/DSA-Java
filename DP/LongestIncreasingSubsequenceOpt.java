import java.util.*;

public class LongestIncreasingSubsequenceOpt {
    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;

        int[] dp = new int[n];
        Arrays.fill(dp,1);

        for(int i=1 ; i<n ; i++){
            for(int j=0 ; j<i ; j++){
                if(arr[i]>arr[j] && dp[j]+1>dp[i]){
                    dp[i] = dp[j]+1;
                }
            }
        }

        int maxi = 0;
        for(int el : dp){
            maxi = Math.max(maxi,el);
        }

        System.out.println(maxi);

        //only the max is used 
    }
}