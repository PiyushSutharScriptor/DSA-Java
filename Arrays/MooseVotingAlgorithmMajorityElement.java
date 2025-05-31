
public class MooseVotingAlgorithmMajorityElement {
	public static void main(String[] args) {
		int arr[] = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
		int n = arr.length;
		
		int count = 0;
		int elem = arr[0];
		
		for(int i=0 ; i<n ; i++){
		    
		    if(arr[i]!=elem){
		        count--;
		    }
		    else{
		        count++;
		    }
		    
		    if(count==0){
		        elem = arr[i+1];
		    }
		}
		
		System.out.println(count + " , " + elem);
	}
}