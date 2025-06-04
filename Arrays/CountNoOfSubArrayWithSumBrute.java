
public class CountNoOfSubArrayWithSumBrute
{
	public static void main(String[] args) {
	    int arr[] = {1,2,-2,5,3};
	    int n = arr.length;
	    
	    int k = 5;
	    int max = 0;
	    
	    for(int i=0 ; i<n ; i++){
	        int sum = 0;
	        for(int j=i ; j<n ; j++){
	            
	            sum += arr[j];
	            
	            if(sum == k){
	                max++;
	            }
	        }
	        
	    }
	    
	    System.out.println(max);
	}
}