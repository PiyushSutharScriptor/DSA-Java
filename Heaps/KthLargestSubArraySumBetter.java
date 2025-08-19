import java.util.*;

public class KthLargestSubArraySumBetter {
    public static void main(String[] args) {
        int arr[] = {3 , -2 , 5};
        int k = 3;

        int n = arr.length;
        PriorityQueue <Integer> pq = new PriorityQueue<>();

        for(int i=0 ; i<n ; i++){
            int sum = 0;

            for(int j=i ; j<n ; j++){
                sum+=arr[j];

                if(pq.size()<k){
                    pq.add(sum);
                }
                else{
                    if(sum>pq.peek()){
                        pq.poll();
                        pq.add(sum);
                    }
                }
            }
        }

        System.out.println(pq.peek());
    }
}
