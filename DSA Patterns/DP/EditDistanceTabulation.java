public class EditDistanceTabulation{

    public static int findMin(String s1, String s2){

        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1+1][n2+1];

        //base cases
        for(int i=0 ; i<=n2 ; i++){
            dp[0][i] = i;
        }
        for(int i=0 ; i<=n1 ; i++){
            dp[i][0] = i;
        }

        //loops
        for(int idx1=1 ; idx1<=n1 ; idx1++){
            for(int idx2=1 ; idx2<=n2 ; idx2++){

                if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
                    dp[idx1][idx2]=dp[idx1-1][idx2-1];
                }

                else{
                    dp[idx1][idx2] = Math.min( 
                        Math.min(
                            1+dp[idx1][idx2-1],
                            1+dp[idx1-1][idx2-1]
                        ),
                        1+dp[idx1-1][idx2]
                    );
                }
            }
        }

        return dp[n1][n2];
    }

    public static void main(String[] args) {
        String s1 = "sea";
        String s2 = "ate";

        int n1 = s1.length();
        int n2 = s2.length();

        if(s1.length()==0){
            System.out.println(n2);
        } 
        else if(s2.length()==0){
            System.out.println(n1);
        }
        else{
            int res = findMin(s1, s2);
            System.out.println(res);
        }
    }
}

