import java.util.*;

public class MinSumPathGridTabulationOpt{

    public static int findMin(int[][] arr){

        int m = arr.length;
        int n = arr[0].length;

        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        for(int i=0 ; i<m ; i++){
            int[] temp = new int[n];
            for(int j=0 ; j<n ; j++){
                if(i<0 || j<0){
                    continue;
                }

                if(i==0 && j==0){
                    temp[j]=arr[i][j];
                    continue;
                }

                int up = (int)1e8;
                int left = (int)1e8;

                if(i>0) up = arr[i][j] + dp[j];
                if(j>0) left = arr[i][j] + temp[j-1];

                temp[j] = Math.min(up,left);
            }
            dp = temp;
        }        

        return dp[n-1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6}};

        int res = findMin(grid);
        System.out.println(res);
    }
}

