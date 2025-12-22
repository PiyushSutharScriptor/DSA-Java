import java.util.*;

public class MaxHeap {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 81, 1, 4 };

        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            max.add(arr[i]);
        }

        //top element = largest
        System.out.println(max.peek());
    }
}
