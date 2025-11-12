public class WildCardMatchingTabulationOpt {

    public static boolean findMatch(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        boolean[]dp = new boolean[n + 1];

        dp[0] = true;

        for (int idx1 = 1; idx1 <= m; idx1++) {

            boolean[] temp = new boolean[n+1];
            boolean allStars = true;

            for (int k = 0; k < idx1; k++) {
                if (s1.charAt(k) != '*') {
                    allStars = false;
                    break;
                }
            }
            temp[0] = allStars;

            for (int idx2 = 1; idx2 <= n; idx2++) {
                if (s1.charAt(idx1-1) == s2.charAt(idx2-1) || s1.charAt(idx1-1) == '?') {
                    temp[idx2] = dp[idx2 - 1];
                }
                else {
                    if (s1.charAt(idx1-1) == '*') {
                        temp[idx2] = dp[idx2] || temp[idx2 - 1];
                    }
                }
            }

            dp = temp;
        }

        return dp[n];

    }

    public static void main(String[] args) {
        String s1 = "x?y*z";
        String s2 = "xaylmz";

        System.out.println(findMatch(s1, s2));
    }
}
