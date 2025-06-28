import java.util.*;

public class ReversedStringUsingArray
{
	public static void main(String[] args) {
	    String str = "abcd";
	    char arr[] = str.toCharArray();
	    
	    int low = 0;
	    int high = arr.length-1;
	    
	    while(low<high){
	        char temp = arr[low];
	        arr[low] = arr[high];
	        arr[high] = temp;
	        low++;
	        high--;
	    }
	    
	    String st = new String(arr);
	    System.out.println(st);
	    
	}
} 