
public class SumOfSubarraysMinimumsBetter
{
    
	public static void main(String[] args) {
	    int arr[] = {3,1,2,4,4,4,4,4,4,4,4,44,4,4,4,4,4444444,444444,44444};
	    int n = arr.length;
	    int sum=0;
	    int mod = (int)1e9+7;
	    
	    for(int i=0;i<n;i++){
	        int min = arr[i];
	        for(int j=i;j<n;j++){
	            min = Math.min(arr[j],min);
	           sum=(sum+min)%mod;
	        }
	    }
	    
	    System.out.println(sum);
	}
}