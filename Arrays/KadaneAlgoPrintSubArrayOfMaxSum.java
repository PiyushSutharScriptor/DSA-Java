
public class KadaneAlgoPrintSubArrayOfMaxSum{
	public static void main(String[] args) {
	    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
	    int n = arr.length;
	    
	    int max = Integer.MIN_VALUE;
	    int sum = 0;
	    int start = 0;
	    int tstart = 0;
	    int end = 0;
	    
	    
	    for(int i=0 ; i<n ; i++){
	        if(sum==0) start = i;
	        
	        sum += arr[i];
	        
	        if(sum>max){
	            max=sum;
	            start = tstart;
	            end = i;
	        }
	        
	        if(sum<0){
	            sum=0;
	            tstart = i+1;
	        }
	    }
	    
	    for(int i=start ; i<=end ; i++){
	        System.out.print(arr[i] + " ");
	    }
	    
	    System.out.println();
	    
	    System.out.print("The maximum subarray sum : " + max);
	    
	    
	}
}