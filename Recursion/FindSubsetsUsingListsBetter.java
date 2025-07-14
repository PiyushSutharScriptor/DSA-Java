import java.util.*;
public class FindSubsetsUsingListsBetter
{
    public static void findSubset(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        generateSubset(0,list,new ArrayList<>(),arr);
        
        System.out.println(list);
    }
    
    public static void generateSubset(int start , List<List<Integer>> list, List<Integer>newAdd , int[] arr){
        list.add(new ArrayList<>(newAdd));
        
        for(int i=start ; i<arr.length ; i++){
            newAdd.add(arr[i]);
            generateSubset(i+1,list,newAdd,arr);
            newAdd.remove(newAdd.size()-1);
        }
    }
	public static void main(String[] args) {
	    int arr[] = {1,2};
	    findSubset(arr);
	}
}