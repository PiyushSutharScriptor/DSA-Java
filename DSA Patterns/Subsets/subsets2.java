import java.util.*;

public class subsets2 {

    public static void findSubsets(List<List<Integer>> res, List<Integer> li, int[] arr, int idx){
        int n = arr.length;

        res.add(new ArrayList<>(li));
        for(int i=idx ; i<n ; i++){
            if(i>idx && arr[i]==arr[i-1]) continue;

            li.add(arr[i]);
            findSubsets(res, li, arr, i+1);
            li.remove(li.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();

        findSubsets(res,new ArrayList<>(),arr,0);
        System.out.println(res);
    }       
}
