import java.util.*;

public class Subsets {

    public static void findSubsets(List<List<Integer>> res,List<Integer>li, int[] arr,int idx){
        int n = arr.length;

        if(idx==n){
            res.add(new ArrayList<>(li));
            return;
        }

        li.add(arr[idx]);
        findSubsets(res,li, arr, idx+1);
        li.remove(li.size()-1);
        findSubsets(res, li, arr, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        
        List<List<Integer>> res = new ArrayList<>();

        findSubsets(res,new ArrayList<>(),arr,0);
        System.out.println(res);
    }
}
