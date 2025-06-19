import java.util.*;
public class MinimumDaysForMBouquetBSearch
{
    public static int bouquetFun(int arr[] , int m, int k, int n){
        
        int low = 0;
        int answer = -1;
        int high = Arrays.stream(arr).max().getAsInt();
        
        while(low <= high){
            int mid = (low+high)/2;
            
            int count = 0;
		    int pair = 0;
		    
		    for(int j=0 ; j<n ; j++){
		        if(arr[j]<=mid){
		            count++;
		        }
		        else{
		            count = 0;    
		        }
		        
		        if(count==k){
		            pair++;
		            count = 0;
		        }
		    }
		    
		    if(pair>=m){
		        answer = mid;
		        high = mid-1;
		    }
		    else{
		        low = mid+1;
		    }
            
        }
        
        return answer;
       
    }
    
	public static void main(String[] args) {
		int arr[] = {1,1,3,1,20,10};
		int n = arr.length;
		
		int m = 4; //bouquets
		int k = 2; //flowers
		
		int res = bouquetFun(arr,m,k,n);
		System.out.println(res);
		
	}
}