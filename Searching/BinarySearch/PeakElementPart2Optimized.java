import java.util.*;
public class PeakElementPart2Optimized
{
    public static int[] searchPeak(int arr[][] , int m , int n){
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            int max = 0;
            for(int i=0 ; i<m ; i++){
                if(arr[i][mid]>arr[max][mid]){
                    max = i;
                }
            }
            
            int left = (mid-1>=0) ? arr[max][mid-1] : -1;
            int right = (mid+1<n) ? arr[max][mid+1] : -1;
            
            if(arr[max][mid]>left && arr[max][mid]>right){
                return new int[] {max,mid};
            }
            else if(arr[max][mid]<left){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        
        return new int[]{-1,-1};
    }
    
	public static void main(String[] args) {
	    int arr[][] = {
	      {4,2,5,1,4,5},  
	      {2,9,3,2,3,2},  
	      {1,7,6,0,1,3},  
	      {3,6,2,3,7,2}  
	    };
	    
	    int m = arr.length;
	    int n = arr[0].length;
	    
	    int[] ans = searchPeak(arr, m , n);
	    
	    System.out.println(Arrays.toString(ans));
	    
	}
}