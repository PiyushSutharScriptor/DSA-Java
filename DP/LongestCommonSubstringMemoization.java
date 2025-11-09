import java.util.*;

public class LongestCommonSubstringMemoization {

    public static int len = 0;

    public static int findCount(int idx1, int idx2, String s1, String s2, int[][] dp){

        if(idx1<0 || idx2<0) return 0;

        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];
        int same = 0;

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            same = 1 + findCount(idx1-1, idx2-1, s1, s2, dp);
        }
        
        len = Math.max(len,same);

        findCount(idx1-1, idx2, s1, s2, dp);
        findCount(idx1, idx2-1, s1, s2, dp);

        return dp[idx1][idx2] = same;
    }
    public static void main(String[] args) {
        String s1 = "abx";
        String s2 = "abc";

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m][n];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        findCount(m-1,n-1,s1,s2,dp);

        System.out.println(len);
    }
}
