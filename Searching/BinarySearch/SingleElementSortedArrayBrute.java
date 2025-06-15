public class SingleElementSortedArrayBrute
{
	public static void main(String[] args) {
	    int arr[] = {1,1,2,2,3,3,4,4,5,6,6};
	    int n = arr.length;
	    
	    for(int i=0 ; i<n ; i++){
	        int count = 0;
	        for(int j=0 ; j<n ; j++){
	            if(arr[i]==arr[j]){
	                count++;
	            }
	        }
	        if(count==1){
	            System.out.println("The element is : " + arr[i]);
	            break;
	        }
	    }
	    
	}
}