import java.util.*;

public class MinInsertionToMakeStrPalindromeMemoization {

    public static int findMax(int idx1, int idx2, String s1, String s2, int[][] dp){
        if(idx1==0 || idx2==0) return 0;

        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];

        if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
            return dp[idx1][idx2] =  1+findMax(idx1-1, idx2-1, s1, s2, dp);
        }
        else{
            return dp[idx1][idx2] = Math.max(findMax(idx1-1, idx2, s1, s2, dp) , findMax(idx1, idx2-1, s1, s2, dp));
        }
    }

    public static void main(String[] args) {
        String s1 = "ba";

        String s2 = new StringBuilder(s1).reverse().toString();
        int n = s1.length();

        int[][] dp = new int[n+1][n+1];
        for(int[] ar :dp){
            Arrays.fill(ar,-1);
        }

        int res = findMax(n, n, s1, s2, dp);
        System.out.println(n - res);
    }
}
