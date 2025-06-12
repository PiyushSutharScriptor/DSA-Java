import java.util.ArrayList;

public class ReversePairsOptimized {
    
    static int count = 0;
    
    public static void countPairs(int arr[], int low, int mid, int high){
        int right = mid+1;
        for(int i=low ; i<=mid ; i++){
            while(right<=high && arr[i]>2*arr[right]){
                right++;
            }
            count += right-(mid+1);
        }
    }
    
    public static void mergeSort(int arr[], int low, int high, int n) {

        if (low >= high)
            return ;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid, n );
        mergeSort(arr, mid + 1, high, n );
        countPairs(arr,low,mid,high);
        merge(arr, low, mid, high, n);
        
    }

    public static void merge(int arr[], int low, int mid, int high, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] < 2*arr[right]) {
                temp.add(arr[left]);
                left++;
                
            //right is smaller 
            } else {
                temp.add(arr[right]);
                right++;
            }

        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i=low ; i<=high ; i++){
            arr[i] = temp.get(i-low);
        }
        
        
    }

    public static void main(String[] args) {
        int arr[] = {2,4,3,5,1};

        int n = arr.length;

        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr, low, high, n);

        System.out.println("The count : " + count);
    }
}
