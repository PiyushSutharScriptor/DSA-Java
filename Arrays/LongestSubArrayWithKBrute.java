
public class LongestSubArrayWithKBrute {
    public static void main(String[] args){
        
	   int arr[] = {1,3,4,0,0,2,1,1,0,2,3};
	   int n = arr.length;
	   
	   int k = 3;
	   int maxLength = 0;
	   
	   for(int i=0; i<n ; i++){
	       int sum = 0;
	       for(int j=i ; j<n ; j++){
	           sum+=arr[j];
	           
	           if(sum==k){
	               int length = j-i+1;
	               if(length>maxLength){
	                   maxLength = length;
	               }
	           }
	       }
	   }
	   
	   System.out.println("The longest subarray of sum " + k + " : " + maxLength);
	  
	}
}