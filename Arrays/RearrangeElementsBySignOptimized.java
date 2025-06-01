
public class RearrangeElementsBySignOptimized{
	public static void main(String[] args) {
	    int arr[] = {3,1,-2,-5,2,-4};
	    int n = arr.length;
	    
	    int res[] = new int[n];
	    
	    int poscount = 0;
	    int negcount = 1;
	    
	    for(int i=0 ; i<n ; i++){
	        if(arr[i]<0){
	            res[negcount] = arr[i];
	            negcount+=2;
	        }
	        else{
	            res[poscount] = arr[i];
	            poscount+=2;
	        }
	    }
	    
	    for(int num : res){
	        System.out.println(num);
	    }
	}
}