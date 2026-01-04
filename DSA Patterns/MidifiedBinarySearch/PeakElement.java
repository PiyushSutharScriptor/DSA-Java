public class PeakElement{

    public static int findEle(int[] arr){
        int n = arr.length;

        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2])return n-1;

        int low = 1;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]>arr[low] && arr[mid]>arr[high]){
                return mid;
            }
            else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};

        int res = findEle(arr);
        System.out.println(res);
    }
}