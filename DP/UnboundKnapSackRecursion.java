public class UnboundKnapSackRecursion {

    public static int findMax(int idx, int[] wt, int[] val, int target){
        if(target==0) return 0;
        if(idx<0) return 0;

        int notTake = 0 + findMax(idx-1, wt, val, target);

        int take = 0;
        if(wt[idx]<=target){
            take = val[idx] + findMax(idx, wt, val, target-wt[idx]);
        }

        return Math.max(take, notTake);
    }

    public static void main(String[] args) {
        int[] wt = {2,4,6};
        int[] val = {5,11,13};
        int target = 10;

        int n = wt.length;
        int res = findMax(n-1, wt, val, target);
        System.out.println(res);
    }
}
