import java.util.*;

public class FindKthLargestElementBetter {

    public static int findEle(int[] arr, int k){
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for(int el : arr){
            max.add(el);
        }

        for(int i=0 ; i<k-1 ; i++){
            max.poll();
        }

        return max.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3,41,4,58,7,5};
        int k = 2;

        int res = findEle(arr,k);
        System.out.println(res);
    }
}
