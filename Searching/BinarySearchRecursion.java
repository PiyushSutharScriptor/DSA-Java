public class BinarySearchRecursion
{
    public static int binarySearch(int arr[] , int low, int high, int target){
        if(low>high){
            return -1;
        }
        
        int mid = (low+high)/2;
        
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            return binarySearch(arr,mid+1,high,target);
        }
        else{
            return binarySearch(arr,low,mid-1,target);
        }
    }
	public static void main(String[] args) {
		int arr[] = {3,4,6,7,9,12,16,17};
		int target = 17;
		
		int n = arr.length;
		
		int low = 0;
		int high = n-1;
	
	    int result = binarySearch(arr, low, high, target);
	    
	    System.out.println(result);
	}
}