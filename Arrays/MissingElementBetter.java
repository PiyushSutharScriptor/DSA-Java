public class MissingElement {
    public static void main(String[] args){
	   int arr[] = {1,2,3,4};
	   int n = arr.length;
	   
	   int num = 5;


	   //Method 1 : 
	   int j=1;
	   for(int i=0; i<n ; i++){
	       if(j!=arr[i]){
	           System.out.println("The missing number : " + j);
	           break;
	       }
	       j++;
	   }
	   
	   if(j<=num){
	           System.out.println("The missing number : " + j);
	   }


       //Method 2 :
       int sum = num*((num+1)/2);
       int sum2 = 0;

       for(int i=0 ; i<n ; i++){
        sum2+=arr[i];
       }

       int ans = sum-sum2;

       System.out.println(ans);
    
	}
}