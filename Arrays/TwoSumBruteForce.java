import java.util.*;
public class TwoSumBruteForce {
    public static void main(String[] args){
        
	   int arr[] = {1,1};
	   int n = arr.length;
	   
	   int k = 7;
	   
	   for(int i=0 ; i<n ; i++){
	       for(int j=i ; j<n ; j++){
	           if(arr[i]+arr[j]==k){
	               System.out.println("Yes");
	               break;
	           }
	           else{
	               System.out.println("No");
	           }
	       }
	   }
	    
	}
} 