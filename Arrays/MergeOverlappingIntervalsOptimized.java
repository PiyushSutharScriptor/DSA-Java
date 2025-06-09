import java.util.*;

public class MergeOverlappingIntervalsOptimized
{
	public static void main(String[] args) {
	    
	    int arr[][] = {{1,3},{2,4},{3,5},{6,7}};
	    int n = arr.length;
	    
	    Arrays.sort(arr , (a,b)-> Integer.compare(a[0],b[0]));
	    
	    List<int[]> merged = new ArrayList<>();
	    
	    for(int[] ar : arr){
	        if(merged.isEmpty() || merged.get(merged.size()-1)[1] < ar[0] ){
	            merged.add(ar);
	        }
	        else{
	            merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1] , ar[1]);
	        }
	    }
	    
	    for(int[] ar : merged){
	        System.out.println(Arrays.toString(ar));
	    }
	}
}