public class FirstAndLastOccurBinarySearch
{

	public static void main(String[] args) {
		int arr[] = {1,2,3,3,7,8,9,9,9,11};
		
		int n = arr.length;
		int target = 13;
		
		int low = 0;
		int high = n-1;
		
		int first = -1;
		
		while(low <= high){
		    int mid = (low+high)/2;
		    if(arr[mid] == target){
		        first = mid;
		        high = mid-1;
		    }
		    else if(arr[mid]<target){
		        low = mid+1;
		    }
		    else{
		        high = mid-1;
		    }
		}
		
// 		System.out.println(first);
		
		int slow = 0;
		int shigh = n-1;
		
		int last = -1;
		
		while(slow <= shigh){
		    int mid = (slow+shigh)/2;
		    if(arr[mid] == target){
		        last = mid;
		        slow = mid+1;
		    }
		    else if(arr[mid]>target){
		        shigh = mid-1;
		    }
		    else{
		        slow = mid+1;
		    }
		}
		
		System.out.println("first occurrence : " + first);
		System.out.println("last occurrence : " + last);
	}
}