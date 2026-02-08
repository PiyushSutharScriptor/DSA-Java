import java.util.*;

public class WildCardMatchingMemoization{

    public static boolean findMat(int idx1, int idx2, String s, String p, int[][] dp ){
        //base cases 

        //i and j exhausted
        if(idx1<0 && idx2<0) return true;

        // i exhausted
        if(idx2<0 && idx1>=0) return false;

        //j exhausted
        if(idx1<0 && idx2>=0){
            if(p.charAt(idx2)=='*'){
                return findMat(idx1, idx2-1, s, p,dp);
            }
            return false;
        }

        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2]==1;

        boolean ans;

        if(p.charAt(idx2)=='*'){
             ans = findMat(idx1-1, idx2, s, p, dp) || 
                    findMat(idx1, idx2-1, s, p, dp);
        }
        else if((s.charAt(idx1)==p.charAt(idx2)) || (p.charAt(idx2)=='?')){
             ans = findMat(idx1-1, idx2-1, s, p, dp);
        }
        else{
            ans = false;
        }
        
        dp[idx1][idx2]=ans?1:0;
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abdefcd";
        String s2 = "ab*cd";

        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1][n2];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        boolean res = findMat(n1-1, n2-1, s1, s2, dp);
        System.out.println(res);
    }
}
