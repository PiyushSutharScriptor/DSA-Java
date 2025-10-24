public class MaxSumOfNonAdjElementsRecur {

    public static int findMax(int[] arr, int idx){
        if(idx==0) return arr[0];
        if(idx<0) return 0;

        int pick = arr[idx] + findMax(arr, idx-2);
        int notPick = 0 + findMax(arr, idx-1);

        return Math.max(pick,notPick);
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9};
        int n = arr.length;
        
        int res = findMax(arr, n-1);
        System.out.println(res);
    }
}
