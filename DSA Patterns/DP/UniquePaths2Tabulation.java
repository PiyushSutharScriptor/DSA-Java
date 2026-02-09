public class UniquePaths2Tabulation {

    public static int findPaths(int[][] arr){ 
        
        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];

        for(int x=0 ; x<m ; x++){
            for(int y=0 ; y<n ; y++){
                if(x==0 && y==0) dp[x][y]=1;
                else if(arr[x][y]==1) dp[x][y]=0;
                else{
                    int up = 0;
                    int left = 0;

                    if(x>0) up = dp[x-1][y];
                    if(y>0) left = dp[x][y-1];

                    dp[x][y] = up+left;
                }
            }
        }
        
        return dp[m-1][n-1];

    }

    public static void main(String[] args) {
        int[][] arr = {{0,1},{0,0}};

        int res = findPaths(arr);
        System.out.println(res);
    }
}
