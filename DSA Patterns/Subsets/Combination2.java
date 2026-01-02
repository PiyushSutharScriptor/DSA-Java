import java.util.*;

public class Combination2{

    public static void findPermutation(int idx,int[] arr,List<List<Integer>> res, List<Integer>li, int t, int sum){

        //base case : 
        if(sum==t){
            res.add(new ArrayList<>(li));
            return;
        }
        
        if(sum>t || li.size()==arr.length){
            return;
        }

        for(int i=idx ; i<arr.length ; i++){

            if(i>idx && arr[i]==arr[i-1])continue;

            li.add(arr[i]);
            sum+=arr[i];
            findPermutation(i+1,arr,res, li,t,sum);
            li.remove(li.size()-1);
            sum-=arr[i];
        }

    }
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;

        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();

        findPermutation(0,arr,res,new ArrayList<>(),target,0);

        for(List<Integer> el : res){
            System.out.println(el);
        }
    }
}