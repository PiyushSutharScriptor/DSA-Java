public class PrintLongestPalindromeSubsequenceTabulation{
    public static void main(String[] args) {
        String s1 = "bbbab";

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

        int size = dp[n][n];
        int i=n;
        int j=n;
        char res[] = new char[size];

        while (i>0 && j>0) {
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                res[size-1] = s1.charAt(i-1);
                size--;
                i--;
                j--;
            }
            else{
                if(dp[i-1][j]>dp[i][j-1]) i--;
                else j--;
            }
        }

        for(char ch : res){
            System.out.print(ch + " ");
        }

    }
}

