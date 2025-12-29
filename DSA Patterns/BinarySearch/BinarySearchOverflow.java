
public class BinarySearchOverflow{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;

        int n = arr.length;

        int l = 0;
        int r = n-1;
        int res = -1;

        while(l<=r){
            int mid = l+(r-l)/2;

            if(arr[mid]==target){
                res = mid;
                break;
            }
            else if(arr[mid]>target) r=mid-1;
            else l = mid+1;
        }

        System.out.println(res);
    }
}
