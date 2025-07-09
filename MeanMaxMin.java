public class MeanMaxMin
{
	public static void main(String[] args) {
	    int arr[] = {1,2};
	    int count = 0;
	    int n = arr.length;
	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
	    
	    for(int k : arr){
	        if(min>k) min=k;
	        if(max<k) max=k;
	        
	        count += k;
	    };
	    
	    System.out.println("Mean : " + count/n);
	    System.out.println("Min : " + min);
	    System.out.println("Max : " + max);
	}
}