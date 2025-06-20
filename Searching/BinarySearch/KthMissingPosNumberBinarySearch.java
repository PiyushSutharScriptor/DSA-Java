import java.util.*;
public class KthMissingPosNumberBinarySearch
{
    public static int missingNum(int arr[] , int n, int k){
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            
            int missing = arr[mid] - (mid+1);
            
            if(missing<k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        
        
        return k+low;
    }
    
	public static void main(String[] args) {
	    int arr[] = {2,3,4,7,11};
	    int n = arr.length;
	 
	    int k = 6;
	    
	    int res = missingNum(arr,n,k);
	    
	    System.out.println(res);

	}
}