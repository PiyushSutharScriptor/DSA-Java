import java.util.*;
public class TwoSumUsingTwoPointer {
    public static void main(String[] args){
        
	   int arr[] = {1,2,3,4,5};
	   int n = arr.length;  
	   int k = 8;
	   
	   int start = 0;
	   int end = n-1;
	   
	   while (start < end){
	       
	       int sum = arr[start] + arr[end];
	       
	       if(sum==k){
	           System.out.println(start + " , " + end);
	           break;
	       }
	       else if(sum>k){
	         end--;  
	       } 
	       else{   
	        start++;
	       }
	   }
	   
	}
} 