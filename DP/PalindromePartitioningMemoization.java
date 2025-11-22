import java.util.*;

public class PalindromePartitioningMemoization {

    public static int findWays(int i, int n, String str, int[] dp){
        if(i==n) return 0;

        if(dp[i]!=-1) return dp[i];

        String temp = "";
        int mini = Integer.MAX_VALUE;

        for(int j=i ; j<n ; j++){
            temp += str.charAt(j);
            
            if(isPalindrome(temp)){
                int cost = 1 + findWays(j+1, n, str,dp);
                mini = Math.min(mini, cost);
            }

        }

        return dp[i] = mini;
    }

    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "b"; 
            int n = str.length();

            int[] dp = new int[n];
            Arrays.fill(dp,-1);

            int res = findWays(0,n,str,dp);
            System.out.println(res-1);
    }
}
