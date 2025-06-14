public class SearchInsertPosition
{
    public static int insertPosition(int arr[] , int low, int high, int target, int n){
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return low;
    }
    
	public static void main(String[] args) {
		int arr[] = {1,3,5,6};
		
		int n = arr.length;
		int target = 2;
		
		
		int low = 0;
		int high = n-1;
		
		int res = insertPosition(arr,low,high,target,n);
		
		System.out.println(res);
	}
}