public class SingleElementInArrayBetter
{
	public static void main(String[] args) {
	    int arr[] = {1,1,2,2,3,3,4,4,5,6,6};
	    int n = arr.length;
	    
	    for(int i=1 ; i<n-1 ; i++){
	        if(arr[i-1]!=arr[i] && arr[i]!=arr[i+1]){
	            System.out.println(arr[i]);
	            break;
	        }
	    }
	    
	}
}