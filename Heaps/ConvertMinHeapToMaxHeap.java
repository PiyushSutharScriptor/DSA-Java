public class ConvertMinHeapToMaxHeap {

    public static void heapify(int arr[] , int n , int i){
        int left = 2*i+1;
            int right = 2*i+2;
            int largest = i;

            if(left<n && arr[left]>arr[largest]) largest=left;
            if(right<n && arr[right]>arr[largest]) largest=right;

            if(largest!=i){
                int temp = arr[largest];
                arr[largest] = arr[i];
                arr[i] = temp;

                heapify(arr, n, largest);
            }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 21, 23};

        int n = arr.length;

        for(int i=n/2-1 ; i>=0 ; i--){
            heapify(arr, n, i);
        }

        for(int el : arr){
            System.out.print(el + " ");
        }
    }
}
