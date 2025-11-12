import java.util.*;

public class EditDistanceMemoization {

    public static int findMinEdit(int idx1, int idx2, String s1, String s2, int[][] dp){
        if(idx1<0){
            return idx2+1;
        }

        if(idx2<0){
            return idx1+1;
        }

        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];

        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return dp[idx1][idx2] = 0 + findMinEdit(idx1-1, idx2-1, s1, s2, dp);
        }
        
        int insert = 1 + findMinEdit(idx1, idx2-1, s1, s2, dp);
        int remove = 1 + findMinEdit(idx1-1, idx2, s1, s2, dp);
        int replace = 1 + findMinEdit(idx1-1, idx2-1, s1, s2, dp);

        return dp[idx1][idx2] = Math.min(insert,Math.min(remove,replace));
    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "azced";

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m][n];
        for(int[] ar : dp){
            Arrays.fill(ar,-1);
        }

        int res = findMinEdit(m-1, n-1, s1, s2, dp);
        System.out.println(res);

        //4
    }
}


