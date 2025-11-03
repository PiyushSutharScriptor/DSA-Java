import java.util.*;

public class SubsetSumEqualsKTabulationOpti {

    public static boolean findSet(int target, int[] arr){

        int n = arr.length;

        int[] dp = new int[target+1];
        Arrays.fill(dp,-1);

        dp[0] = 1;

        if(arr[0]<=target) dp[arr[0]] = 1;

        for(int idx=1 ; idx<n ; idx++){

            int temp[] = new int[target+1];
            temp[0] = 1;

            for(int t=1 ; t<=target ; t++){
                int notTake = dp[t];

                int take = -1;
                if(arr[idx]<=t){
                    take = dp[t-arr[idx]];
                }
                temp[t] = take==1||notTake==1 ? 1 : 0;
            }

            dp = temp;
        }

        return dp[target]==1; //if the value is 1 then true else false
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 5;

        System.out.println(findSet(target,arr));
    }
}


