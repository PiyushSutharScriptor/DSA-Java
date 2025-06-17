
public class PeakElementBSearch
{
	public static void main(String[] args) {
	    int arr[] = {2,5};
	    
	    int n = arr.length;
	    
	    int low = 1;
	    int high = n-2;
	    
	    if(n==1){
	        System.out.println(arr[0]); 
	        return;
	    } 
        if(arr[0]>arr[1]){
            System.out.println(arr[1]);
            return;
        } ;
        if(arr[n-1]>arr[n-2]){
            System.out.println(arr[n-1]);
            return;
        }
            
	    while(low <= high){
	        int mid = (low+high)/2;
	       
	        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
	            System.out.println(mid);
	        }
	        else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
				high = mid-1;
	        }
	        else{
	            low = mid+1;
	        }
	    }
	}
}