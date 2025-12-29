public class PeakElement {

    public static int findPeak(int[]arr){
        int n = arr.length;

        int l = 1;
        int r = n-2;

        while(l<=r){
            int mid = l+(r-l)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;

            if(arr[mid]>arr[mid-1]) l=mid+1;
            else r=mid-1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1};

        int res = findPeak(arr);
        System.out.println(res);
    }
}
