
public class MinimumInRotatedSortedBrute
{
	public static void main(String[] args) {
	    int arr[] = {4,5,6,7,0,1,2};
	    
	    int n = arr.length;
	    
	    int min = Integer.MAX_VALUE;
	    
	    for(int i=1 ; i<n ; i++){
	        if(arr[i]<arr[i-1]){
	            int minEl = arr[i];
	            
	            if(minEl < min){
	                min = minEl;
	            }
	        }
	    }
	    
	    System.out.println("Element : " + min);
	}
}