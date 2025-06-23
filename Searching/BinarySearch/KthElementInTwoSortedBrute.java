import java.util.*;
public class KthElementInTwoSortedBrute
{
	public static void main(String[] args) {
        int arr1[] = {1,3,4,7,10,12};
        int arr2[] = {2,3,6,15};
        int k = 4; //forth element 
        
        int m = arr1.length;
        int n = arr2.length;
        
        int total = m+n;
        
        int arr[] = new int[m+n];
        
        for(int i=0 ; i<m ; i++){
            arr[i] = arr1[i];
        }
        
        for(int i=0 ; i<n ; i++){
            arr[i+m] = arr2[i];
        }
        
        Arrays.sort(arr);
        
        System.out.println(arr[k-1]);
        
	}
}