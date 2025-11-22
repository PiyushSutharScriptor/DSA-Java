public class BurstBallonsTabulation{

    public static int maxCoins(int[] arr){

        int n = arr.length-2;
        int[][] dp = new int[n+2][n+2];

        for(int i=n ; i>=1 ; i--){
            for(int j=i ; j<=n ; j++){

                if(i>j) continue;
                int maxi = Integer.MIN_VALUE;

                for(int ind=i ; ind<=j ; ind++){
                    int cost = arr[i-1]*arr[ind]*arr[j+1]
                                + dp[i][ind-1]
                                + dp[ind+1][j];

                    maxi = Math.max(maxi,cost);
                }

                dp[i][j] = maxi;
            }
        }

        return dp[1][n];
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 8};
        int n = arr.length;

        int size = n+2;
        int[] ballons = new int[size];
        
        ballons[0] = 1;
        ballons[size-1] = 1;
        for(int i=1 ; i<size-1 ; i++) ballons[i]=arr[i-1];

        int res = maxCoins(ballons);
        System.out.println(res);
    }
}

