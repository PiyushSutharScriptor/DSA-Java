import java.util.*;

public class SumOfSubarraysMinimumsBrute
{
    public static int findMin(List<Integer> list){
        int min = Integer.MAX_VALUE;
        
        for(int e : list){
            min = Math.min(e,min);
        }
        
        return min;
    }
    
	public static void main(String[] args) {
	    int arr[] = {3,1,2,4};
	    int n = arr.length;
	    int count=0;
	    
	    List<Integer> list = new ArrayList<>();
	    
	    for(int i=0;i<n;i++){
	        for(int j=i;j<n;j++){
	            for(int k=i ; k<=j ; k++){
	                list.add(arr[k]);
	            }
	        count+=findMin(list);
	        list.clear();
	        }
	    }
	    
	    System.out.println(count);
	}
}