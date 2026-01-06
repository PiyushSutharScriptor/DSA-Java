import java.util.*;

public class MaxHeap {
    public static void main(String[] args) {
        int[] arr = {3,5,2,52,5,2};
        
        PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());

        for(int el : arr){
            min.add(el);
        }

        while(!min.isEmpty()){
            System.out.print(min.poll() + " ");
        }

    }
}
