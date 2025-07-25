`import java.util.*;
public class PainterPartitionBSearch
{
    public static int painterAns(int arr[], int n, int k, int low, int high){
        
        while (low <= high){
            int mid = (low+high)/2;
            
            int sum = 0;
            int painter = 1;
            
            for(int j=0 ; j<n ; j++){
                if(sum+arr[j] <= mid){
                    sum += arr[j];
                }
                else{
                    painter++;
                    sum = arr[j];
                }
            }
            
            if(painter>k){
                low = mid+1;
            }    
            else{
                high = mid-1;
            }
        }
        
        return low;
    }
    
	public static void main(String[] args) {
	    int arr[] = {10,20,30,40};
	    int n = arr.length;
	    
	    int k = 2;
	    
	    int low = Integer.MIN_VALUE;
	    int high = 0;
	    for(int num : arr){
	        high += num;
	        low = Math.max(low,num);
	    }
	    
	    int res = painterAns(arr,n,k,low,high);
	    
	    System.out.println(res);
	}
}