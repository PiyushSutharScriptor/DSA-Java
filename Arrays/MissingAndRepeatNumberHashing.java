import java.util.*;

public class MissingAndRepeatNumberOptimized
{
	public static void main(String[] args) {
	    
	    int arr[] = {4,3,6,2,1,1};
	    int n = arr.length;
	    
	    int hash[] = new int[n+1];
	    
	    for(int i=0 ; i<n ; i++){
	        hash[arr[i]]++;
	    }
	    
	    for(int i=1 ; i<n+1 ; i++){
	        if(hash[i]==2){
	            System.out.println("The repeat number : " + i);
	        }
	        if(hash[i]==0){
	            System.out.println("The missing number : " + i);
	        }
	    }
	    
	    for(int num : hash){
	        System.out.print(num + " ");
	    }
	    
	}
}