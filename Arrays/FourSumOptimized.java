import java.util.*;

public class FourSumOptimized {
	public static void main(String[] args) {
	    int arr[] = {1, 0, -1, 0, -2, 2};
	    int n = arr.length;
	    int target = 0;
	    
	    Arrays.sort(arr);
	    Set<List<Integer>> set = new HashSet<>();
	    
	    for(int i=0 ; i<n ; i++){
	            if(i>0 && arr[i]==arr[i-1]) continue;
	        for(int j=i+1 ; j<n ; j++){
	            if(j>i+1 && arr[j]==arr[j-1]) continue;
	            
	            int k = j+1;
	            int l = n-1;
	            
	            while(k<l){
	                
	                int sum = arr[i]+arr[j]+arr[k]+arr[l];
	                if(sum>0){
	                    l--;
	                }
	                else if (sum<0){
	                    k++;
	                }
	                else{
	                    List<Integer> li = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
	                    set.add(li);
	                    
	                    k++;
	                    l--;
	                    
	                    while(k<l && arr[k] == arr[k-1]) k++;
	                    while(k<l && arr[l] == arr[l+1]) l--;
	                }
	            }
	        }
	    }
	    
	    System.out.println(set);
	}
}