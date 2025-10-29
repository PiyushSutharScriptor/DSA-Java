import java.util.*;

public class PathInTriangleGridMemoization {

    public static int findPaths(int row, int col, int[][] arr, int[][] dp){
        int m = arr.length;
        int n = arr[row].length;

        if(row>m-1 || col>n-1) return 0;
        
        if(dp[row][col]!=-1) return dp[row][col];
        if(row==m-1) return 1;

        int down = findPaths(row+1, col, arr, dp);
        int diag = findPaths(row+1, col+1, arr, dp);

        return dp[row][col] = down+diag;
    }

    public static void main(String[] args) {
        int[][] arr = {{1},{2,3},{3,6,7},{8,9,6,10}};

        int m = arr.length;

        int[][] dp = new int[m][];
        for (int i = 0; i < m; i++) {
            dp[i] = new int[arr[i].length];
            Arrays.fill(dp[i], -1);
        }

        int res = findPaths(0,0,arr,dp);
        System.out.println(res);
    }
}

