import java.util.*;

public class SubsetsSumPart1Optimized
{
    public static void findSubsetSum(int idx,int arr[] , List<Integer> sum , int count){
        sum.add(count);
        
        for(int i=idx ; i<arr.length ; i++){
            findSubsetSum(i+1,arr,sum,count+arr[i]);
        }
    }
	public static void main(String[] args) {
	    int arr[] = {1,2,3};
	    List<Integer> sum = new ArrayList<>();
	    
	    int count = 0;
	    findSubsetSum(0,arr,sum,count);
	    
	    Collections.sort(sum);
	    System.out.println(sum);
	}
}