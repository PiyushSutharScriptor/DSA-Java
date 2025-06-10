import java.util.*;

public class MergeSortedArrayBetter
{
	public static void main(String[] args) {
	    
	    int arr1[] = {1,3,5,7};
	    int arr2[] = {0,2,6,8,9};
	    
	    int m = arr1.length;
	    int n = arr2.length;
	    
	    int first = m-1;
	    int second = 0;
	    
	    while(first>0 && second<n){
	        if(arr1[first]>arr2[second]){
	            int temp = arr1[first];
	            arr1[first] = arr2[second];
	            arr2[second] = temp;
	            first--;
	            second++;
	        }
	        else{
	            break;
	        }
	    }
	    
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    
	    for(int num : arr1){
	        System.out.print(num + " ");
	    }
	    
	    System.out.println();
	    
	    for(int num : arr2){
	        System.out.print(num + " ");
	    }
	}
}