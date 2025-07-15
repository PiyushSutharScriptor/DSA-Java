import java.util.*;
public class CombinationWithTargetPart2Optimized
{
    
    public static void generateSubset(int idx , List<List<Integer>> list, List<Integer>newAdd , int[] arr , int target){
        if(target==0){
            list.add(new ArrayList<>(newAdd));
            return;
        }
        
        if(target<0) return;
        
        for(int i=idx ; i<arr.length ; i++){
            
            if(i>idx && arr[i] == arr[i-1]) continue;
            newAdd.add(arr[i]);
            generateSubset(i+1,list,newAdd,arr,target-arr[i]);
            newAdd.remove(newAdd.size()-1);
        }
    }
    
	public static void main(String[] args) {
	    int arr[] = {10,1,2,7,6,1,5};
	    int target = 8;
	    Arrays.sort(arr);
	    List<List<Integer>> list = new ArrayList<>();
        generateSubset(0,list,new ArrayList<>(),arr,target);
        System.out.println(list);
	}
}