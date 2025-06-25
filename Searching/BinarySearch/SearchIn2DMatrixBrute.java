public class SearchIn2DMatrixBrute
{
    public static boolean searchTarget(int arr[][] , int target, int m, int n){
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                if(arr[i][j]==target){
                    return true;
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
	    
	    int target = 23;

	    int m = arr.length;
	    int n = arr[0].length;
        
        System.out.println(searchTarget(arr,target,m,n));	    
	    
	}
}