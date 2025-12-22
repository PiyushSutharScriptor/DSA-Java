import java.util.*;

public class MedianFromDataStream{
    public static void main(String[] args) {
        int[] arr = {10,5,20,3,15};

        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0 ; i<arr.length ; i++){
            //add
            if(max.peek()==null || arr[i]<=max.peek()){
                max.add(arr[i]);
            }
            else{
                min.add(arr[i]);
            }

            //balance
            if(max.size()>min.size()+1){
                min.add(max.poll());
            }
            else if(min.size()>max.size()){
                max.add(min.poll());
            }
        }

        if(max.size()==min.size()){
            System.out.println(max.peek()+min.peek()/2);
        }
        else{
            System.out.println(max.peek());
        }
    }
}