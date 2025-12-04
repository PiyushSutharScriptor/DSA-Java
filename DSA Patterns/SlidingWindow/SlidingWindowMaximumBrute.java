public class SlidingWindowMaximumBrute {

    public static int findMax(int i, int j, int[] arr){
        int maxi = Integer.MIN_VALUE;

        for(int k=i ; k<=j ; k++){
            maxi = Math.max(maxi,arr[k]);
        }

        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int n = arr.length;
        int[] res = new int[n-k+1];

        for(int i=0 ; i<=n-k ; i++){
            res[i] = findMax(i,i+k-1,arr);
        }

        for(int el : res){
            System.out.print(el + " ");
        }
    }
}
