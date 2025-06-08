import java.util.*;

public class NoOfSubArrayWithXorKOptimized {
	public static void main(String[] args) {
	    int arr[] = {4,2,2,6,4};
	    int n = arr.length;
	    
	    int k = 6;
	    Map<Integer, Integer> map = new HashMap<>();
	 
	    int xor = 0;
	    int count = 0;
	    
	    for(int i=0 ; i<n ; i++){
	        xor ^= arr[i];
	        
	        if(xor==k){
	            count++;
	        }
	        
	        int xr = xor^k;
	        
	        if(map.containsKey(xr)){
	            count+=map.get(xr);
	        }
	        else{
	            map.put(xor, map.getOrDefault(xor,0)+1);
	        }
	        
	    }
	    
	    System.out.println("The number of subarray : " + count);
	}
}