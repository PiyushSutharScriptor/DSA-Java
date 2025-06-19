
public class MinimumDaysForMBouquetsBrute
{
    public static int bouquetFun(int arr[] , int m, int k, int n){
        for(int i=1 ; i<=10 ; i++){
		    int count = 0;
		    int pair = 0;

		    for(int j=0 ; j<n ; j++){
		        if(arr[j]<=i){
		            count++;
		        }
		        else{
		            count = 0;    
		        }
		        
		        if(count==k){
		            pair++;
		            count = 0;
		        }
		    }
		    if(pair>=m){
		        return i;
		    }
		    
		}
		return -1;
    }
    
	public static void main(String[] args) {
		int arr[] = {1,10,3,10,2,1};
		int n = arr.length;
		
		int m = 3; //bouquets
		int k = 2; //flowers
		
		int res = bouquetFun(arr,m,k,n);
		System.out.println(res);
		
	}
}