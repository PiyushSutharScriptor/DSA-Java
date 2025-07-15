import java.util.*;
public class CombinationSumOptimized
{
    
    public static void generateSubset(int start , List<List<Integer>> list, List<Integer>newAdd , int[] arr , int target){
        if(start==arr.length){
            if(target==0){
                list.add(new ArrayList<>(newAdd));
            }
            return;
        }
        
        if(arr[start]<=target){
            newAdd.add(arr[start]);
            generateSubset(start,list,newAdd,arr,target-arr[start]);
            newAdd.remove(newAdd.size()-1);
        }
        generateSubset(start+1,list,newAdd,arr,target);
        
    }
    
	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5,6};
	    int target = 5;
	    List<List<Integer>> list = new ArrayList<>();
        generateSubset(0,list,new ArrayList<>(),arr,target);
        System.out.println(list);
	}
}