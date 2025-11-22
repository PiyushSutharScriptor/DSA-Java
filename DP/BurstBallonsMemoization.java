import java.util.*;

public class BurstBallonsMemoization{

    public static int maxCoins(int i, int j, int[] arr, int[][] dp){
        if(i>j) return 0;

        if(dp[i][j]!=-1) return dp[i][j];
        int maxi = Integer.MIN_VALUE;

        for(int ind=i ; ind<=j ; ind++){
            int cost = arr[i-1]*arr[ind]*arr[j+1]
                        + maxCoins(i,ind-1,arr,dp)
                        + maxCoins(ind+1,j,arr,dp);

            maxi = Math.max(maxi,cost);
        }

        return dp[i][j] = maxi;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 8};
        int n = arr.length;

        int size = n+2;
        int[] ballons = new int[size];
        
        ballons[0] = 1;
        ballons[size-1] = 1;
        for(int i=1 ; i<size-1 ; i++) ballons[i]=arr[i-1];

        int[][] dp = new int[size][size];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = maxCoins(1,size-2,ballons,dp);
        System.out.println(res);
    }
}
