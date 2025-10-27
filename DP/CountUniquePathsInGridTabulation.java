import java.util.*;

public class CountUniquePathsInGridTabulation {

    public static int findPaths(int m, int n){
        int[][] dp = new int[m][n];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        dp[0][0] = 1;

        for(int i=0 ; i<m ; i++){

            for(int j=0 ; j<n ; j++){

                if(i==0 && j==0) dp[0][0]=1;
                else{
                    int left = 0;
                    int up = 0;
                    
                    if(j>0) left = dp[i][j-1];
                    if(i>0) up = dp[i-1][j];
                    
                    dp[i][j] = left+up;
                }

            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 4; 

        int res = findPaths(m,n);
        System.out.println(res);
    }
}

