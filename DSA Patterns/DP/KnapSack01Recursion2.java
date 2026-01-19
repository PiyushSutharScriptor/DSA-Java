public class KnapSack01Recursion2{

    public static int findMaxi(int idx, int W, int[] wt, int[] vl){

        // base case
        if(idx==0){
            if(W>=wt[idx]){
                return vl[idx];
            }
            else{
                return 0;
            }
        }

        int notTake = 0 + findMaxi(idx-1, W , wt, vl);
        int take = Integer.MIN_VALUE; 
        if(W-wt[idx]>=0){
            take = vl[idx] + findMaxi(idx-1, W-wt[idx], wt, vl);
        }

        return Math.max(take,notTake); 
    }
    public static void main(String[] args) {
        int wt[] = {3,2,5};
        int vl[] = {30,40,60};
        int W = 6;

        int n = wt.length;
        int res = findMaxi(n-1,W,wt,vl);
        System.out.println(res);
    }    
}
