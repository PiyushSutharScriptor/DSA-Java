public class FrogJump {

    public static int findMin(int[] arr, int n){
        if(n==0) return 0;
        if(n==1) return Math.abs(arr[n]-arr[n-1]);  
        
        int left = findMin(arr, n-1) + Math.abs(arr[n]-arr[n-1]);
        int right = findMin(arr, n-2) + Math.abs(arr[n]-arr[n-2]);

        return Math.min(left,right);
    }

    public static void main(String[] args) {
        int[] arr = {5,2,1,4};
        int n = arr.length;

        int res = findMin(arr,n-1);
        System.out.println(res);
    }
}
