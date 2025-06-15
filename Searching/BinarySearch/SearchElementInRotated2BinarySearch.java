
public class SearchElementInRotated2BinarySearch
{
	public static void main(String[] args) {
	    int arr[] = {3,3,3,3,1,3,3,3};
	    int n = arr.length;
	    
	    int target = 3222;
	    
	    int low = 0;
	    int high = n-1;
	    boolean find = false;
	    
	    while(low<=high){
	        int mid = (low+high)/2;
	        
	        if(arr[mid] == target){
	            find = true;
	            System.out.println(find);
	            break;
	        }
	        else if(arr[low] == arr[mid] && arr[mid]== arr[high]){
	            low++;
	            high--;
	        }
	        else if(arr[low] <= arr[mid]){
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
	    System.out.println(find);
	    }
	}
}