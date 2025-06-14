public class BinarySearchOptimized
{
	public static void main(String[] args) {
		int arr[] = {3,4,6,7,9,12,16,17};
		int target = 17;
		
		int n = arr.length;
		
		int low = 0;
		int high = n-1;
		boolean find = false;
		
		while(low <= high){
		    
		    int mid = (low+high)/2;
		    if(arr[mid]==target){
		        System.out.println(mid);
		        find = true;
		        break;
		    }
		    else if(arr[mid]<target){
		        low = mid+1;
		    }
		    else if(arr[mid]>target){
		        high = mid-1;
		    }
		    
		}
		if(!find){
		    System.out.println("Element not found");
		}
	}
}