public class FloorAndCeil
{
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		int n = arr.length;
		int target = 30;
		
		
		int low = 0;
		int high = n-1;
		
		Integer ceil = null;
		Integer floor = null;
		
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
            else if(arr[mid]>=target){
                ceil = arr[mid];
                high = mid-1;
            }
            else{
                floor = arr[mid];
                low = mid+1;
            }
        }
        
        System.out.println("Ceil is : " + (ceil!=null ? ceil : "None"));
        System.out.println("Floor is : " + (floor!=null ? floor : "None"));
        
		
	}
}