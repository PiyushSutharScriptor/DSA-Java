import java.util.*;

public class LongestDivisibleSubsetRecursion {

    public static List<Integer> findMax(int curr, int prev, int n, int[] arr){
        if(curr>=n || prev>=n) return new ArrayList<>();
        
        List<Integer> notTake = findMax(curr+1, prev, n, arr);

        List<Integer> take = new ArrayList<>();
        if(prev==-1 || arr[curr]>arr[prev]){
            take = findMax(curr+1, curr, n, arr);
            take.add(arr[curr]);
        }

        return take.size()>notTake.size() ? take : notTake;
    }

    public static void main(String[] args) {
        int[] arr = {16, 8, 2, 4, 32};

        int n = arr.length;
        Arrays.sort(arr);
        List<Integer> res = findMax(0,-1,n,arr); 
        System.out.println(res);
    }
}
