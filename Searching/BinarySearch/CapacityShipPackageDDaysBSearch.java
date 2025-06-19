
public class CapacityShipPackageDDaysBSearch
{
    public static int leastCapacity(int arr[] , int n, int maxDays){
        int high = 0;
        int low = Integer.MIN_VALUE;
        for(int num : arr){
            high += num;
            low = Math.max(low,num);
        }
        int ans = 0;
        
        while(low <= high){
            int load = 0;
            int days = 1;
            boolean valid = true;
            
            int mid = (low+high)/2;
            
            for(int j=0 ; j<n ; j++){
                if(arr[j]>mid){
                    valid = false;
                    break;
                }
                if(arr[j]+load > mid){
                    days++;
                    load = 0;
                }
                load+=arr[j];
            }
            
            if(valid && days<=maxDays){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return ans;
        
        
    }
	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5,6,7,8,9,10};
	    int n = arr.length;
	    
	    int maxDays = 5;
	    
	    int res = leastCapacity(arr,n,maxDays);
	    System.out.println(res);

	}
}