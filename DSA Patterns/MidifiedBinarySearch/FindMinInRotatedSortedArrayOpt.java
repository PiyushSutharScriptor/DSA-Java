public class FindMinInRotatedSortedArrayOpt {

    public static int findMin(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[low]<=arr[high]){
                min = Math.max(arr[low],min);
                break;
            }   

            if(arr[low]<=arr[mid]){
                if(arr[low]<min){
                    min = arr[low];
                }
                low = mid+1;
            }
            else{
                high = mid-1;
                if(arr[mid]<min){
                    min = arr[mid];
                }
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7};

        int res = findMin(nums);
        System.out.println(res);
    }
}
