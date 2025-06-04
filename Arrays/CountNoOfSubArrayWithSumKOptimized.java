import java.util.*;

public class CountNoOfSubArrayWithSumKOptimized
{
	public static void main(String[] args) {
	    int arr[] = {1,2,-2,5,3};
	    int n = arr.length;
	    int k = 5;
	    
	    int sum = 0;
	    int count = 0;
	    
	    Map<Integer , Integer> map = new HashMap<>();
	    map.put(0,1);
	    
	    for(int i=0 ; i<n ; i++){
	        sum += arr[i];
	        
	        if(map.containsKey(sum-k)){
	            count += map.get(sum-k);
	        }
	        map.put(sum, map.getOrDefault(sum,0)+1);
	        
	    }
	    
	    System.out.println("The number of subarray : " + count);
	}
}