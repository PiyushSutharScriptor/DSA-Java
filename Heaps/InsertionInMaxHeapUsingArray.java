class Heap{
    public int arr[];
    public int size;

    Heap(int len){
        arr = new int[len];
        size = 0;
    }

    public void insert(int value){
        size++;
        arr[size] = value;

        int idx = size;
        while(idx>1){
            if(arr[idx/2] < arr[idx]){
                int temp = arr[idx];
                arr[idx] = arr[idx/2];
                arr[idx/2] = temp;
            }
            else{
                return;
            }
            idx/=2;
        }
    }

    public void printHeap(){
        for(int i=1 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}

public class InsertionInMaxHeapUsingArray {
    public static void main(String[] args) {
        Heap h1 = new Heap(6);

        h1.insert(60);
        h1.insert(70);
        h1.insert(40);
        h1.insert(90);
        h1.insert(100);

        h1.printHeap();
    }
}
