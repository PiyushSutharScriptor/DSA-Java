import java.util.*;

public class FindDuplicates2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prev = map.get(nums[i]);
                if (i - prev <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3 };
        System.out.println(containsNearbyDuplicate(arr, 2));
    }
}
