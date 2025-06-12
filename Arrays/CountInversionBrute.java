import java.util.*;

public class CountInversionBrute
{
	public static void main(String[] args) {
	    
	    int arr[] = {5,3,2,4,1};
	    int n = arr.length;
	    
	    int count = 0;
	    for(int i=0 ; i<n ; i++){
	        for(int j=i ; j<n;j++){
	            if(arr[i]>arr[j]){
	                count++;
	            }
	        }
	    }
	    
	    System.out.println("The number of pairs : " + count);
	    
	}
}