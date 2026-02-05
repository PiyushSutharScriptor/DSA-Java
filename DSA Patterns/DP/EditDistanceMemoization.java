import java.util.*;

public class EditDistanceMemoization{

    public static int findMin(int idx1, int idx2, String s1,    String s2, int[][] dp){
        //base cases
        if(idx1<0){
            return idx2+1;
        }
        if(idx2<0){
            return idx1+1;
        }
        if(idx2<0 && idx1<0) return 0;

        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return dp[idx1][idx2]=findMin(idx1-1, idx2-1, s1, s2,dp);
        }
        return dp[idx1][idx2] = Math.min( 
            Math.min(
            1+findMin(idx1, idx2-1, s1, s2,dp),
            1+findMin(idx1-1, idx2-1, s1, s2,dp)
            ),
            1+findMin(idx1-1, idx2, s1, s2,dp)
        );
    }

    public static void main(String[] args) {
        String s1 = "sea";
        String s2 = "ate";

        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1][n2];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        if(s1.length()==0){
            System.out.println(s2.length());
        } 
        else if(s2.length()==0){
            System.out.println(s1.length());
        }
        else{
            int res = findMin(n1-1, n2-1, s1, s2, dp);
            System.out.println(res);
        }
    }
}

