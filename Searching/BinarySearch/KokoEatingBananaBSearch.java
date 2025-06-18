
public class KokoEatingBananaBSearch
{
	public static void main(String[] args) {
		int arr[] = {3,6,7,11};
		int n = arr.length;
		 
		int banana = 1;
		int maxtime = 8;
		
		int low = 1;
		int high = 11;
		
		int ans = 1;
		
		while(low<=high){
		    int mid = (low+high)/2;
		    long time = 0;
    		for(int j=0 ; j<n ; j++){
    		    time += (arr[j] + mid - 1L) / mid;
    		}
    		if(time <= maxtime){
    		    high = mid-1;
    		}	
    		else{
    		    low = mid+1;
    		}
		}
		
		System.out.println(low);
	}
}