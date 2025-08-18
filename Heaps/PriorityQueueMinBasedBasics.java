import java.util.*;
public class PriorityQueueMinBasedBasics {
    public static void main(String[] args) {
        //min-heap based in java
        //max-heap based in cpp

        PriorityQueue<Integer> pq = new PriorityQueue<>();

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
