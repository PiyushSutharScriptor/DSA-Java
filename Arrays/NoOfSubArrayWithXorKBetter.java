import java.util.*;

public class NoOfSubArrayWithXorKBetter {
	public static void main(String[] args) {
	    int arr[] = {4,2,2,6,4};
	    int n = arr.length;
	    int k = 6;
	    int maxCount = 0;
	    
	    for(int i=0 ; i<n ; i++){
	        int sum = 0;
	        for(int j=i ; j<n ; j++){
	            int count = 0;
	            
	            sum ^= arr[j];
	            
	            if(sum == 6){
	                maxCount++;    
	            }
	            
	            
	        }
	    }
	    
	    System.out.println("The number of subarray : " + maxCount);
	}
}