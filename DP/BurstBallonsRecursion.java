public class BurstBallonsRecursion{

    public static int maxCoins(int i, int j, int[] arr){
        if(i>j) return 0;

        int maxi = Integer.MIN_VALUE;

        for(int ind=i ; ind<=j ; ind++){
            int cost = arr[i-1]*arr[ind]*arr[j+1]
                        + maxCoins(i,ind-1,arr)
                        + maxCoins(ind+1,j,arr);

            maxi = Math.max(maxi,cost);
        }

        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 8};
        int n = arr.length;

        int size = n+2;
        int[] ballons = new int[size];
        
        ballons[0] = 1;
        ballons[size-1] = 1;
        for(int i=1 ; i<size-1 ; i++) ballons[i]=arr[i-1];

        int res = maxCoins(1,size-2,ballons);
        System.out.println(res);
    }
}