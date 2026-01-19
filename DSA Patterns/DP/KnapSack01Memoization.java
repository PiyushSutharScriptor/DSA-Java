import java.util.*;

public class KnapSack01Memoization{

    public static int findMaxi(int idx, int W, int[] wt, int[] vl , int dp[][]){
        if(dp[idx][W]!=-1) return dp[idx][W];
        
        // base case
        if(idx==0){
            return dp[0][W] = W>=wt[idx] ? vl[idx] : 0;
        }

        int notTake = 0 + findMaxi(idx-1, W , wt, vl, dp);
        int take = Integer.MIN_VALUE; 
        if(W-wt[idx]>=0){
            take = vl[idx] + findMaxi(idx-1, W-wt[idx], wt, vl, dp);
        }

        return dp[idx][W] = Math.max(take,notTake); 
    }
    public static void main(String[] args) {
        int wt[] = {3,2,5};
        int vl[] = {30,40,60};
        int W = 6;

        int n = wt.length;
        int dp[][] = new int[n][W+1];

        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        //printing res
        //option : 01
        int res = findMaxi(n-1,W,wt,vl,dp);
        System.out.println(res);
        //option : 02
        System.out.println(dp[n-1][W]);
    }    
}

