import java.util.*;

public class SlidingWindowMaximumOptimized {
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,2,1,6};
        int k = 3;

        int n = arr.length;

        List<Integer> li = new ArrayList<>();
        Deque<Integer> deq = new ArrayDeque<>();

        for(int i=0 ; i<n ; i++){
            if(!deq.isEmpty() && deq.peekFirst()<=i-k){
                deq.removeFirst();
            }

            while(!deq.isEmpty() && arr[deq.peekLast()]<=arr[i]){
                deq.removeLast();
            }

            deq.addLast(i);

            if(i>=k-1){
                li.add(arr[deq.peekFirst()]);
            }
        }

        System.out.println(li);

        //notes : 
        /*
            functions used : 
            -> peekFirst() 
            -> peekLast()
            -> removeFirst()
            -> removeLast()
            -> isEmpty()
        */

    }
}
