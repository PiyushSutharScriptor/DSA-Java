//Zero based indexing  
public class HeapifyAlgorithm0Indexing {

    public static void heapify(int i, int arr[], int n){

        while((2*i+1)<n){
            int left = 2*i+1;
            int right = 2*i+2;
            int largest = i;
            
            if(left<n && arr[left]>arr[largest]) largest=left;
            if(right<n && arr[right]>arr[largest]) largest=right;

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
        int arr[] = {54,53,55,52,50};

        int n = arr.length;

        for(int i=n/2-1 ; i>=0 ; i--){
            heapify(i,arr,n);
        }

        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
