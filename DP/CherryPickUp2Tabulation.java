import java.util.*;

public class CherryPickUp2Tabulation{

    public static int findMax(int[][]arr){
        int m = arr.length;
        int n = arr[0].length;

        int[][][] dp = new int[m][n][n];
        for(int[][] ar : dp){
            for(int[] ar2 : ar){
                Arrays.fill(ar2,Integer.MIN_VALUE);
            }
        }

        if(j1<0 || j2<0 || j1>=n || j2>=n) return (int)-1e8;

        if(dp[i][j1][j2]!=Integer.MIN_VALUE) return dp[i][j1][j2];

        if(i==m-1){
            if(j1!=j2) return arr[i][j1]+arr[i][j2];
            else return arr[i][j1];
        }

        int maxi = (int)-1e8;

        for(int i=0 ; i<m ; i++){
            for(int j1=0 ; j1<n ; j1++){
                for(int j2=0 ; j2<n ; j2++){
                    for(int dj1=-1 ; dj1<=1 ; dj1++){
                        for(int dj2=-1 ; dj2<=1 ; dj2++){
                            int val = 0;

                            if(j1==j2){
                                val = arr[i][j1];
                            }
                            else{
                                val = arr[i][j1]+arr[i][j2];
                            }
                        }
                    }
                }
            }
        }
            
        return dp[i][j1][j2] = maxi;
    }
    
    public static void main(String[] args) {
        int[][] arr = {{2,3,1,2},{3,4,2,2},{5,6,3,5}};

        int res1 = findMax(arr);
        System.out.println(res1);
    }
}
