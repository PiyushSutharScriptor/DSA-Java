import java.util.*;

public class FourSumBruteForce {
	public static void main(String[] args) {
	    int arr[] = {1,0,-1,0,-2,2};
	    int n = arr.length;
	    
	    List<List<Integer>> list = new ArrayList<>();
	    
	    Arrays.sort(arr);
	    
	    for(int i=0 ; i<n ; i++){
	        for(int j = i+1 ; j<n ; j++){
	            for(int k = j+1 ; k<n ; k++){
	                for(int l=k+1 ; l<n ; l++){
	                    if(arr[i]+arr[j]+arr[k]+arr[l]==0){
	                        List<Integer> li = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
	                        list.add(li);
	                        System.out.println(arr[i] + " " + arr[j] + " " +arr[k] + " " +arr[l]);
	                    }
	                }
	            }
	        }
	    }
	    
	    System.out.println(list);
	  
	}
}