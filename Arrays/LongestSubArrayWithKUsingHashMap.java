import java.util.*;
public class LongestSubArrayWithKUsingHashMap {
    public static void main(String[] args){
        
	   int arr[] = {1,-4,0,0,2,1,1,0,-2,3};
	   int n = arr.length;
	   
	   int k = 4;
	   int maxLength = 0;
	   int sum = 0;
	   
	   HashMap<Integer , Integer> map = new HashMap<>();
	   
	   for(int i=0 ; i<n ; i++){
	        sum+=arr[i];
	        
	        if(sum==k){
	            maxLength = i+1;
	        }
	        
	        if(map.containsKey(sum-k)){
	            int preIdx = map.get(sum-k);
	            int length = i-preIdx;
	            
	            if(length>maxLength){
	                maxLength = length;
	            }
	        }
	        
	        if(!map.containsKey(sum)){
	            map.put(sum,i);
	        }
	   }

	   System.out.println("The longest subarray of sum " + k + " : " + maxLength);
	  
	}
}