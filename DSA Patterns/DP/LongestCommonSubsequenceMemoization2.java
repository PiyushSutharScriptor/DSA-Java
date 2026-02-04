import java.util.*;

public class LongestCommonSubsequenceMemoization2{

    public static int findMax(String s1, String s2, int idx1, int idx2, int[][] dp){ 
        
        //base case
        if(idx1==0 || idx2==0) return 0;

        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];

        if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
            return dp[idx1][idx2] = 1 + findMax(s1,s2,idx1-1,idx2-1, dp);
        }

        return dp[idx1][idx2] =  Math.max(findMax(s1,s2,idx1-1,idx2, dp),findMax(s1,s2,idx1,idx2-1, dp));
        
        //we can remove 0 + (it is for understanding)
    }

    public static void main(String[] args) {
        String s1 = "acd";
        String s2 = "ced";

        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1+1][n2+1];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = findMax(s1,s2,n1,n2,dp);
        System.out.println(res);
    }
}
