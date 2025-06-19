
public class SmallestDivisorGivenThresholdBSearch
{
    public static int smallDiv(int arr[] , int thres , int n){
        
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int ans = 1;
        
        for(int num : arr){
            low = Math.min(low,num);
            high = Math.max(high,num);
        }
        
        while(low<=high){
            int sum = 0;
            int mid = (low+high)/2;
            for(int j=0 ; j<n ; j++){
	            sum += (arr[j] + mid-1)/mid;
	        }
	        if(sum<=thres){
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
	    int arr[] = {7,10,5,9};
	    int n = arr.length;
	    int thres = 6;
	   
        int res = smallDiv(arr,thres,n);
        System.out.println(res);
	}
}