public class CountSquareSubMatrixTabulation {
    public static void main(String[] args) {

        //when rows and cols are equal 
        int[][] arr = {{1,0,1},{1,1,0},{1,1,0}};

        int m = arr.length;
        int n = arr[0].length;

        
        int[][] dp = new int[m][n];
        for(int i=0 ; i<n ; i++){
            dp[0][i] = arr[0][i];
            dp[i][0] = arr[i][0];
        }
        
        for(int i=1 ; i<m ; i++){
            for(int j=1 ; j<n ; j++){
                
                if(arr[i][j]==0) continue;
                
                int top = dp[i-1][j];
                int diag = dp[i-1][j-1];
                int left = dp[i][j-1];
                
                int mini = Math.min(top,(Math.min(diag,left)));
                dp[i][j] = mini+1;
            }
        }
        
        int count = 0;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                count+=dp[i][j];
            }
        }
        
        System.out.println(count);
    }    
}

