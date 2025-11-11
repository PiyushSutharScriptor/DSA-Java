public class DistinctSubsequencesTabulation {

    public static int findCount(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m][n];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        for (int idx1 = 1; idx1 < m; idx1++) {
            for (int idx2 = 1; idx2 < n; idx2++) {
                if (s1.charAt(idx1) == s2.charAt(idx2)) {
                    dp[idx1][idx2] = dp[idx1 - 1][idx2 - 1] + dp[idx1 - 1][idx2];
                } else {
                    dp[idx1][idx2] = dp[idx1 - 1][idx2];
                }
            }
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        String s1 = "rabbbit";
        String s2 = "rabbit";

        int res = findCount(s1, s2);
        System.out.println(res);
    }
}