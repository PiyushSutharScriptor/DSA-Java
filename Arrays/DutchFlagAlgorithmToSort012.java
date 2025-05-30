public class DutchFlagAlgorithmToSort012 {
    
    public static void swap(int a , int b , int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args){
        
	   int arr[] = {1,1,0,0,2,2,1,2};
	   int n = arr.length;  
	   
	   int low=0, mid=0, high=n-1;
	   
	   while(mid<=high){
	       if(arr[mid]==0){
	           swap(low ,mid, arr);
	           low++;
	           mid++;
	       }
	       else if(arr[mid]==1){
	           mid++;
	       }
	       else{
	           swap(mid ,high, arr);
	           high--;
	       }
	   }
	   
	   for(int i=0 ; i<n ; i++){
	       System.out.print(arr[i] + " ");
	   }
	}
} 