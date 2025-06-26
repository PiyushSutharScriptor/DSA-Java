public class SearchIn2DMatrixPart2Optimized
{
    public static boolean searchTarget(int arr[][] , int target, int m, int n){
        int row = 0;
        int col = n-1;
        while(row<m && col>=0){
            if(arr[row][col] == target){
                return true;
            }
            else if(arr[row][col] < target){
                row++;
            }
            else{
                col--;
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
	    
	    int target = 24;

	    int m = arr.length;
	    int n = arr[0].length;
        
        System.out.println(searchTarget(arr,target,m,n));	    
	    
	}
}