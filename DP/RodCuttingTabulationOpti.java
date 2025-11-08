public class RodCuttingTabulationOpti {

    public static int findMaxi(int[] price, int target){

        int n = price.length;

        int[]dp = new int[target+1];

        for(int idx = 1 ; idx<n ; idx++){

            int[] temp = new int[target+1];

            for(int t=0 ; t<=target ; t++){
                int notTake = 0 + dp[t];

                int take = 0;
                if(idx+1<=t){
                    take = price[idx] + temp[t-(idx+1)];
                }

                temp[t] = Math.max(take,notTake);
            }

            dp = temp;
        }

        return dp[target];
 
    }

    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9};
        int target = 4;

        int res = findMaxi(price,target);
        System.out.println(res);
    }
}

