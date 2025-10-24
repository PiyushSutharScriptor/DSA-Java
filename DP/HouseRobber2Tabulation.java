import java.util.*;

public class HouseRobber2Tabulation {

    public static int findMax(int[] arr,int idx){
        int n = arr.length;

        //edge case : 
        if(n==1) return arr[0];

        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for(int i=2 ; i<n ; i++){
            int pick = arr[i] + dp[i-2];
            int notPick = 0 + dp[i-1];
            dp[i] = Math.max(pick, notPick);
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 1, 6};
        int n = arr.length;
        
        
        int[] temp1 = new int[n];
        int[] temp2 = new int[n];

        for(int i=0 ; i<n ; i++){
            if(i!=0) temp1[i] = arr[i];
            if(i!=n-1) temp2[i] = arr[i];
        }

        int res1 = findMax(temp1, n-1);
        int res2 = findMax(temp2, n-1);

        System.out.println(Math.max(res1,res2));
    }
}




