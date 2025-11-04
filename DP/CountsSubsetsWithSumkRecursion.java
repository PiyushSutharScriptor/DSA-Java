public class CountsSubsetsWithSumkRecursion {

    public static int findCount(int[] arr, int idx, int target){
        if(target==0) return 1;
        if(idx<0) return 0;

        int notTake = findCount(arr, idx-1, target);

        int take = 0;
        if(arr[idx]<=target){
            take = findCount(arr, idx-1, target-arr[idx]);
        }

        return take+notTake;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int t = 5;

        int n = arr.length;

        int res = findCount(arr,n-1,t);
        System.out.println(res);
    }
}