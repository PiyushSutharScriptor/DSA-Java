public class WildCardMatchingTabulation {

    public static boolean findMatch(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;

        for(int i=1 ; i<=m ; i++){
            if(s1.charAt(i-1)=='*') dp[i][0] = true;
            else break;
        }

        for (int idx1 = 1; idx1 <= m; idx1++) {
            for (int idx2 = 1; idx2 <= n; idx2++) {
                if (s1.charAt(idx1-1) == s2.charAt(idx2-1) || s1.charAt(idx1-1) == '?') {
                    dp[idx1][idx2] = dp[idx1 - 1][idx2 - 1];
                }
                else {
                    if (s1.charAt(idx1-1) == '*') {
                        dp[idx1][idx2] = dp[idx1 - 1][idx2] || dp[idx1][idx2 - 1];
                    }
                }

            }
        }

        return dp[m][n];

    }

    public static void main(String[] args) {
        String s1 = "x?y*z";
        String s2 = "xaylmz";

        System.out.println(findMatch(s1, s2));
    }
}
