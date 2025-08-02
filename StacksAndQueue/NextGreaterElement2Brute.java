
public class NextGreaterElement2Brute
{
	public static void main(String[] args) {
	    int arr[] = {2,10,12,1,11};
	    int n = arr.length;
	    
	    int arr2[] = new int[n];
	    
	    for(int i=0 ; i<n ; i++){
	        boolean find = false;
	        for(int j=i+1 ; j<n ; j++){
	            if(arr[j]>arr[i]){
	                arr2[i]=arr[j];
	                find = true;
	                break;
	            }
	        }
	        if(!find){
	            for(int k=0 ; k<i ; k++){
	                if(arr[k]>arr[i]){
	                    arr2[i]=arr[k];
	                    find = true;
	                    break;
	                }
	            }
	        }
	        if(!find){
	            arr2[i] = -1;
	        }
	    }
	    
	    for(int e : arr2){
	        System.out.println(e);
	    }
	}
}