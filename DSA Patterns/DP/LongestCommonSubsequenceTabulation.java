import java.util.*;

public class LongestCommonSubsequenceTabulation{

    public static int findMax(String s1, String s2){ 
        
        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1+1][n2+1];

        for(int idx1=1 ; idx1<=n1 ; idx1++){
            for(int idx2=1; idx2<=n2 ; idx2++){
                if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
                    dp[idx1][idx2] = 1 + dp[idx1-1][idx2-1];
                }
                else{
                    dp[idx1][idx2] =  Math.max(dp[idx1-1][idx2],dp[idx1][idx2-1]);
                }
            }
        }

        return dp[n1][n2];
    }

    public static void main(String[] args) {
        String s1 = "acd";
        String s2 = "ced";

        int res = findMax(s1,s2);
        System.out.println(res);
    }
}
