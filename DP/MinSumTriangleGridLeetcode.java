import java.util.*;

public class MinSumTriangleGridLeetcode {
     public static int findPaths(List<List<Integer>> arr){
        int m = arr.size();

        int len = arr.get(m-1).size();
        int[]dp = new int[len];
        for(int i=0 ; i<len ; i++){
            dp[i] = arr.get(len-1).get(i);
        }

        for(int i=m-2 ; i>=0 ; i--){
            int[] temp = new int[arr.get(i).size()];
            for(int j=0 ; j<i+1 ; j++){  
                int down = arr.get(i).get(j) + dp[j];
                int diag = arr.get(i).get(j) + dp[j+1];

                temp[j] = Math.min(down,diag);
            }
            dp = temp;
        }

        return dp[0];
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int res = findPaths(triangle);
        return res;
    }
}