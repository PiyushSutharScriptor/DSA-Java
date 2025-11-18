import java.util.*;

public class NoOfLongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};

        int n = nums.length;

        int[] dp = new int[n];
        int[] cnt = new int[n];

        Arrays.fill(dp,1);
        Arrays.fill(cnt,1);

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<i ; j++){

                if(nums[i]>nums[j] && dp[j]+1>dp[i]){
                    dp[i] = dp[j]+1;
                    cnt[i] = cnt[j];
                }
                else if(nums[i]>nums[j] && dp[j]+1==dp[i]){
                    cnt[i]+=cnt[j]; 
                }
            }
        }

        int maxi = 1;
        for(int el : dp){
            maxi = Math.max(maxi, el);
        }
           
        int res = 0;

        for(int i=0 ; i<n ; i++){
            if(dp[i]==maxi) res+=cnt[i];
        }

        System.out.println(res);
    }
}
