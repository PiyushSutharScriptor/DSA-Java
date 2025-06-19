
public class SmallestDivisorGivenThresholdBrute
{
	public static void main(String[] args) {
	    int arr[] = {7,10,5,9};
	    int n = arr.length;
	    int thres = 6;
	   // int ans = 1;
	    
	    for(int i=1;i<9;i++){
	        int sum = 0;
	        for(int j=0 ; j<n ; j++){
	            sum += (arr[j] + i-1)/i;
	        }
	        if(sum<=thres){
	            System.out.println(i);
	            break;
	        }
	    }
	    
	   // System.out.println(ans);
	}
}