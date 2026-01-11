import java.util.*;

public class SortCharByFreq{
    public static void main(String[] args) {
        String s = "aaaabccce";
        
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> heap = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());

        heap.addAll(map.entrySet());

        StringBuilder res = new StringBuilder();
        while(!heap.isEmpty()){
            Map.Entry<Character,Integer> mp = heap.poll();

            char ch = mp.getKey();
            int count = mp.getValue();

            while(count>0){
                res.append(ch);
                count--;
            }
        }

        System.out.println(res);

    }
}