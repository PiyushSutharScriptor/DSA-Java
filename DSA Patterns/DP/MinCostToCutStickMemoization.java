import java.util.*;

public class MinCostToCutStickMemoization{

    public static int findCost(int i, int j, int[] arr, int[][] dp){
        //base case

        if(dp[i][j]!=-1) return dp[i][j];

        if(i>j) return 0;

        int mini = Integer.MAX_VALUE;
        for(int idx=i ; idx<=j ; idx++){
            int cost = (arr[j+1]-arr[i-1])+
                findCost(i, idx-1, arr, dp)+
                findCost(idx+1, j, arr, dp);

            mini = Math.min(mini,cost);
        }

        return mini;
    }

    public static void main(String[] args) {
        int n = 9;
        int[] arr = {5,6,1,4,2};
        
        Arrays.sort(arr);
        int k = arr.length;

        int[] cut = new int[k+2];
        cut[0]=0;
        for(int i=1 ; i<=k ; i++){
            cut[i] = arr[i-1];
        }
        cut[k+1]=n;

        int len = cut.length;
        int[][] dp = new int[len][len];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = findCost(1,k,cut,dp);
        System.out.println(res);
    }
}
