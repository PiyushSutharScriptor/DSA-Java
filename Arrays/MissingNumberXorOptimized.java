public class MissingNumberXorOptimized {
    public static void main(String[] args){
	   int arr[] = {1,2,4,5};
	   int n = arr.length;
	   int num = 5;
	   
	   int xor = 0;
	   int xor2 = 0;
	   for(int i=0 ; i<n ; i++){
	       xor = xor ^ arr[i];
	       xor2 = xor2 ^ i+1;
	   }
	   
	   System.out.print(xor ^ xor2 ^ num);
	  
	}
}