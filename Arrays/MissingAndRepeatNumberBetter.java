import java.util.*;

public class MissingAndRepeatNumberBetter
{
	public static void main(String[] args) {
	    
	    int arr[] = {4,3,6,2,1,1};
	    
	    int n = arr.length;
	    
	    
	    
	   // for(int i=1 ; i<n ; i++){
	        
	   // }
	    
	    for(int i=1 ; i<=n ; i++){
	        
	        //repeating number logic
	        if(arr[i]==arr[i-1]){
	            System.out.println("The repeating number is : " + arr[i]);
	        }
	        
	        //missing number logic
	        int count = 0;
	        for(int j=0 ; j<n ; j++){
	            if(arr[j]==i){
	                count++;
	            }
	        }
	        
	        if(count==0){
	           System.out.println("The missing number : " + i);
	           break;
	        }
	    }
	    
	}
}