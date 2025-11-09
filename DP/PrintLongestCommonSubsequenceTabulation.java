public class PrintLongestCommonSubsequenceTabulation {
    public static void main(String[] args) {
        String s1 = "bdefg";
        String s2 = "bfg";

        int m = s1.length();
        int n = s2.length();

        int[][]dp = new int[m+1][n+1];

        for(int idx1=1 ; idx1<=m ; idx1++){
            for(int idx2=1 ; idx2<=n ; idx2++){
                if(s1.charAt(idx1-1) == s1.charAt(idx2-1)){
                    dp[idx1][idx2] = 1 + dp[idx1-1][idx2-1];
                }
                else{
                    dp[idx1][idx2] = Math.max(dp[idx1-1][idx2] , dp[idx1][idx2-1]);
                }
            }
        }

        for(int i=0 ; i<=m ; i++){
            for(int j=0 ; j<=n ;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        int i = m;
        int j = n;

        int size = dp[m][n];
        char[] res = new char[size];

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
