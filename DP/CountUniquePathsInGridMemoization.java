import java.util.*;

public class CountUniquePathsInGridMemoization {

    public static int findPaths(int m, int n, int[][] dp){
        if(m<0 || n<0) return 0;
        
        if(m==0 && n==0) return 1;
        if(dp[m][n]!=-1) return dp[m][n];

        int left = findPaths(m, n-1, dp);
        int up = findPaths(m-1, n, dp);
        dp[m][n] = left+up;
        return dp[m][n];
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 4; 

        int[][] dp = new int[m][n];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        int res = findPaths(m-1,n-1,dp);
        System.out.println(res);
    }
}
