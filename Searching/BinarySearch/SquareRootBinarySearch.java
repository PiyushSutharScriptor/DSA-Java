
public class SquareRootBinarySearch
{
	public static void main(String[] args) {
	    int n = 101;
	    int low = 1;
	    int high = n;
	    int ans = 1;
	    
	    while(low<=high){
	        int mid = (low+high)/2;
	        if(mid*mid == n){
	            ans = mid;
	            break;
	        }
	        else if(mid*mid>n){
	            high = mid-1;
	        }
	        else{
	            low = mid+1;
	            ans = mid;
	        }
	    }
	    System.out.println(ans);
	}
}   