public class TrappingRainwaterBruteUsingArray
{
	public static void main(String[] args) {
	    int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
	    int n = arr.length;
	    
	    int count=0;
	    
	    for(int i=1 ; i<n ; i++){
	        
	        int lmax = Integer.MIN_VALUE;
	        int rmax = Integer.MIN_VALUE;
	       //finding left max
	       for(int j=0 ; j<i ; j++){
	           lmax = Math.max(arr[j],lmax);
	       }
	       
	       //finding right max
	       for(int k=i+1 ; k<n ; k++){
	           rmax = Math.max(arr[k],rmax);
	       }
	       
	       if(lmax>arr[i] && rmax>arr[i]){
	           int sub = Math.min(lmax,rmax);
	           count+=sub-arr[i]; //subtracting by min of lmax and rmax
	       }
	    }
	    
	    System.out.println(count);
	}
}