import java.util.*;

public class InsertionAndBalancingForMedian {
    public static void main(String[] args) {
        int[] arr = {10,5,20,3,15};

        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0 ; i<arr.length ; i++){

            //inserting
            if(max.peek()!=null && arr[i]<=max.peek()){
                max.add(arr[i]);
            }
            else{
                min.add(arr[i]);
            }

            //balancing
            if(max.size()>min.size()+1){
                min.add(max.poll());
            }
            else{
                max.add(min.poll());
            }
        }

        System.out.println(max);
        System.out.println(min);
    }    
}
