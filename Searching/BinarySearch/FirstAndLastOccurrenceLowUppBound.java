public class FirstAndLastOccurrenceBinarySearch
{
    
    public static int lowerBound(int arr[] , int low, int high, int target, int n){
		int min = n;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                min = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return min;
    }
    
    public static int upperBound(int arr[] , int low, int high, int target, int n){
		int min = n;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                min = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return min;
    }
    
	public static void main(String[] args) {
		int arr[] = {1,2,3,3,7,8,9,9,9,11};
		
		int n = arr.length;
		int target = 9;
		
		
		int low = 0;
		int high = n-1;
		
		int first = lowerBound(arr,low,high,target,n);
		int last = upperBound(arr,low,high,target,n)-1;
	
	    if(first==n|| arr[first] != target){
	        first = -1;
	        last = -1;
	    }
	    else if(arr[last] != target){
	        last = -1;
	    }
		
		System.out.println("first occurrence : " + first);
		System.out.println("last occurrence : " + last);

	}
}