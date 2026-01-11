import java.util.*;

public class KthSmallestElementInMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;

        int n = arr.length;

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                heap.add(arr[i][j]);
                if(heap.size()>k) heap.poll();
            }
        }

        System.out.println(heap.peek());

    }
}
