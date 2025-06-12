
public class ReversePairsBrute
{
	public static void main(String[] args) {
        int arr[] = {2,4,3,5,1};
        int n = arr.length;
        
        int count = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){
                if(arr[i]>2*arr[j]){
                    count++;
                }
            }
        }
        
        System.out.println("The count : " + count);
	}
}