import java.util.*;

public class FindDuplicates1 {
    public static boolean containsNearbyDuplicate(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();

        for(int el : nums){
            if(set.contains(el)) return true;
            set.add(el);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};
        int[] arr2 = { 1, 2, 3 ,2, 2};
        System.out.println(containsNearbyDuplicate(arr));
        System.out.println(containsNearbyDuplicate(arr2));
    }
}
