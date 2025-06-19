
public class KthMissingPosNumberBrute
{
	public static void main(String[] args) {
	    int arr[] = {2,3,4,7,11};
	    int n = arr.length;
	    
	    int high = arr[n-1];
	    int count = 0;
	    int k = 6;
	    int ans = -1;
	    
	    for(int i=1 ; i<=high ; i++){
	        boolean found = false;
	        
	        for(int j=0 ; j<n ; j++){
	            if(arr[j]==i){
	                found = true;
	            }
	        }
	        
	        if(!found){
	            System.out.println(i);
	            count++;
	            ans = i;
	        }
	        
	        if(count==k){
	            System.out.println("Answer : " + ans);
	            break;
	        }
	        
	    }

	}
}