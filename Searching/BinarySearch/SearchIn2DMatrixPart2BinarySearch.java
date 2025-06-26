public class SearchIn2DMatrixPart2BinarySearch
{
    public static boolean searchTarget(int arr[][] , int target, int m, int n){
        
        for(int i=0 ; i<m ;i++){
            
            if(arr[i][0]<=target && arr[i][n-1]>=target){
                int low = 0;
                int high = n-1;
                while(low<=high){
                    int mid = (low+high)/2;
                    if(arr[i][mid]==target){
                        return true;
                    }
                    
                    if(arr[i][mid]<target){
                        low = mid+1;
                    }
                    else{
                        high = mid-1;
                    }
                }
            }
            
        }
        
        return false;
    }
    
	public static void main(String[] args) {
	    int arr[][] = {
	        {1,4,7,11,15},
	        {2,5,8,12,19},
	        {3,6,9,16,22},
	        {10,13,14,17,24},
	        {18,21,23,26,30}
	    };
	    
	    int target = 20;

	    int m = arr.length;
	    int n = arr[0].length;
        
        System.out.println(searchTarget(arr,target,m,n));	    
	    
	}
}