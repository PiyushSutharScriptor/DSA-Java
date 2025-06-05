import java.util.*;

public class MajorityElementMoreBetterApp
{
	public static void main(String[] args) {
	    int arr[] = {2,2,2};
	    int n = arr.length;
	    int k = n/3;
	    int count = 0;
	    
	    Map<Integer, Integer> map = new HashMap<>();
	    ArrayList <Integer> list = new ArrayList<>();
	    
	    for(int num : arr){
	        
	        if(map.containsKey(num)){
	            map.put(num, map.getOrDefault(num,0)+1);
	        }
	        else{
	            map.put(num,1);
	        }
	        
	        if(map.get(num) == k+1){
	            list.add(num);
	        }
	    }
	   
	    System.out.println(list);
	    
	}
}