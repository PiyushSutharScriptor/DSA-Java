import java.util.Arrays;

public class MaximumFallingPathSumTabulation{

    public static int findPath(int[][] arr){
        int n = arr.length;

        int[][] dp = new int[n][n];
        for(int[] ar : dp){
            Arrays.fill(ar,Integer.MIN_VALUE);
        }

        for(int i=0 ; i<n ; i++){
            dp[n-1][i] = arr[n-1][i];
        }

        for(int row=n-2 ; row>=0 ; row--){
            for(int col=0 ; col<n ; col++){
                int down = row+1<n ? arr[row][col] + dp[row+1][col] : (int)-1e6;
                int ldiag = col>0 ? arr[row][col] + dp[row+1][col-1] : (int)-1e6;    
                int  rdiag = row+1<n&&col+1<n ? arr[row][col] + dp[row+1][col+1] : (int)-1e6;

                dp[row][col] = Math.max(down,Math.max(ldiag,rdiag));
                
            }
        }

        int maxi = Integer.MIN_VALUE;

        for(int el : dp[0]){
            maxi = Math.max(maxi,el);
        }

        return maxi;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};

        int res = findPath(arr);
        System.out.println(res);
    }
}
