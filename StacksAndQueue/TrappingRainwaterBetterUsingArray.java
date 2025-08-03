
public class TrappingRainwaterBetterUsingArray
{
	public static void main(String[] args) {
	    int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
	    int n = arr.length;
	    
	    int count=0;
	    
	    int[] prefix = new int[n];
	    
	    prefix[0] = arr[0];
	    for(int i=1 ; i<n ; i++){
	        prefix[i]= Math.max(prefix[i-1],arr[i]);
	    }
	    
	    int[] suffix = new int[n];
	    
	    suffix[n-1] = arr[n-1];
	    for(int i=n-2 ; i>=0 ; i--){
	        suffix[i] = Math.max(suffix[i+1],arr[i]);
	    }
	    
	    for(int i=0 ; i<n ; i++){
            int lmax = prefix[i];
            int rmax = suffix[i];
            
            if(lmax>arr[i] && rmax>arr[i]){
                int sub = Math.min(lmax,rmax);
                count+=sub-arr[i];
            }
	    }
       
	    
	    System.out.println(count);
	}
}