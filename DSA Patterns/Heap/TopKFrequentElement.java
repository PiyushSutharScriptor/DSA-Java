import java.util.*;

public class TopKFrequentElement{

    public static int[] findFreq(int[] arr, int k){
        Map<Integer,Integer> map = new HashMap<>();

        for(int el : arr){
            map.put(el,map.getOrDefault(el,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> min = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        min.addAll(map.entrySet());

        int i=0;
        int[] res = new int[k];

        while(i<k){
            Map.Entry<Integer,Integer> el = min.poll();
            res[i] = el.getKey();
            i++;
        }

        return res;

    }

    public static void main(String[] args) {
        int nums[] = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;

        int[] res = findFreq(nums,k);
        for(int el : res){
            System.out.print(el + " ");
        }
    }
}