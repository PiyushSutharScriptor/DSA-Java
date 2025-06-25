public class SearchIn2DMatrixBSearchOptimized
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
	        {3,4,7,9},
	        {12,13,16,18},
	        {20,21,23,29}
	    };
	    
	    int target = 4;

	    int m = arr.length;
	    int n = arr[0].length;
        
        System.out.println(searchTarget(arr,target,m,n));	    
	    
	}
}