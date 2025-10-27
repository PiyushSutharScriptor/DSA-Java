public class NinjaTrainingTabulationOpti {

    public static int meritPoints(int[][] task){
        int n = task.length;

        int[]dp = new int[4];

        //base case values : 
        for(int i=0 ; i<=2 ; i++){
            int maxi = 0;
            for(int j=0 ; j<=2 ; j++){
                if(j!=i){
                    maxi = Math.max(maxi,task[0][j]);
                };
            }
            dp[i]= maxi;
        }

        //remaining elements : 
        for(int day=1 ; day<n ; day++){
            int[] temp = new int[4];

            for(int last=0 ; last<4 ; last++){
                int maxi = 0;

                for(int i=0 ; i<=2 ; i++){
                    if(i!=last){
                        maxi = Math.max(task[day][i]+dp[i],maxi);
                    }
                }
                temp[last] = maxi;
            }
            dp = temp;
        }

        return dp[3];
    }
    public static void main(String[] args) {
        int[][] task = {{10, 40, 70},{20, 50, 80},{30, 60, 90}};
        
        int res = meritPoints(task);
        System.out.println(res);
    }
}

