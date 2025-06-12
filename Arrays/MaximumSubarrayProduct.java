

public class MaximumSubarrayProduct
{
	public static void main(String[] args) {
	    int arr[] = {-3,0,1,-2};
	    int n = arr.length;
	    
	    int maxNum = Integer.MIN_VALUE;
	    int prefix = 1;
	    int suffix = 1;
	    for(int i=0 ; i<n ; i++){
	        prefix*=arr[i];
	        
	        if(prefix>maxNum){
	            maxNum = prefix;
	        }
	        if (prefix == 0) prefix = 1; 
	    }
	    
	    for(int i=n-1 ; i>=0 ; i--){
	        suffix*=arr[i];
	        
	        if(suffix>maxNum){
	            maxNum = suffix;
	        }
	        if (suffix == 0) suffix = 1; 
	    }
	    
	    System.out.println("Maximum subarray product : " + maxNum);

	}
}