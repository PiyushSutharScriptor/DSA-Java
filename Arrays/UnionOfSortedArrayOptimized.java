import java.util.ArrayList;
public class UnionOfSortedArrayOptimized {
    public static void main(String[] args){
        
        //sorted arrays
	   int arr[] = {1,2,3,4,5,6};
	   int arr2[] = {5,6,7,8,9,96,117};
	   
	   //size of arrays
	   int m = arr.length;
	   int n = arr2.length;
	   
	   ArrayList <Integer> list = new ArrayList<>();
	   
	   int i=0;
	   int j=0;
	   int prev = Integer.MIN_VALUE;
	   
	   while (i<m && j<n){
	       int a = arr[i];
	       int b = arr2[j];
	       
	       if(a==b){
	           if(a!=prev){
	               list.add(a);
	               prev = a;
	           }
	           i++;
	           j++;
	       }
	       
	       else if(a<b){
	           if(a!=prev){
	               list.add(a);
	               prev = a;
	           }
	           i++;
	       }
	       else{
	           if(b!=prev){
	               list.add(b);
	               j++;
	           }
	       }
	   }
	   
	   //remaining elements from arr[] :
	   while (i<m){
	       if(arr[i]!=prev){
	           list.add(arr[i]);
	           prev = arr[i];
	       }
	       i++;
	   }
	   
	   //remaining elements from arr2[]
	   while(j<n){
	       if(arr2[j]!=prev){
	           list.add(arr2[j]);
	           prev = arr2[j];
	       }
	       j++;
	   }
	   
	   System.out.print(list);
	  
	}
}