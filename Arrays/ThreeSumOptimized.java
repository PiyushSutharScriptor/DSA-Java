import java.util.*;

public class ThreeSumOptimized {
	public static void main(String[] args) {
	    int arr[] = {0,0,0,2,2,2,2,-2,-2,-2,-1,-1,-1};
	    
	    Arrays.sort(arr);
	    
	    int n = arr.length;
	    
	    for(int i=0 ; i<n ; i++){
	        if(i>0 && arr[i] == arr[i-1]) continue;
	        
	        int j=i+1;
	        int k = n-1;
	        
	        while (j<k){
	            int sum = arr[i] + arr[j]+ arr[k];
	            
	            
	            if(sum<0){
	                j++;
	            }
	            else if(sum>0){
	                k--;
	            }
	            else{
	                System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
	                j++;
	                k--;
	                while(j<k && arr[j] == arr[j-1]) j++;
	                while(j<k && arr[k] == arr[k+1]) k--;
	            }
	            
	        }
	        
	        
	    }
	}
}