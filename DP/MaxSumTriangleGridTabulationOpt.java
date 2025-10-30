import java.util.*;

public class MaxSumTriangleGridTabulationOpt {

    public static int findPaths(int[][] arr){
        int m = arr.length;

        int len = arr[m-1].length;
        int[]dp = new int[len];
        for(int i=0 ; i<len ; i++){
            dp[i] = arr[len-1][i];
        }

        for(int i=m-2 ; i>=0 ; i--){
            int[] temp = new int[arr[i].length];
            for(int j=0 ; j<i+1 ; j++){  
                int down = arr[i][j] + dp[j];
                int diag = arr[i][j] + dp[j+1];

                temp[j] = Math.max(down,diag);
            }
            dp = temp;
        }

        return dp[0];
    }

    public static void main(String[] args) {
        int[][] arr = {{1},{2,3},{3,6,7},{8,9,6,10}};

        int res = findPaths(arr);
        System.out.println(res);
    }
}

