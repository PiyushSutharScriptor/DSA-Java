
public class MinInsertionToMakeStrPalindromeTabulation{
    public static void main(String[] args) {
        String s1 = "ba";

        String s2 = new StringBuilder(s1).reverse().toString();
        int n = s1.length();

        int[][] dp = new int[n+1][n+1];

        for(int idx1=1 ; idx1<=n ; idx1++){
            for(int idx2=1 ; idx2<=n ; idx2++){

                if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
                    dp[idx1][idx2] = 1 + dp[idx1-1][idx2-1];
                }
                else{
                    dp[idx1][idx2] = Math.max(dp[idx1-1][idx2] , dp[idx1][idx2-1]);
                }
            }
        }

        System.out.println(n - dp[n][n]);
    }
}
