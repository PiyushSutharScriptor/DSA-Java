
public class SearchElementInRotatedBinarySearch
{
	public static void main(String[] args) {
	    int arr[] = {7,8,9,1,2,3,4,5,6};
	    int n = arr.length;
	    
	    int target = 7;
	    
	    int low = 0;
	    int high = n-1;
	    boolean find = false;
	    
	    while(low<=high){
	        int mid = (low+high)/2;
	        
	        if(arr[mid] == target){
	            System.out.println("element found at index : " + mid);
	            find = true;
	            break;
	        }
	        if(arr[low] <= arr[mid]){
	            if(arr[low]<=target && target <= arr[mid]){
	                high = mid-1;
	            }
	            else{
	                low = mid+1;
	            }
	        }
	        else{
	            if(arr[mid]<=target && target<=arr[high]){
	                low = mid+1;
	            }
	            else{
	                high = mid-1;
	            }
	        }
	        
	    }
	    
	    if(!find){
	    System.out.println("element not found");
	    }
	}
}