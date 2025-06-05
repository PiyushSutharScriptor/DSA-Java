import java.util.*;

public class MajorityElementNBy3Brute
{
	public static void main(String[] args) {
	    int arr[] = {1,1,1,3,3,2,2,2};
	    int n = arr.length;
	    int k = n/3;
	    int length = 0;
	    ArrayList <Integer> list = new ArrayList<>();
	    
	    for(int i=0 ; i<n ; i++){
	        int count = 0;
	        for(int j=i ; j<n ; j++){
	            if(arr[i]==arr[j]){
	                count++;
	            }
	            
	           
	        }
	        if(count>k){
	                list.add(arr[i]);
	            }
	    }
	    
	    System.out.println(list);
	}
}