import java.util.*;

public class Permutation{

    public static void findPermutation(int[] arr, boolean[] visited,List<List<Integer>> res, List<Integer>li){

        //base case : 
        if(li.size()==arr.length){
            res.add(new ArrayList<>(li));
            return;
        }

        for(int i=0 ; i<arr.length ; i++){
            if(visited[i]) continue;

            li.add(arr[i]);
            visited[i] = true;

            findPermutation(arr, visited, res, li);
            li.remove(li.size()-1);
            visited[i] = false;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[n];

        findPermutation(arr,visited,res,new ArrayList<>());

        for(List<Integer> el : res){
            System.out.println(el);
        }
    }
}