import java.util.*;

public class ThreeSumBetter {
	public static void main(String[] args) {
	    int arr[] = {-1,0,1,2,-1,-4};
	    int n = arr.length;
	    Set<List<Integer>> set = new HashSet<>();
	    Arrays.sort(arr);
	    
	    for(int i=0;i<n;i++){
	        
	        if(i>0 && arr[i] == arr[i-1]) continue;
	        
	        Set <Integer> kset = new HashSet<>();
	        
	        for(int j=i+1 ; j<n ; j++){
	            
	            int third = -(arr[i]+arr[j]);
	            
	            if(kset.contains(third)){
    	            List<Integer> triplet = Arrays.asList(arr[i],arr[j],third);
    	            Collections.sort(triplet);
    	            set.add(triplet);
	            }
	            kset.add(arr[j]);
	        }
	    }
	    
	    System.out.println(set);
	}
}