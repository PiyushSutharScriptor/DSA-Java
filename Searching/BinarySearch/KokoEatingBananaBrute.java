
public class KokoEatingBananaBrute
{
	public static void main(String[] args) {
		int arr[] = {3,6,7,11};
		int n = arr.length;
		 
		int banana = 1;
		int maxtime = 8;
		
        //11 is the max element of the array
		for(int i=1 ; i<11 ; i++){
		    
		    int time = 0;
    		for(int j=0 ; j<n ; j++){
    		    time += arr[j]/i;
    		}
    		
    		banana++;
    		
    		if(time == maxtime){
    		    break;
    		}
		}
		
		System.out.println(banana);
	}
}