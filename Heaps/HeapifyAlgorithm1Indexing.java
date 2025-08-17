
public class HeapifyAlgorithm1Indexing {
    public static void heapify(int i, int arr[], int n){

        while(2*i<=n){
            int left = 2*i;
            int right = 2*i+1;
            int largest = i;
            
            if(left<=n && arr[left]>arr[largest]) largest=left;
            if(right<=n && arr[right]>arr[largest]) largest=right;

            if(largest!=i){
                int temp = arr[largest];
                arr[largest] = arr[i];
                arr[i] = temp;

                i = largest;
            }
            else break ;
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1,54,53,55,52,50};

        int n = arr.length-1;

        for(int i=n/2 ; i>=1 ; i--){
            heapify(i,arr,n);
        }

        for(int i=1 ; i<=n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
