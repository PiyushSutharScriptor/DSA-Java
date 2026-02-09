public class MinPathSumTabulation {

    public static int findPath(int[][] arr){

        int m = arr.length;
        int n = arr[0].length;
        
        int[][] dp = new int[m][n];

        dp[0][0] = arr[0][0];

        for(int x=0 ; x<m ; x++){
            for(int y=0 ; y<n ; y++){

                if(x==0 && y==0) dp[x][y]=arr[0][0];
                else{
                    int up = (int)1e8;
                    int left = (int)1e8;
                    
                    if(x>0) up = arr[x][y] + dp[x-1][y];
                    if(y>0) left = arr[x][y] + dp[x][y-1];
                    
                    dp[x][y] = Math.min(up,left);
                }
            }
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};

        int res = findPath(arr);
        System.out.println(res);
    }    
}


