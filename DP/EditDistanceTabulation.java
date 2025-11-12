public class EditDistanceTabulation {

    public static int findMinEdit(String s1, String s2){

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m+1][n+1];

        for(int i=0 ; i<=m ; i++){
            dp[i][0] = i;
        }

        for(int j=0 ; j<=n ; j++){
            dp[0][j] = j;
        }

        for(int idx1=1 ; idx1<=m ; idx1++){
            for(int idx2=1 ; idx2<=n ; idx2++){

                if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
                    dp[idx1][idx2] = 0 + dp[idx1-1][idx2-1];
                }

                else{
                    int insert = 1 + dp[idx1][idx2-1];
                    int remove = 1 + dp[idx1-1][idx2];
                    int replace = 1 + dp[idx1-1][idx2-1];
                    
                    dp[idx1][idx2] = Math.min(insert,Math.min(remove,replace));
                }
            }
        }

        return dp[m][n];

    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "azced";

        int res = findMinEdit(s1, s2);
        System.out.println(res);

        //4
    }
}


