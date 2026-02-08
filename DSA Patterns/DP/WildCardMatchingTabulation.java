public class WildCardMatchingTabulation {   

    public static boolean findMat(String s, String p){
        int n1 = s.length();
        int n2 = p.length();

        boolean[][] dp = new boolean[n1+1][n2+1];

        //base cases 

        //i and j exhausted
        dp[0][0] = true;

        // i exhausted
        for(int i=1 ; i<=n1 ; i++){
            dp[i][0] = false;
        }

        //j exhausted
        for(int j=1 ; j<=n2 ; j++){
            if(p.charAt(j-1) == '*')
                dp[0][j] = dp[0][j-1];
            else
                dp[0][j] = false;
        }



        for(int idx1=1 ; idx1<=n1 ; idx1++){
            for(int idx2=1 ; idx2<=n2 ; idx2++){
                boolean ans;

                if(p.charAt(idx2-1)=='*'){
                    ans = dp[idx1-1][idx2]|| 
                        dp[idx1][idx2-1];
                }
                else if((s.charAt(idx1-1)==p.charAt(idx2-1)) || (p.charAt(idx2-1)=='?')){
                    ans = dp[idx1-1][idx2-1];
                }
                else{
                    ans = false;
                }
                    
                dp[idx1][idx2]=ans;
            }
        }

        return dp[n1][n2];

    }

    public static void main(String[] args) {
        String s1 = "abdefcd";
        String s2 = "ab*cd";

        boolean res = findMat(s1, s2);
        System.out.println(res);
    }
}
