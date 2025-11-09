
public class MinInsertionDeletionToConvertStrTabulation {

    public static int findCount(String s1, String s2){

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[m][n];

    }
    public static void main(String[] args) {
        String s1 = "kitten";
        String s2 = "sitting";

        int m = s1.length();
        int n = s2.length();

        int res = findCount(s1,s2);
        int ans = m+n - 2*(res); //m-res+n-res = m+n-2*(res) 
        System.out.println(ans);
    }
}

