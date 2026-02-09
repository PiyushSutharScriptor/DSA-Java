public class UniquePathsTabulation {

    public static int findWays(int m, int n){

        int[][] dp = new int[m][n];

        for(int x=0 ; x<m ; x++){
            for(int y=0 ; y<n ; y++){
                if(x==0 && y==0) dp[x][y]=1;
                else{
                    int left = 0;
                    int up = 0;
                    
                    if(x>0) up = dp[x-1][y];
                    if(y>0) left = dp[x][y-1];

                    dp[x][y] = up+left;
                }
            }
        }

        return dp[m-1][n-1];
        
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;

        int res = findWays(m,n);
        System.out.println(res);
    }
}
