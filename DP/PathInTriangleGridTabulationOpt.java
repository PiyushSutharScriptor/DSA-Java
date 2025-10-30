import java.util.*;

public class PathInTriangleGridTabulationOpt {

    public static int findPaths(int[][] arr){
        int m = arr.length;

        int[]dp = new int[arr[m-1].length];
        Arrays.fill(dp, 1);

        for(int i=m-2 ; i>=0 ; i--){
            int[] temp = new int[arr[i].length];
            for(int j=0 ; j<i+1 ; j++){  
                int down = dp[j];
                int diag = dp[j+1];

                temp[j] = down+diag;
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

