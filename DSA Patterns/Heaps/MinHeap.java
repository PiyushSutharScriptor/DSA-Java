import java.util.*;

public class MinHeap {
    public static void main(String[] args) {
        int[] arr = {5,4,81,1,4};

        //default min heap ( in java )
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i=0 ; i<arr.length ; i++){
            min.add(arr[i]);
        }

        //top element = smallest
        System.out.println(min.peek());
    }    
}
