
public class MoveZeroToRightOptimized {
    public static void main(String[] args){
	   int arr[] = {1,2,0,0,3,5,0,1,0,0,0,1,52};
	   int n = arr.length;
	   
	   int j=0;
	   
	   for(int i=0 ; i<n ; i++){
	       if(arr[i]!=0){
	           arr[j] = arr[i];
	           j++;
	       }
	   }
	   
	   while (j<n){
	       arr[j] = 0;
	       j++;
	   }
	   
	   for(int i=0 ; i<n ; i++){
	       System.out.print(arr[i] + " ");
	   }
	   
	}
}   