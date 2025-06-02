import java.util.*;

public class NextPermutationOptimized
{
    
    public static void reverse(int arr[] , int start , int end){
	        while (start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
	}
	    
	public static void main(String[] args) {
	    int arr[] = {1,2,3};
	    int n = arr.length;
	    
	    int idx = -1;
	    
	    for(int i=n-2 ; i>=0 ; i--){
	        if(arr[i]<arr[i+1]){
	            idx = i;
	            break;
	        }
	    }
	    
	    if(idx!=-1){
	        for(int j=n-1; j>idx ; j--){
	            if(arr[j]>arr[idx]){
	                int temp = arr[j];
	                arr[j] = arr[idx];
	                arr[idx] = temp;
	                break;
	            }
	        }
	    }
	    
	    reverse(arr, idx+1,n-1);
	   
	    
	    for(int num : arr){
	        System.out.print(num + " ");
	    }
	    
	}
}