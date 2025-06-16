
public class FindPeakElementBrute
{
	public static void main(String[] args) {
	    int arr[] = {2,5};
	    
	    int n = arr.length;
	    
        //logic

        //for peak on first element
	    if(n==1 || arr[0]>arr[1]) System.out.println(arr[0]);
	    for(int i=1 ; i<n-1 ; i++){
	        if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
	            System.out.println(arr[i]);
	        }
	    }
        //for peak on last element
	    if(arr[n-1]>arr[n-2]) System.out.println(arr[n-1]);

	}
}