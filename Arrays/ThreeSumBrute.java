import java.util.*;

public class ThreeSumBrute {
	public static void main(String[] args) {
	    int arr[] = {-1,0,1,2,-1,-4};
	    int n = arr.length;
	    Set<List<Integer>> set = new HashSet<>();
	    
	    Arrays.sort(arr);
	    for(int i=0;i<n;i++){
	        for(int j=i+1 ; j<n ; j++){
	            for(int k=j+1 ; k<n ; k++){
	                if(arr[i]+arr[j]+arr[k] == 0){
	                    List<Integer> triplet = Arrays.asList(arr[i],arr[j],arr[k]);
	                    set.add(triplet);
	                }
	            }
	        }
	    }
	    
	    System.out.println(set);
	}
}