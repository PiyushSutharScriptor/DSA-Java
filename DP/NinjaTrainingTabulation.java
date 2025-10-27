import java.util.*;

public class NinjaTrainingTabulation {

    public static int meritPoints(int[][] task){
        int n = task.length;

        int[][] dp = new int[n][4];

        //base case values : 
        for(int i=0 ; i<=2 ; i++){
            int maxi = 0;
            for(int j=0 ; j<=2 ; j++){
                if(j!=i){
                    maxi = Math.max(maxi,task[0][j]);
                };
            }
            dp[0][i] = maxi;
        }

        //remaining elements : 
        for(int day=1 ; day<n ; day++){
            for(int last=0 ; last<4 ; last++){
                int maxi = 0;
                for(int i=0 ; i<=2 ; i++){
                    if(i!=last){
                        int point = task[day][i]+dp[day-1][i];
                        maxi = Math.max(point,maxi);
                    }
                }
                dp[day][last] = maxi;
            }
        }

        return dp[n-1][3];

    }
    public static void main(String[] args) {
        int[][] task = {{10, 40, 70},{20, 50, 80},{30, 60, 90}};
        
        int res = meritPoints(task);
        System.out.println(res);
    }
}
