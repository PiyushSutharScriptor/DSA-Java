import java.util.*;
public class KthMissingPosNumberOptimized
{
    public static int missingNum(int arr[] , int n, int k){
        for(int i=0 ;i<n ; i++){
            if(arr[i]<=k){
                k++;
            }
            else{
                return k;
            }
        }
        return k;
    }
    
	public static void main(String[] args) {
	    int arr[] = {2,3,4,7,11};
	    int n = arr.length;
	 
	    int k = 6;
	    
	    int res = missingNum(arr,n,k);
	    
	    System.out.println(res);

	}
}