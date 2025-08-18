import java.util.*;
import java.util.PriorityQueue;

public class PriorityQueueMaxBasedBasics {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        //add
        pq.add(50);
        pq.add(40);
        pq.add(70);
        pq.add(1);

        System.out.println(pq);

        //pop from top
        pq.poll();
        System.out.println(pq);
        
        //peek
        System.out.println(pq.peek());
        
        //size
        System.out.println(pq.size());
        
        //clear
        pq.clear();
        System.out.println(pq);
    }
}
