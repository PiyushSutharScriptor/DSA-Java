import java.util.*;
public class MedainInRowSortedMatrixBrute
{
    public static int searchMedian(int arr[][] , int m , int n){
        int med = -1;
        int total = m*n;
        
        int newarr[] = new int[total];
        
        int idx = 0;
        
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                newarr[idx] =arr[i][j];
                idx++;
            }
        }
        
        Arrays.sort(newarr);
        
        med = newarr[(total)/2]; //even index = 0 to 14 
        
        return med;
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