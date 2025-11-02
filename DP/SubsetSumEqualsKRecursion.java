public class SubsetSumEqualsKRecursion {

    public static boolean findSet(int idx, int target, int[] arr){
        if(idx<0) return false;
        if(target==0) return true;
        if(idx==0 && arr[idx]==target) return true;

        boolean notTake = findSet(idx-1, target, arr);
        boolean take = false;

        if(arr[idx]<=target){
            take = findSet(idx-1, target-arr[idx], arr);
        }

        return notTake||take;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 5;

        int n = arr.length;
        System.out.println(findSet(n-1,target,arr));
    }
}
