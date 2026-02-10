import java.util.*;

public class CherryPickupMemoization {

    public static int neg = (int)-1e8;

    public static int findPath(int x1, int y1,int x2, int y2, int[][] arr, int[][][][] dp){

        if(x1<0 || y1<0 || x2<0 || y2<0) return neg;

        if(dp[x1][y1][x2][y2]!=-1) return dp[x1][y1][x2][y2];

        if(arr[x1][y1]==-1 || arr[x2][y2]==-1) return dp[x1][y1][x2][y2]=neg;
        if(x1==0 && y1==0 && x2==0 && y2==0) return dp[x1][y1][x2][y2]=arr[0][0];


        int first = findPath(x1-1, y1, x2-1, y2, arr, dp);
        int second = findPath(x1, y1-1, x2, y2-1, arr, dp);
        int third = findPath(x1-1, y1, x2, y2-1, arr, dp);
        int forth = findPath(x1, y1-1, x2-1, y2, arr, dp);


        int best = Math.max(Math.max(first,second),Math.max(third,forth));

        if(best==neg) return dp[x1][y1][x2][y2]=neg;

        if(x1==x2 && y1==y2){
            return dp[x1][y1][x2][y2]=best+arr[x1][y1];
        }

        return dp[x1][y1][x2][y2]=best+arr[x1][y1]+arr[x2][y2];
    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,-1},{1,0,-1},{1,1,1}};

        int m = arr.length;
        int n = arr[0].length;

        int[][][][] dp = new int[m][n][m][n];
        for(int[][][] ar1 : dp){
            for(int[][] ar2 : ar1){
                for(int[] ar3 : ar2){
                    Arrays.fill(ar3,-1);
                }
            }
        }

        int res = findPath(m-1, n-1,m-1, n-1, arr, dp);
        System.out.println(res);
    }
}
