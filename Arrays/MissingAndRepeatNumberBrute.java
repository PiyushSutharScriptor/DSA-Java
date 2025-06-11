import java.util.*;

public class MissingAndRepeatNumberBrute
{
	public static void main(String[] args) {
	    
	    int arr[] = {4,3,6,2,1,1};
	    
	    int n = arr.length;
	    
	    
	    //repeating number
	    for(int i=1 ; i<n ; i++){
	        if(arr[i]==arr[i-1]){
	            System.out.println("The repeating number is : " + arr[i]);
	            break;
	        }
	    }
	    
	    for(int i=1 ; i<=n ; i++){
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