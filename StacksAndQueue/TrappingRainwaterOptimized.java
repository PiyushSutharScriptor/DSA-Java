public class TrappingRainwaterOptimized
{
	public static void main(String[] args) {
	    int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
	    int n = arr.length;
	    
	    int count=0;
	    
	    int lmax=0, rmax=0;
	    
	    int l=0;
	    int r=n-1;
	    
	    while(l<r){
	        if(arr[l]<=arr[r]){
	            if(lmax>arr[l]){
	                count+=lmax-arr[l];
	            }
	            else lmax = arr[l];
	            l++;
	        }
	        else{
	            if(rmax>arr[r]){
	                count+=rmax-arr[r];
	            }
	            else rmax = arr[r];
	            r--;
	        }
	    }
	    
	    System.out.println(count);
	}
}