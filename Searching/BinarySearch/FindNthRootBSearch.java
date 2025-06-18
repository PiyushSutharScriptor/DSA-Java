public class FindNthRootBSearch
{
    public static int nthNumber(int mid, int n){
        int num = 1;
        for(int i=0 ; i<n ; i++){
            num = num*mid;
        }
        return num;
    }
    
	public static void main(String[] args) {
	    int n = 4;
	    int ans = 1;
	    int num = 64;
	    
	    int low = 1;
	    int high = num;
	    
	    
	    while(low<=high){
	        int mid = (low+high)/2;
	        if(nthNumber(mid,n) == num){
	            ans = mid;
	            break;
	        }
	        else if(nthNumber(mid,n)>num){
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