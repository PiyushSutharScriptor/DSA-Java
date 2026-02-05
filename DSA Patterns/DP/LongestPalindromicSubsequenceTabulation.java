public class LongestPalindromicSubsequenceTabulation {

    public static int findMax(String s1, String s2){

        int n = s1.length();

        int[][] dp = new int[n+1][n+1];

        for(int idx1=1 ; idx1<=n ; idx1++){
            for(int idx2=1 ; idx2<=n ; idx2++){

                if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
                    dp[idx1][idx2] = 1+dp[idx1-1][idx2-1];
                }
                else{
                    dp[idx1][idx2] = Math.max(dp[idx1-1][idx2],dp[idx1][idx2-1]);
                }
            }
        }

        return dp[n][n];

    }
    public static void main(String[] args) {
        String str = "bbbab";

        String str2 = new StringBuilder(str).reverse().toString();

        int res = findMax(str,str2);
        System.out.println(res);

    }    
}

