import java.util.*;
public class KthMissingPosNumberBetter
{
	public static void main(String[] args) {
	    int arr[] = {2,3,4,7,11};
	    int n = arr.length;
	    
	    Set <Integer> set = new HashSet <>();
	    int high = arr[n-1];
	    int count = 0;
	    int k = 6;
	    int ans = -1;
	    
	    for(int num : arr){
	        set.add(num);
	    }
	    
	    for(int i=1 ; i<=high ; i++){
	        if(!set.contains(i)){
	            ans = i;
	            count++;
	        }
	        
	        if(count==k){
	            break;
	        }
	    }
	    
	    System.out.println(ans);

	}
}