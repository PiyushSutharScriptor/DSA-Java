import java.util.*;

public class LeadersInArrayOptimized
{
	    
	public static void main(String[] args) {
	    int arr[] = {10,22,12,3,0,6};
	    int n = arr.length;
	    ArrayList <Integer> map = new ArrayList<>();
	    
	    int max = Integer.MIN_VALUE;
	    
	    for(int i=n-1 ; i>=0 ; i--){
	        if(arr[i]>max){
	            max = arr[i];
	            map.add(arr[i]);
	        }
	    }
	    
	    System.out.println(map);
	    
	}
}