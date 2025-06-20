import java.util.*;
public class BookAllocationBrute
{
    public static int bookAllocation(int arr[] , int n, int low, int high , int k){
        int max = -1;
        boolean found = false;
        
        for(int i=low ; i<=high ; i++){
            int sum = 0;    
            int student = 1;
            for(int j=0 ; j<n ; j++){
                if(sum+arr[j]<=i){
                    sum += arr[j];
                }
                else{
                    student++;
                    sum = arr[j];
                }
            }
            if(student<=k){
                max = i;
                break;
            }
                
        }
        return max;
    } 
    
	public static void main(String[] args) {
	    int arr[] = {25,46,28,49,24};
	    int n = arr.length;
	    int k = 4;
	    
	    int low = Integer.MIN_VALUE;
	    int high = 0;
	    for(int num : arr){
	        high += num;
	        low = Math.max(low,num);
	    }
 	    
        int res = bookAllocation(arr,n,low,high,k);
        System.out.println(res);
	}
}