import java.util.*;

public class KthLargestElementOpti {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>();

        for(int el : nums){
            min.add(el);

            if(min.size()>k){
                min.poll();
            }
        }

        return min.peek();
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,6,7,1};
        int k=2;

        int res = findKthLargest(arr,k);
        System.out.println(res);
    }
}
