import java.util.*;

public class MergeSortedArrayOptimizedLeetcode
{
	public static void main(String[] args) {
	    
	    int arr1[] = {1,0,0};
	    int arr2[] = {2,6};
	    
	    int n = arr2.length;
	    int m = arr1.length-n;
	    
	    int k = m+n-1;
	    
	    int i = m-1;
	    int j = n-1;
	    
	    while(i>=0 && j>=0){
	        if(arr1[i]>arr2[j]){
	            arr1[k--] = arr2[i--];
	        }
	        else{
	            arr1[k--] = arr2[j--];
	        }
	    }
	    
	    for(int num : arr1){
	        System.out.print(num + " ");
	    }
	}
}