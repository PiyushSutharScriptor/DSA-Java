// 0 based indexing
public class HeapSort {
    public static void main(String[] args) {
        int arr[] = {70,60,55,45,50};

        int n = arr.length;

        int size = n-1;
        while(size>0){
            //step : 1 swap first and last element
            int temp = arr[0];
            arr[0] = arr[size];
            arr[size] = temp;
            
            size--;
            //step : 2 place the first element in its correct position heapify function
            int i=0;
            while((2*i+1)<=size){

                int left = 2*i+1;
                int right = 2*i+2;
                int largest = i;
                
                if(left<=size && arr[left]>arr[largest]) largest=left;
                if(right<=size && arr[right]>arr[largest]) largest=right;

                if(largest!=i){
                    int temp2 = arr[largest];
                    arr[largest] = arr[i];
                    arr[i] = temp2;
                    i = largest;
                }
                else break;
            }


        }


        for(int el : arr){
            System.out.print(el + " ");
        }
    }
}
