import java.util.*;

public class CountUniquePathsInGridTabulationOpti {

    public static int findPaths(int m, int n){
        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        for(int i=0 ; i<m ; i++){

            int[] temp = new int[n];
            for(int j=0 ; j<n ; j++){

                if(i==0 && j==0) temp[0]=1;
                else{
                    int left = 0;
                    int up = 0;
                    
                    if(j>0) left = temp[j-1];
                    if(i>0) up = dp[j];
                    
                    temp[j] = left+up;
                }

            }
            dp = temp;
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 4; 

        int res = findPaths(m,n);
        System.out.println(res);
    }
}

