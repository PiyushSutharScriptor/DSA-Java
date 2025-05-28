import java.util.HashSet;
public class UnionOfUnsortedArrayBruteForce {
    public static void main(String[] args){
        
        //sorted arrays
	   int arr[] = {1,2,3,4,5,6};
	   int arr2[] = {5,6,7,8,9,96,117};
	   
	   //size of arrays
	   int m = arr.length;
	   int n = arr2.length;
	   
	   //HashSet to store the unique elements 
	   HashSet<Integer> set = new HashSet<>();
	   
	   for(int i=0 ; i<m ; i++){
	       set.add(arr[i]);
	   }
	   
	   for(int i=0 ; i<n ; i++){
	       set.add(arr2[i]);
	   }
	   
	   System.out.println("HashSet Array : ");
	   System.out.print(set);
	   System.out.println();
	   
	   //Array to store the elements of HashSet
	   int union[] = new int[set.size()];
	   
	   int index = 0;
	   for(int num : set){
	        union[index++] = num;    
	   }
	    
	   System.out.println("Union Array : ");
	   for(int i=0 ; i<set.size() ; i++){
	       System.out.print(union[i] + " ");
	   }
	   
	}
}