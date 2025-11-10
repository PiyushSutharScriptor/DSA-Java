
public class PrintShortestCommonSuperstringTabulation {
    public static void main(String[] args) {
        String s1 = "broot";
        String s2 = "groot";

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        int i=m;
        int j=n;

        StringBuilder str = new StringBuilder();
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                str.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i-1][j]>dp[i][j-1]){
                    str.append(s1.charAt(i-1));
                    i--;
                }
                else{
                    str.append(s2.charAt(j-1));
                    j--;
                }
            }
        }

        while(i>0){
            str.append(s1.charAt(i-1));
            i--;
        }

        while(j>0){
            str.append(s2.charAt(j-1));
            j--;
        }

        str.reverse();
        System.out.println(str);
    }
}


