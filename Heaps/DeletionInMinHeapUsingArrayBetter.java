class Heap{
    private int arr[];
    private int size;

    Heap(int len){
        arr = new int[len+1];
        size = 0;
    }

    public void insert(int value){
        size++;
        arr[size] = value;

        int idx = size;

        while(idx>1){
            if(arr[idx/2]>arr[idx]){
                swap(idx/2, idx);   
            }
            else{
                return;
            }

            idx/=2;
        }
    }

    //deleting root node
    public void delete(){
        if(size==0){
            System.out.println("Nothing to delete");
            return;
        }

        arr[1] = arr[size];
        size--;

        int idx = 1;
        while (2*idx<=size) {
            int left = 2*idx;
            int right = 2*idx+1;
            int smallest = idx;

            if(left<=size && arr[left]<arr[smallest]){
                smallest = left;
            }
            if(right<=size && arr[right]<arr[smallest]){
                smallest = right;
            }

            if(smallest!=idx){
                swap(smallest, idx);
                idx = smallest;
            }
            else return;

        }
    }

    public void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void printHeap(){
        for(int i=1 ; i<=size ; i++){ //optional i<=arr.length;
            System.out.print(arr[i] + " ");
        }
    }
}

public class DeletionInMinHeapUsingArrayBetter {
    public static void main(String[] args) {
        Heap h1 = new Heap(5);

        h1.insert(10);
        h1.insert(20);
        h1.insert(30);
        h1.insert(40);

        h1.printHeap();

        System.out.println();
        
        h1.delete();
        h1.printHeap();
    }
}
