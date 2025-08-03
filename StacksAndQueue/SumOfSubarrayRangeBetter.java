public class SumOfSubarrayRangeBetter
{
	public static void main(String[] args) {
	    int arr[] = {1,4,3,2};
	    
	    int n = arr.length;
	    
	    int sum = 0;
	    
	    for(int i=0 ; i<n ; i++){
	        int min = arr[i];
	        int max = arr[i];
	        
	        for(int j=i ; j<n ; j++){
	            min = Math.min(arr[j],min);
	            max = Math.max(arr[j],max);
	            sum = sum+(max-min);
	        }
	        
	    }
	    
	    System.out.println(sum);

	}
}