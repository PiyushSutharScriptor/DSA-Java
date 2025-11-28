import java.util.*;

public class FindDuplicateBrute {
    
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        for(int i=1 ; i<n ; i++){
            if(nums[i]==nums[i-1]) return nums[i];
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};
        
        int res = findDuplicate(arr);
        System.out.println(res);
    }
}
