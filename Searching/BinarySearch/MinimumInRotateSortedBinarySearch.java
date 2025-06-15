
public class MinimumInRotateSortedBinarySearch
{
	public static void main(String[] args) {
	    int arr[] = {23,24,25,11,13,15,17};
	    int n = arr.length;
	    
	    int low = 0;
	    int high = n-1;
	    int min = Integer.MAX_VALUE;
	    
	    while(low<=high){
	        int mid = (low+high)/2;
	        
            if(arr[low] <= arr[high]){
                min = Math.min(min, arr[low]);
                break;
            }

	        if(arr[low] <= arr[mid]){
	            if(arr[low]<min){
	                min = arr[low];
	            }
	            low = mid+1;
	        }
	        else{
	            high = mid-1;
	            if(arr[mid]<min){
	                min = arr[mid];
	            }
	        }
	        
	    }
	    
	    System.out.println(min);
	}
}