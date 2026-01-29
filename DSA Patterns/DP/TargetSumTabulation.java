
public class TargetSumTabulation {
    public static int findTar(int tar, int[] arr){

        int n = arr.length;

        int[][] dp = new int[n][tar+1];

        //zero case
        for(int i=0 ; i<=tar ; i++){
            int cnt = 0;
            if(i==0 && arr[0]==0) cnt=2;
            else if(i==0 || arr[0]==i) cnt=1;
            dp[0][i]=cnt;
        }

        for(int idx=1 ; idx<n ; idx++){
            for(int t=0 ; t<=tar ; t++){
                
                int notTake = dp[idx-1][t];
                int take = 0;
                if(t>=arr[idx]){
                    take = dp[idx-1][t-arr[idx]];
                }

                dp[idx][t] = take+notTake;
                
            }
        }

        return dp[n-1][tar];
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int target = 3;

        int sum = 0;
        for(int el : arr){
            sum+=el;
        }

        if((target + sum)%2 != 0 || Math.abs(target) > sum){
            System.out.println(0);
            return;
        }

        int t = (target+sum)/2;

        int res = findTar(t,arr);
        System.out.println(res);
    }                                       
}                       
