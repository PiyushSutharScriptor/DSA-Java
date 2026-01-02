import java.util.*;

public class Combination{

    public static void findPermutation(int idx,int[] arr,List<List<Integer>> res, List<Integer>li, int t, int sum){

        //base case : 
        if(sum==t){
            res.add(new ArrayList<>(li));
            return;
        }
        
        if(sum>t){
            return;
        }

        for(int i=idx ; i<arr.length ; i++){
            li.add(arr[i]);
            sum+=arr[i];
            findPermutation(i,arr,res, li,t,sum);
            li.remove(li.size()-1);
            sum-=arr[i];
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;

        List<List<Integer>> res = new ArrayList<>();

        findPermutation(0,arr,res,new ArrayList<>(),target,0);

        for(List<Integer> el : res){
            System.out.println(el);
        }
    }
}