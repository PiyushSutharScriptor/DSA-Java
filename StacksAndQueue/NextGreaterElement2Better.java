
public class NextGreaterElement2Better
{
	public static void main(String[] args) {
	    int arr[] = {2,10,12,1,11};
	    int n = arr.length;
	    
	    int arr2[] = new int[n];
	    
	    for(int i=0 ; i<n ; i++){
	        boolean find = false;
	        for(int j=i+1 ; j<=i+n-1 ; j++){
	            int idx = j%n;
	            
	            if(arr[idx]>arr[i]){
	                arr2[i] = arr[idx];
	                find = true;
	                break;
	            }
	        }
	        
	        if(!find) arr2[i]=-1;
	    }
	    
	    for(int e : arr2){
	        System.out.println(e);
	    }
	}
}