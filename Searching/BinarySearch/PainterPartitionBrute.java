import java.util.*;
public class PainterPartitionBrute
{
    public static int painterAns(int arr[], int n, int k, int low, int high){
        int ans = -1;
        for(int i=low ; i<=high ; i++){
            int sum = 0;
            int painter = 1;
            
            for(int j=0 ; j<n ; j++){
                if(sum+arr[j] <= i){
                    sum += arr[j];
                }
                else{
                    painter++;
                    sum = arr[j];
                }
            }
            if(painter<=k){
                ans = i;
                break;
            }
        }
        return ans;
    }
    
	public static void main(String[] args) {
	    int arr[] = {10,20,30,40};
	    int n = arr.length;
	    
	    int k = 2;
	    
	    int low = Integer.MIN_VALUE;
	    int high = 0;
	    for(int num : arr){
	        high += num;
	        low = Math.max(low,num);
	    }
	    
	    int res = painterAns(arr,n,k,low,high);
	    
	    System.out.println(res);
	}
}