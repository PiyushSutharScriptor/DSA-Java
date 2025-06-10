import java.util.*;

public class MergeSortedArrayBruteArrayList
{
	public static void main(String[] args) {
	    
	    int arr1[] = {1,3,5,7};
	    int arr2[] = {0,2,6,8,9};
	    
	    int m = arr1.length;
	    int n = arr2.length;
	    ArrayList <Integer> list = new ArrayList<>();
	     
	    int a = 0;
	    int b = 0;
	    
	    while(a<m && b<n){
	        if(arr1[a]<arr2[b]){
	            list.add(arr1[a]);
	            a++;
	        }
	        else{
	            list.add(arr2[b]);
	            b++;
	        }
	    }
	    
	    while(a<m){
	        list.add(arr1[a]);
	        a++;
	    }
	    
	    while(b<n){
	        list.add(arr2[b]);
	        b++;
	    }
	    
	    System.out.println(list);
	    
	    for(int i=0 ; i<m ; i++){
	        arr1[i] = list.get(i);
	    }
	    
	    for(int i=0 ; i<m ; i++){
	        System.out.print(arr1[i] + " ");
	    }
	    
	    
	    for(int i=0 ; i<n ; i++){
	        arr2[i] = list.get(i+m);
	    }
	    
	    System.out.println();
	    
	    for(int i=0 ; i<n ; i++){
	        System.out.print(arr2[i] + " ");
	    }
	}
}