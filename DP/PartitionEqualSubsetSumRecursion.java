public class PartitionEqualSubsetSumRecursion {

    public static boolean findSum(int[] arr, int idx, int t){
        if(t==0) return true;
        if(idx<0) return false;
        if(idx==0 && arr[idx]==t) return true;

        boolean notTake = findSum(arr, idx-1, t);
        boolean take = false;

        if(arr[idx]<=t){
            take = findSum(arr, idx-1, t-arr[idx]);
        }

        return take||notTake;
    }
    public static void main(String[] args) {
        int[] arr = {1, 10, 21, 10};

        int n = arr.length;

        int sum =0;
        for(int el : arr){
            sum+=el;
        }

        if(sum%2==0){
            System.out.println(findSum(arr,n-1,sum/2));
        }
        else System.out.println(false);
    }
}
