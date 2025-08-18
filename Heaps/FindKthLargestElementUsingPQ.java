import java.util.*;

public class FindKthLargestElementUsingPQ {
    public static void main(String[] args) {

        //Note : In findig smallest we use max heap
        int arr[] = {11, 9, 8, 7, 3, 1};
        int k = 4;

        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0 ; i<n ; i++){
            pq.add(arr[i]);
        }

        while(k!=1){
            pq.poll();
            k--;
        }

        System.out.println(pq.peek());
    }
}
