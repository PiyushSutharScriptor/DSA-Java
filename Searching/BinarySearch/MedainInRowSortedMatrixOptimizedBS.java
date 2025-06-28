import java.util.*;
public class MedainInRowSortedMatrixOptimizedBS
{
    public static int countElements(int row[] , int target){
        int low = 0;
        int high = row.length-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(row[mid]<=target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        
        return low;
    }
    
    public static int searchMedian(int arr[][] , int m , int n){
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        
        for(int i=0 ; i<m ; i++){
            low = Math.min(low,arr[i][0]);
            high = Math.max(high,arr[i][n-1]);
        }
        
        int idx = (m*n+1)/2;
        
        while(low<high){
            int mid = (low+high)/2;
            
            int count = 0;
            
            for(int i=0 ; i<m ; i++){
                count+=countElements(arr[i] , mid);
            }
            
            if(count<idx){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        
        return low;
    }
    
	public static void main(String[] args) {
	    int arr[][] = {
	      {1,5,7,9,11},
	      {2,3,4,5,10},
	      {9,10,12,14,16}  
	    };
	    
	    int m = arr.length;
	    int n = arr[0].length;
	    
	    System.out.println(searchMedian(arr,m,n));
	}
}