public class SortColorsDutchFlagAlgo {
    public static void main(String[] args) {
        int[] arr = {2,1,0,2,1,0,1,2,0,1,2,0};

        int n = arr.length;

        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            }
            else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
            else{
                mid++;
            }
        }

        for(int el : arr){
            System.out.print(el + " ");
        }
    }
}
