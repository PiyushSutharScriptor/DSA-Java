public class LinearSearch {
    public static void main(String[] args){
	   int arr[] = {1,2,3,58,5,0,87};
	   int n = arr.length;
	   int num = 87;
	   
	   boolean found = false;
	   
	   for(int i=0 ; i<n ; i++){
	       if(arr[i]==num){
	           System.out.println("Element found at index : " + i);
	           found = true;
	           break;
	       }
	   }
	   
	   if(!found){
	       System.out.println("Element not found");
	   }
	}
}