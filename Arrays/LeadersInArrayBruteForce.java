import java.util.*;

public class LeadersInArrayBruteForce
{
	    
	public static void main(String[] args) {
	    int arr[] = {10,22,12,3,0,6};
	    int n = arr.length;
	    ArrayList <Integer> map = new ArrayList<>();
	    
	    for(int i=0 ; i<n ; i++){
	        boolean value = false;
	        for(int j=i+1 ; j<n ; j++){
	            if(arr[i]>arr[j]){
	                value = true;
	            }
	            else{
	                value = false;
	                break;
	            }
	        }
	        
	        if(value){
	            map.add(arr[i]);
	        }
	    }
	    
	    map.add(arr[n-1]);
	    
	    System.out.println(map);
	    
	}
}