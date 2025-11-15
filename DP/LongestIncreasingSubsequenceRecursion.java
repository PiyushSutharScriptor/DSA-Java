public class LongestIncreasingSubsequenceRecursion {

    public static int findMax(int curr, int prev, int n, int[] arr){
        if(curr>=n || prev>=n) return 0;
        
        int notTake = findMax(curr+1, prev, n, arr);

        int take = 0;
        if(prev==-1 || arr[curr]>arr[prev]){
            take = 1 + findMax(curr+1, curr, n, arr);
        }

        return Math.max(notTake, take);
    }

    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};

        int n = arr.length;

        int res = findMax(0,-1,n,arr);
        System.out.println(res);
    }
}
