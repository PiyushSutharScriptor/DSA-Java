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


//follow the below code for more clairty 

// import java.util.*;

// public class SortCharacterByFrequency
// {
// 	public static void main(String[] args) {
// 	    String s = "treeeaa";
	    
// 	    //storing frequency of every character
// 	    Map<Character , Integer> freq = new HashMap<>();
// 	    for(char ch : s.toCharArray()){
// 	       freq.put(ch,freq.getOrDefault(ch,0)+1);
// 	    }
	    
// 	    //storing key-pair as per highest frequency
// 	    PriorityQueue<Map.Entry<Character,Integer>> heap = new PriorityQueue<>((a,b)->b.getValue() - a.getValue());
// 	    heap.addAll(freq.entrySet());
	    
// 	    //storing character as per frequency 
// 	    StringBuilder sb = new StringBuilder();
// 	    while(!heap.isEmpty()){
// 	        Map.Entry<Character,Integer> entry = heap.poll(); //heap.poll => gives top pair from heap
// 	        char ch = entry.getKey();
// 	        int count = entry.getValue();
	        
// 	        //adding character as per frequency 
// 	        for(int i=0 ; i<count ; i++){
// 	            sb.append(ch);
// 	        }
// 	    }
	    
// 	    //printing the final string 
// 	    System.out.println(sb);
// 	}
// }