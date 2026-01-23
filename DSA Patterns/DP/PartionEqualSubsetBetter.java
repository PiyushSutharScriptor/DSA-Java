import java.util.*;

public class PartionEqualSubsetBetter{

    public static boolean findValid(int idx, int sum, int[]arr, int[][] dp){

        if(dp[idx][sum]!=-1){
            return dp[idx][sum]==1 ? true : false;
        }
        
        if(sum==0) return true;

        //not take || take
        boolean notTake = findValid(idx-1, sum, arr, dp);
        boolean take = false;
        if(idx-1>=0 && sum>=1){
            take = findValid(idx-1, sum-arr[idx], arr, dp);
        }

        dp[idx][sum] = (take||notTake) ? 1 : 0;

        return dp[idx][sum]==1 ? true : false; 
    }

    public static void main(String[] args) {
        int[] arr = {1,5,11,5};

        int sum = 0;
        for(int el : arr){
            sum+=el;
        }

        int n = arr.length;
        if(sum%2==0){

            int[][] dp = new int[n][(sum/2)+1];
            for(int[] ar : dp){
                Arrays.fill(ar,-1);
            }

            System.out.println(findValid(n-1,sum/2,arr,dp));
        }
        else{
            System.out.println(false);
        }
    }
}
