public class DungeonGameTabulation {

    public static int findMini(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];

        dp[m-1][n-1] = Math.max(1, 1 - arr[m-1][n-1]);

        for(int j = n-2; j >= 0; j--){
            dp[m-1][j] = Math.max(1, dp[m-1][j+1] - arr[m-1][j]);
        }

        for(int i = m-2; i >= 0; i--){
            dp[i][n-1] = Math.max(1, dp[i+1][n-1] - arr[i][n-1]);
        }

        for(int i = m-2; i >= 0; i--){
            for(int j = n-2; j >= 0; j--){
                int need = Math.min(dp[i+1][j], dp[i][j+1]) - arr[i][j];
                dp[i][j] = Math.max(1, need);
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] arr = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(findMini(arr));
    }
}
