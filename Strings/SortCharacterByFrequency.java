import java.util.*;

public class SortCharacterByFrequency
{
	public static void main(String[] args) {
	    String s = "treeeaa";
	    
	    Map<Character, Integer> freq = new HashMap<>();
	    for(char ch : s.toCharArray()){
	        freq.put(ch,freq.getOrDefault(ch,0)+1);
	    }
	    
	    PriorityQueue<Map.Entry<Character,Integer>> heap = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
	    
	    heap.addAll(freq.entrySet());
	    
	    StringBuilder sb = new StringBuilder();
	    
	    while(!heap.isEmpty()){
	        Map.Entry<Character,Integer> entry = heap.poll();
	        char ch = entry.getKey();
	        int count = entry.getValue();
	        
	        for(int i=0 ; i<count ; i++){
	            sb.append(ch);
	        }
	        
	    }
	    
	    
	    System.out.println(sb);
	}
}