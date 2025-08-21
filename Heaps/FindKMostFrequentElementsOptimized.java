import java.util.*;

public class FindKMostFrequentElementsOptimized {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,4};
        int k=2;

        Map<Integer,Integer> freq = new HashMap<>();

        for(int el : arr){
            freq.put(el, freq.getOrDefault(el,0)+1);
        }

        int res[] = new int [k];
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        pq.addAll(freq.entrySet());

        int i=0;
        while(i<k){
            Map.Entry<Integer,Integer> map = pq.poll();
            res[i] = map.getKey();
            i++;
        }

        for(int el : res){
            System.out.print(el+" ");
        }
    }
}
