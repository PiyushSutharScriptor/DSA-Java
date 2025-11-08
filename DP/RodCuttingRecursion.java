public class RodCuttingRecursion {

    public static int findMaxi(int idx, int[] price, int target){

        if(target==0) return 0;
        if(idx<0) return 0;

        int notTake = 0 + findMaxi(idx-1, price, target);

        int take = 0;
        if(idx+1<=target){
            take = price[idx] + findMaxi(idx, price, target-(idx+1));
        }

        return Math.max(take,notTake);
 
    }

    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9};
        int target = 4;

        int n = price.length;
        int res = findMaxi(n-1,price,target);
        System.out.println(res);
    }
}
