public class LongestCommonSubstringTabulationOpti {
    public static void main(String[] args) {
        String s1 = "abcdxyz";
        String s2 = "xyzabcd";

        int m = s1.length();
        int n = s2.length();

        int[] dp = new int[n+1];

        int maxi = -1;

        for(int idx1=1 ; idx1<=m ; idx1++){

            int temp[] = new int[n+1];

            for(int idx2=1 ; idx2<=n ; idx2++){
                if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
                    temp[idx2] = 1 + dp[idx2-1];
                    maxi = Math.max(maxi,temp[idx2]);
                }
            }
            dp = temp; 
        }

        System.out.println(maxi);
    }
}

