public class SearchElementFlatArrayOptimized
{
    public static boolean searchEl(int arr[][] , int m , int n , int target){
        int low = 0;
		int high = m*n-1;
		
		while(low<=high){
		    int mid = (low+high)/2;
		    
		    int row = mid/n;
		    int col = mid%n;
		    
		    if(arr[row][col]==target){
		        return true;
		    }
		    
		    if(arr[row][col] < target){
		        low = mid+1;
		    }
		    else{
		        high = mid-1;
		    }
		}
		
		return false;
    }
    
	public static void main(String[] args) {
		int arr[][] = {
		  {1,3,5,7},
		  {10,11,16,20},
		  {23,30,34,60},
		};
		
		int target = 3;
		
		int m = arr.length;
		int n = arr[0].length;
		
		System.out.println(searchEl(arr,m,n,target));
		
	}
}