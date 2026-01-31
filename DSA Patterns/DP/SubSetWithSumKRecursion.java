public class SubSetWithSumKRecursion {

    public static int findCnt(int[] arr, int k, int idx){

        if(idx==0){
            if(k==0 && arr[idx]==0) return 2;
            if(k==0 || arr[idx]==k) return 1;
            return 0;
        }

        if(k<0) return 0;

        int take = findCnt(arr, k-arr[idx], idx-1);
        int notTake = findCnt(arr, k, idx-1);

        return take+notTake;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 3;

        int n = arr.length;
        int res = findCnt(arr,k,n-1);
        System.out.println(res);
    }
}
