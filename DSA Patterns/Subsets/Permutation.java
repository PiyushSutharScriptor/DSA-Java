import java.util.*;

public class Permutation {
    public static void findPermutations(List<List<Integer>> res,
                                        List<Integer> li,
                                        int[] arr,
                                        boolean[] used) {

        if (li.size() == arr.length) {
            res.add(new ArrayList<>(li));
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (used[i]) continue;

            used[i] = true;
            li.add(arr[i]);

            findPermutations(res, li, arr, used);

            li.remove(li.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        findPermutations(res, new ArrayList<>(), nums, used);
        System.out.println(res); 
    }
}