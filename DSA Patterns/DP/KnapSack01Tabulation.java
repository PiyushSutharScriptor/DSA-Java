public class KnapSack01Tabulation{

    public static void print(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.err.println();
        }
        System.out.println();
    }

    public static int findMaxi(int W, int[] wt, int[] vl){
        int n = wt.length;
        int dp[][] = new int[n][W+1];

        //base case 
        for(int i=0 ; i<=W ; i++){
            if(i>=wt[0]){
                dp[0][i] = vl[0];
            }
        }

        for(int idx=1 ; idx<n ; idx++){
            for(int w=0 ; w<=W ; w++){
                int notTake = 0 + dp[idx-1][w];
                int take = Integer.MIN_VALUE;
                if(w>=wt[idx]){
                    take = vl[idx] + dp[idx-1][w-wt[idx]];
                }

                dp[idx][w] = Math.max(take,notTake);
            }
        }

        return dp[n-1][W];

    }
    public static void main(String[] args) {
        int wt[] = {3,2,5};
        int vl[] = {30,40,60};
        int W = 6;

        //printing res
        int res = findMaxi(W,wt,vl);
        System.out.println(res);
    }    
}


