
public class MajorityElementBruteForce
{
	public static void main(String[] args) {
		int arr[] = {2,4,33,1,5,2};
		int n = arr.length;
		
		for(int i=0 ; i<n ; i++){
		    
		    int count = 0;
		    for(int j=0 ; j<n ; j++){
		        if(arr[j]==arr[i]){
		            count++;
		        }
		    }
		    if(count>n/2){
		        System.out.println("The majority element : " + arr[i]);
		        break;
		    }
            else{
                System.out.println("No majority element found");
                break;
            }
		}
	}
}