public class FirstAndLastOccurrences
{
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,8,8,11,13};
		
		int n = arr.length;
		int target = 8;
		
		int first = -1;
		int second = -1;
		
		for(int i=0 ; i<n ; i++){
		    if(arr[i]==target){
		        if(first>-1){
		            second = i;
		        }
		        else{   
		            first = i;
		            second = i;
		        }
		    }
		}
		
        System.out.println("first occurrences : " + first);
        System.out.println("last occurrences : " + second);

	}
}