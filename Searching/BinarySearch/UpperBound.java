public class UpperBound
{
    public static int upperbound(int arr[] , int low, int high, int target, int n){
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
		int arr[] = {1,2,3,3,5,8,8,10,10,11};
		
		int n = arr.length;
		int target = 2;
		
		int low = 0;
		int high = n-1;
		
		int res = upperbound(arr,low,high,target,n);
		
		System.out.println(res);
	}
}