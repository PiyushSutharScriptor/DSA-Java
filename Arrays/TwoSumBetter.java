import java.util.*;
public class TwoSumBetter {
    public static void main(String[] args){
        
	   int arr[] = {1,2,3,4,5};
	   int n = arr.length;  
	   int k = 5;
	   
	   HashMap <Integer , Integer> map = new HashMap<>();
	   
	   for(int i=0 ; i<n ; i++){
	       if(map.containsKey(k-arr[i])){
	           System.out.println("Yes");
	           System.out.println(i + "," + map.get(k-arr[i]));
	           break;
	       }
	       else{
	           map.put(arr[i] , i);
	       }
	   }
	   
	   
	}
} 