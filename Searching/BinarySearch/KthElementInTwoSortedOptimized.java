public class KthElementInTwoSortedOptimized
{
	public static void main(String[] args) {
	    int arr1[] = {1,3};
		int arr2[] = {2,3,6,15};
		int k=4;
		
		int m = arr1.length;
		int n = arr2.length;
		
		int i = 0;
		int j = 0;
		
		boolean found = false;
		int count = 0;
		int ans = -1;
		
		while(i<m && j<n){
		    if(arr1[i]<arr2[j]){
		        if(count == k-1){
		            ans = arr1[i];
		            found = true;
		            break;
		        } 
		        count++;
		        i++;
		    }
		    else{
		        if(count == k-1){
		            ans = arr2[j];  
		            found = true;
		            break;
		        } 
		        count++;
		        j++;
		    }
		}
		
		if(!found){
    		while(i<m){
    		    if(count == k-1){
    		        ans = arr1[i];
    		        found = true;
    		        break;
    		    } 
    	        count++;
    	        i++;
    		}
    		
    		while(j<n){
    		    if(count == k-1){
    		        ans = arr2[j];
    		        found = true;
    		        break;
    		    } 
    		    count++;
    	        j++;
    		}
		}
		
        System.out.println("Answer : " + ans);
	}
}