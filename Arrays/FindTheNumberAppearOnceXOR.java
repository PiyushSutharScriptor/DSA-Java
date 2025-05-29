public class FindTheNumberAppearOnceXOR{
    public static void main(String args[]){
       int arr[] = {1,1,2,3,3,4,4,5,5};
	   int n = arr.length;
	   
	   int result = 0;
	   
	   for(int i=0 ; i<n ; i++){
	       result ^= arr[i];
	   }
	   
	   System.out.println("The number is : " + result);
    }
}