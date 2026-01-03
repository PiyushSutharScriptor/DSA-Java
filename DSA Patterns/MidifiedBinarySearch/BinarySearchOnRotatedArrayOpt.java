public class BinarySearchOnRotatedArrayOpt {

    public static int searchEl(int[] arr, int t){
        int n = arr.length;

        int low= 0; 
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]<=arr[high]){
                if(t>=arr[mid] && t<=arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            else{
                if(t>=arr[low] && t<=arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        int target = 4;

        System.out.println(searchEl(arr,target));
    }
}
