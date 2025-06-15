
public class SearchInRotatedArrayBrute
{
	public static void main(String[] args) {
	    int arr[] = {7,8,9,1,2,3,4,5,6};
	    int n = arr.length;
	    
	    int target = 1;
	    for(int i=0 ; i<n ; i++){
	        if(arr[i] == target){
	            System.out.println("index : " + i);
	            break;
	        }
	    }
	}
}