import java.util.*;

public class MergeSortedArrayBruteWithNewArray
{
	public static void main(String[] args) {
	    
	    int arr1[] = {1,3,5,7};
	    int arr2[] = {0,2,6,8,9};
	    
	    int m = arr1.length;
	    int n = arr2.length;
	    
	    int list[] = new int[m+n];
	    
	    int a = 0;
	    int b = 0;
	    int idx = 0;
	    
	    while(a<m && b<n){
	        if(arr1[a]<arr2[b]){
	            list[idx] = arr1[a];
	            a++;
	            idx++;
	        }
	        else{
	            list[idx] = arr2[b];
	            b++;
	            idx++;
	        }
	    }
	    
	    //add remaining elements : 
	    while(a<m){
	        list[idx] = arr1[a];
	        a++;
	        idx++;
	    }
	    
	    while(b<n){
	        list[idx] = arr2[b];
	        b++;
	        idx++;
	    }
	    
	    
	    //printing the new array : 
	    for(int i=0 ; i<m+n ; i++){
	        System.out.print(list[i] + " ");
	    }
	    
	    System.out.println();
        
        //printing the arr1
	    for(int i=0 ; i<m ; i++){
	        arr1[i] = list[i];
	    }
	    for(int i=0 ; i<m ; i++){
	        System.out.print(arr1[i] + " ");
	    }
	    
	    System.out.println();
	    
        //printing the arr1
	    for(int i=0 ; i<n ; i++){
	        arr2[i] = list[i+m];
	    } 
	    for(int i=0 ; i<n ; i++){
	        System.out.print(arr2[i] + " ");
	    }
	}
}