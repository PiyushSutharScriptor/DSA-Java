public class PeakElement{

    public static int findEle(int[] arr){
        int n = arr.length;
        int low = 1;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]>arr[low] && arr[mid]>arr[high]){
                return mid;
            }
            else if(arr[low-1]<arr[low]){
                low = mid+1;
            }
            else{
                high = mid-1;
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