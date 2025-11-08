
public class LongestCommonSubsequenceTabulationOpt {

    public static int findCount(String s1, String s2){

        int m = s1.length();
        int n = s2.length();

        int[] dp = new int[n+1];

        for (int i = 1; i <= m; i++) {

            int[] temp = new int[n+1];

            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    temp[j] = 1 + dp[j - 1];
                } else {
                    temp[j] = Math.max(dp[j], temp[j - 1]);
                }
            }

            dp = temp;
        }
        
        return dp[n];

    }
    public static void main(String[] args) {
        String s1 = "bdefg";
        String s2 = "bfg";

        int res = findCount(s1,s2);
        System.out.println(res);
    }
}

