import java.util.*;

public class PathInTriangleGridTabulation {

    public static int findPaths(int[][] arr){
        int m = arr.length;

        int[][] dp = new int[m][];
        for (int i = 0; i < m; i++) {
            dp[i] = new int[arr[i].length];
            Arrays.fill(dp[i], -1);
        }

        for(int i=0 ; i<dp[m-1].length ; i++){
            dp[m-1][i] = 1;
        }

        for(int i=m-2 ; i>=0 ; i--){
            for(int j=0 ; j<i+1 ; j++){  
                int down = dp[i+1][j];
                int diag = dp[i+1][j+1];

                dp[i][j] = down+diag;
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] arr = {{1},{2,3},{3,6,7},{8,9,6,10}};

        int res = findPaths(arr);
        System.out.println(res);
    }
}

