
public class AggressiveCowsMinMaxBruteForce
{
	public static void main(String[] args) {
        int arr[] = {0,3,4,7,9,10};
        int n = arr.length;
        
        int k = 4;
        int max = 0;
        for(int i=1 ; i<10 ; i++){
            int lastCow = arr[0];
            int cows = 1;
            
            for(int j=0 ; j<n ; j++){
                if(arr[j]-lastCow>= i){
                    cows++;
                    lastCow = arr[j];
                }                
            }
            
            if(cows >= k){
                max = i;
            }
        }
        System.out.println(max);
	}
}