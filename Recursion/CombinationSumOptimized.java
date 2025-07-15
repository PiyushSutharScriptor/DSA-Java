import java.util.*;
public class CombinationSumOptimized
{
    
    public static void generateSubset(int idx , List<List<Integer>> list, List<Integer>newAdd , int[] arr , int target){
        if(target==0){
            list.add(new ArrayList<>(newAdd));
            return;
        }
        
        if(target<0) return;
        
        for(int i=idx ; i<arr.length ; i++){
            newAdd.add(arr[i]);
            generateSubset(i,list,newAdd,arr,target-arr[i]);
            newAdd.remove(newAdd.size()-1);
        }
    }
    
	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5,6};
	    int target = 5;
	    List<List<Integer>> list = new ArrayList<>();
        generateSubset(0,list,new ArrayList<>(),arr,target);
        System.out.println(list);
	}
}