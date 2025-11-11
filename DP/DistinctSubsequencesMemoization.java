import java.util.Arrays;

public class DistinctSubsequencesMemoization{

    public static int findCount(int idx1, int idx2, String s1, String s2, int[][] dp){

        if(idx2<0) return 1;
        if(idx1<0 || idx2<0) return 0;

        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return dp[idx1][idx2] = (findCount(idx1-1, idx2-1, s1, s2, dp) + 
                                findCount(idx1-1, idx2, s1, s2,  dp));
        }
        else{
            return dp[idx1][idx2] =  findCount(idx1-1, idx2, s1, s2, dp);
        }
    }

    public static void main(String[] args) {
        String s1 = "rabbbit";
        String s2 = "rabbit";

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m][n];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }
               
        int res = findCount(m-1,n-1,s1,s2,dp);
        System.out.println(res);
    }
}