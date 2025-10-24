import java.util.*;

public class HouseRobber2Memoization {

    public static int findMax(int[] arr, int[] dp, int idx){
        if(idx==0) return arr[0];
        if(idx==1) return Math.max(arr[0],arr[1]);

        if(idx<0) return 0; //no need of this 

        if(dp[idx]!=-1) return dp[idx];
        int pick = arr[idx] + findMax(arr, dp, idx-2);
        int notPick = 0 + findMax(arr, dp, idx-1);

        dp[idx] = Math.max(pick,notPick);
        return dp[idx];
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 1, 6};
        int n = arr.length;
        
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = arr[0];

        int[] temp1 = new int[n];
        int[] temp2 = new int[n];

        for(int i=0 ; i<n ; i++){
            if(i!=0) temp1[i] = arr[i];
            if(i!=n-1) temp2[i] = arr[i];
        }

        int res1 = findMax(temp1, dp, n-1);
        int res2 = findMax(temp2, dp, n-1);

        System.out.println(Math.max(res1,res2));
    }
}


