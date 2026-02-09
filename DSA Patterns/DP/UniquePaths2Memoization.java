import java.util.*;

public class UniquePaths2Memoization {

    public static int findPaths(int x, int y, int[][] arr, int[][] dp){

        if(x<0 || y<0) return 0;
        if(dp[x][y]!=-1) return dp[x][y];

        if(arr[x][y]==1) return dp[x][y]=0;
        if(x==0 && y==0) return dp[x][y]=1;

        int up = findPaths(x-1, y, arr, dp);
        int left = findPaths(x, y-1, arr, dp);

        return dp[x][y] = up+left;

    }

    public static void main(String[] args) {
        int[][] arr = {{0,1},{0,0}};

        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];
        for(int[] ar :dp){
            Arrays.fill(ar,-1);
        }

        int res = findPaths(m-1, n-1, arr, dp);
        System.out.println(res);
    }
}
