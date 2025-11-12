public class EditDistanceTabulationOpt {

    public static int findMinEdit(String s1, String s2){

        int m = s1.length();
        int n = s2.length();

        int[]dp = new int[n+1];

        for(int i=0 ; i<=n ; i++){
            dp[i] = i;
        }

        for(int idx1=1 ; idx1<=m ; idx1++){

            int[] temp = new int[n+1];
            temp[0] = idx1;

            for(int idx2=1 ; idx2<=n ; idx2++){

                if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
                    temp[idx2] = 0 + dp[idx2-1];
                }

                else{
                    int insert = 1 + dp[idx2-1];
                    int remove = 1 + dp[idx2];
                    int replace = 1 + dp[idx2-1];
                    
                    temp[idx2] = Math.min(insert,Math.min(remove,replace));
                }
            }

            dp = temp;
        }

        return dp[n];

    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "azced";

        int res = findMinEdit(s1, s2);
        System.out.println(res);

        //4
    }
}


