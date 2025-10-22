public class FrogJumpTabulationOpti {

    public static int findMin(int[] arr, int n){
        int first = 0;
        int second = Math.abs(arr[1]-arr[0]);

        for(int i=2 ; i<n ; i++){
            int jump1 = second + Math.abs(arr[i]-arr[i-1]);
            int jump2 = first + Math.abs(arr[i]-arr[i-2]);

            int curr =Math.min(jump1,jump2);
            first = second;
            second = curr;
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,1,4};
        int n = arr.length;

        int res = findMin(arr, n);
        System.out.println(res);
    }
}

