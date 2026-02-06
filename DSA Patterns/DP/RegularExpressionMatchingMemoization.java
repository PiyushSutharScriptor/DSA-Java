import java.util.*;

public class RegularExpressionMatchingMemoization {

    public static boolean findMatch(int idx1, int idx2, String s1, String s2, int[][] dp){

        // base case
        if (idx2 < 0) return idx1 < 0;

        if (idx1 < 0) {
            if (s2.charAt(idx2) == '*') {
                return findMatch(idx1, idx2 - 2, s1, s2, dp);
            }
            return false;
        }

        if (dp[idx1][idx2] != -1) {
            return dp[idx1][idx2] == 1;
        }

        boolean ans;

        // * case
        if (s2.charAt(idx2) == '*') {

            // zero occurrence
            boolean first = findMatch(idx1, idx2 - 2, s1, s2, dp);

            // one or more occurrence
            boolean second = false;
            if (idx2 - 1 >= 0 &&
               (s2.charAt(idx2 - 1) == '.' || s2.charAt(idx2 - 1) == s1.charAt(idx1))) {
                second = findMatch(idx1 - 1, idx2, s1, s2, dp);
            }

            ans = first || second;
        }

        // normal match or '.'
        else if (s2.charAt(idx2) == '.' || s1.charAt(idx1) == s2.charAt(idx2)) {
            ans = findMatch(idx1 - 1, idx2 - 1, s1, s2, dp);
        }

        else {
            ans = false;
        }

        dp[idx1][idx2] = ans ? 1 : 0;
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = ".*";

        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1][n2];
        for (int[] ar : dp) {
            Arrays.fill(ar, -1);
        }

        boolean res = findMatch(n1 - 1, n2 - 1, s1, s2, dp);
        System.out.println(res); // true
    }
}
