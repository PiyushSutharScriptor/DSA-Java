public class MatrixChainMultiplication{

    public static int findMin(int i, int j, int[] arr){
        if(i==j) return 0;

        int mini = Integer.MAX_VALUE;

        for(int k=i ; k<j ; k++){
            int steps = arr[i-1]*arr[k]*arr[j]
                        + findMin(i, k, arr)
                        + findMin(k+1, j, arr);
            
            mini = Math.min(mini,steps);
        }

        return mini;

    }
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25};
        int n = arr.length;

        int res = findMin(1,n-1,arr);
        System.out.println(res);
    }
}