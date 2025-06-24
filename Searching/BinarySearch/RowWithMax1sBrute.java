public class RowWithMax1sBrute
{
	public static void main(String[] args) {
	    int arr[][] = {{0,0,1,1,1},{1,1,1,1,1},{0,1,0,0,1},{1,0,0,0,1}};
	    int m = arr.length;
	    int n = arr[0].length;
	    
	    int ans = 0;
	    int max = 0;
	    
	    for (int i=0 ; i<m ; i++) {
	        int count = 0;
	        for(int j=0 ; j<n ; j++){
	            if(arr[i][j] == 1){
	                count++;
	            }
	        }
	        
	        if(max<count){
	            max = count;
	            ans = i;
	        }
	        
	    }
	    
	    System.out.println(max);
	}
}