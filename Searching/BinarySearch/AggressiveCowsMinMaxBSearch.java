import java.util.*;
public class AggressiveCowsMinMaxBSearch
{
    public static int aggressCows(int arr[] , int k , int n){
        int low = 1;
        int high = arr[n-1]-arr[0];

        while(low<=high){
            int mid = (low+high)/2;
            int lastCow = arr[0];
            int cows = 1;
            
            for(int j=1 ; j<n ; j++){
                if(arr[j]-lastCow>= mid){
                    cows++;
                    lastCow = arr[j];
                }                
            }       
            
            if(cows < k){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return high; //this is the max distance
                     // we can also take the max variable and keeps on updating (max = mid; >>> return max;)
        
    }
    
	public static void main(String[] args) {
        int arr[] = {1, 2, 8, 4, 9};
        Arrays.sort(arr);
        int n = arr.length;
        
        int k = 3;
        
        int res = aggressCows(arr,k,n);
        
        System.out.println(res);
	}
}