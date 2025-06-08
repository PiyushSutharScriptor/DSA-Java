import java.util.*;

public class FourSumBetter {
	public static void main(String[] args) {
	    int arr[] = {1,0,-1,0,-2,2};
	    int n = arr.length;
	    int t = 0;
	    
	    Set<List<Integer>> list = new HashSet<>();
	    
	    Arrays.sort(arr);
	    
	    for(int i=0 ; i<n ; i++){
	        for(int j = i+1 ; j<n ; j++){
	            
	            Set<Integer> lset = new HashSet<>();
	            
	            for(int k = j+1 ; k<n ; k++){
	                
	                int forth = t - (arr[i]+arr[j]+arr[k]);
	                
	                if(lset.contains(forth)){
	                    List<Integer> li = Arrays.asList(arr[i],arr[j],arr[k],forth);
	                    Collections.sort(li);
	                    list.add(li);
	                }
	                else{
	                   lset.add(arr[k]);
	                }
	            }
	        }
	    }
	    
	    System.out.println(list);
	  
	}
}