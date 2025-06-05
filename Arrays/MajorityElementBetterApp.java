import java.util.*;

public class MajorityElementBetterApp
{
	public static void main(String[] args) {
	    int arr[] = {1,1,1,3,2,2,2};
	    int n = arr.length;
	    int k = n/3;
	    int count = 0;
	    
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    for(int num : arr){
	        if(map.containsKey(num)){
	            map.put(num, map.getOrDefault(num,0)+1);
	        }
	        else{
	            map.put(num,1);
	        }
	    }
	    
	    for(int num : map.values())
	    if(num > k){
	       count++;
	    }
	    
	    
	    
	    System.out.println(count);
	    
	}
}