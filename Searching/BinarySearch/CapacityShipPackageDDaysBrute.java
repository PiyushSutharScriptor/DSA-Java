
public class CapacityShipPackageDDaysBrute
{
    public static int leastCapacity(int arr[] , int n, int maxDays){
        int ans = 5;
        int high = 0;
        for(int num : arr){
            high += num;
        }
        
        for(int i=0; i<=high ; i++){
            int load = 0;
            int days = 1;
            boolean valid = true;
            
            for(int j=0 ; j<n ; j++){
                if(arr[j]>i){
                    valid = false;
                    break;
                }
                if(arr[j]+load > i){
                    days++;
                    load = 0;
                }
                load+=arr[j];
            }
            
            if(valid && days<=maxDays){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5,6,7,8,9,10};
	    int n = arr.length;
	    
	    int maxDays = 5;
	    
	    int res = leastCapacity(arr,n,maxDays);
	    System.out.println(res);

	}
}