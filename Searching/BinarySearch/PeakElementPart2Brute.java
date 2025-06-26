
public class PeakElementPart2Brute
{
	public static void main(String[] args) {
	    int arr[][] = {
	      {4,2,5,1,4,5},  
	      {2,9,3,2,3,2},  
	      {1,7,6,0,1,3},  
	      {3,6,2,3,7,2}  
	    };
	    
	    int m = arr.length;
	    int n = arr[0].length;
	    
	    int max = -1;
	    for(int i=0 ; i<m ; i++){
	        int count = 0;
	        for(int j=0 ; j<n ; j++){
	            if(arr[i][j]>=count){
	                count = arr[i][j];
	            }
	        }
	        if(count>max){
	            max = count;
	        }
	    }
	    
	    System.out.println(max);
	}
}