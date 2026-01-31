public class SubSetWithSumKTabulation {

    public static int findCnt(int[] arr, int k){

        int n = arr.length;
        int[][] dp = new int[k+1][n];

        for(int i=0 ; i<=k ; i++){
            int cnt = 0;
            if(i==0 && arr[0]==0) cnt=2;
            else if(i==0 || arr[0]==i) cnt=1;
            dp[i][0]=cnt;
        }

        

        for(int tar=1 ; tar<=k ; tar++){
            for(int idx=1 ; idx<n ; idx++){

                int notTake = dp[tar][idx-1];

                int take = 0;
                if(tar>=arr[idx]){
                    take = dp[tar-arr[idx]][idx-1];
                }

                dp[tar][idx] = take+notTake;
            }
        }

        return dp[k][n-1];
        
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int k = 4;

        int res = findCnt(arr,k);
        System.out.println(res);
    }
}

