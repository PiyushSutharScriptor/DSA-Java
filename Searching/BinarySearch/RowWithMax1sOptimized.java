public class RowWithMax1sOptimized
{
	public static void main(String[] args) {
	    int arr[][] = {{0,0,1,1,1},{1,1,1,1,1},{0,0,0,0,1},{0,0,0,1,1}};
	    int n = arr.length; //rows 
	    int j = arr[0].length -1; //columns
	    
	    int ans = -1;
	    
	    for(int i=0 ; i<n ; i++){
	        while(j>=0 && arr[i][j]==1){
	            ans = i;
	            j--;
	        }
	    }
	    
	    System.out.println(ans);

	}
}