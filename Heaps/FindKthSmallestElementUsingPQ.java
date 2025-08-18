import java.util.*;

public class FindKthSmallestElementUsingPQ {
    public static void main(String[] args) {

        //Note : In findig smallest we use min heap
        int arr[] = {11, 9, 8, 7, 3, 1};
        int k = 4;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0 ; i<arr.length ; i++){
            pq.add(arr[i]);
        }

        while(k!=1){
            pq.poll();
            k--;
        }

        System.out.println(pq.peek());
    }
}
