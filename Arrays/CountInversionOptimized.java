import java.util.ArrayList;

public class CountInversionOptimized {
    
    
    public static int mergeSort(int arr[], int low, int high, int n) {
        int count = 0; 

        if (low >= high)
            return 0 ;
        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid, n );
        count += mergeSort(arr, mid + 1, high, n );
        count += merge(arr, low, mid, high, n);
        // println(count);
        
        return count;
    }

    public static int merge(int arr[], int low, int mid, int high, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
                
            //right is smaller 
            } else {
                temp.add(arr[right]);
                count+=mid-left+1;
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
        
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {5,3,2,4,1};

        int n = arr.length;

        int low = 0;
        int high = arr.length - 1;
        int res = mergeSort(arr, low, high, n);

        System.out.println("The count : " + res);
    }
}
