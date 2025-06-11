import java.util.*;

public class MissingAndRepeatNumberMoreBetter
{
	public static void main(String[] args) {
	    
	    int arr[] = {4,3,6,2,1,1};
	    
	    int n = arr.length;
	    int repeat = -1;
	    int missing = -1;
	    
	    
	    for(int i=1 ; i<=n ; i++){
	        int count = 0;
	                        
	        for(int j=0 ; j<n ; j++){
	            if(arr[j]==i){
	                count++;
	            }
	            
	        }
	        
			//main logic
	       if(count==0) missing = i;
	       if(count>1) repeat = i;
	       
	       if(repeat!=-1 && missing!=-1){
	           break;
	       }
	    }
	    
	    System.out.println("Missing Number : " + missing);
	    System.out.println("Repeating Number : " + repeat);
	    
	}
}