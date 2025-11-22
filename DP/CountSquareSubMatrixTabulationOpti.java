public class CountSquareSubMatrixTabulationOpti {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,1},{1,1,0},{1,1,0}};

        int m = matrix.length;
        int n = matrix[0].length;

        int count = 0;

        int[][] dp = new int[m][n];
        for(int i=0 ; i<n ; i++){
            dp[0][i] = matrix[0][i];
            count+=matrix[0][i];
        }

        for(int i=1 ; i<m ; i++){
            dp[i][0] = matrix[i][0];
            count+=matrix[i][0];
        }

        for(int i=1 ; i<m ; i++){
            for(int j=1 ; j<n ; j++){

                if(matrix[i][j]==0) continue;

                int top = dp[i-1][j];
                int diag = dp[i-1][j-1];
                int left = dp[i][j-1];

                int mini = Math.min(top,(Math.min(diag,left)));
                dp[i][j] = mini+1;

                count+=dp[i][j];
            }
        }

        System.out.println(count);
    }    
}

