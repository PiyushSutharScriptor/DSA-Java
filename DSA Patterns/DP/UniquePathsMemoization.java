import java.util.*;

public class UniquePathsMemoization {

    public static int findWays(int x, int y, int[][] dp){

        if(x<0 || y<0) return 0;

        if(dp[x][y]!=-1) return dp[x][y];
        if(x==0 && y==0) return dp[x][y]=1;

        int up = findWays(x-1, y, dp);
        int left = findWays(x, y-1, dp);

        return dp[x][y] = up+left;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;

        int[][] dp = new int[m][n];
        for(int[] ar :dp){
            Arrays.fill(ar,-1);
        }

        int res = findWays(m-1,n-1,dp);
        System.out.println(res);
    }
}
