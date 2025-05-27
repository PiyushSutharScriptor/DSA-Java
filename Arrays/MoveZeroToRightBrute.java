        import java.util.*;
import java.util.ArrayList;

public class MoveZeroToRightBrute {
    public static void main(String[] args){
	   int arr[] = {1,2,0,0,3,5,0,1,0,0,0,1,52};
	   int n = arr.length;
	   
       //moving directly using temp array :             
	   int temp[] = new int[n];
	   
	   int j=0;
	   for(int i=0 ; i<n ; i++){
	       if(arr[i]!=0){
	            temp[j] = arr[i];
	            j++;
	       }
	   }
	   
       System.out.println("Using temp array : ");
	   for(int i=0 ; i<n ; i++){
	       System.out.print(temp[i] + " ");
	   }
	   
       //moving using the ArrayList : 
	   ArrayList<Integer> list = new ArrayList<>();
	   
	   for(int i=0 ; i<n ; i++){
	       if(arr[i]!=0){
	           list.add(arr[i]);
	       }
	   }
	   
	   
	   System.out.println();
	   
       System.out.println("Using ArrayList array : ");

	   System.out.println(list);
	   
	   
	   for(int i=0 ; i<list.size() ; i++){
	       arr[i] = list.get(i);
	   }
	   
	   for(int i=list.size() ; i<n ; i++){
	       arr[i] = 0;
	   }
	   
       //final array : 
       System.out.println("Final array : ");

	   for(int i=0 ; i<n ; i++){
	       System.out.print(arr[i] + " ");
	   }

    }
}