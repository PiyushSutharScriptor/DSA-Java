import java.util.*;

public class KthLargestElementInStreamOptimized {
    PriorityQueue<Integer> min;
    int size;
    public KthLargestElementInStreamOptimized(int k, int[] nums) {
        min = new PriorityQueue<>();
        size = k;

        for(int el : nums){
            min.add(el);
        }
    }
    
    public int add(int val) {
        min.add(val);

        while(min.size()>size){
            min.poll();
        }

        return min.peek();
    }

    public static void main(String[] args) {
        int arr[] = {4,5,8,2};
        int k = 3;

        KthLargestElementInStreamOptimized m1 = new KthLargestElementInStreamOptimized(k, arr);

        System.out.println(m1.add(5));
        System.out.println(m1.add(8));
        System.out.println(m1.add(10));
        System.out.println(m1.add(15));

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
