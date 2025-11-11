public class DistinctSubsequencesTabulationOpt {

    public static int findCount(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        int[] dp = new int[n+1];

        dp[0] = 1;

        for (int idx1 = 1; idx1 <= m; idx1++) {

            int temp[] = new int[n+1];
            temp[0] = 1;

            for (int idx2 = 1; idx2 <= n; idx2++) {
                if (s1.charAt(idx1-1) == s2.charAt(idx2-1)) {
                    temp[idx2] = dp[idx2 - 1] + dp[idx2];
                } else {
                    temp[idx2] = dp[idx2];
                }
            }

            dp = temp;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String s1 = "rabbbit";
        String s2 = "rabbit";

        int res = findCount(s1, s2);
        System.out.println(res);
    }
}