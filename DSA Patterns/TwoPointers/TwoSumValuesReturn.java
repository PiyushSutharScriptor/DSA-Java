import java.util.*;

public class TwoSumValuesReturn{

    public static int[] findVal(int[] nums, int target){
        Arrays.sort(nums);

        int n = nums.length;

        int l = 0;
        int r = n-1;

        while(l<r){
            int sum = nums[l]+nums[r];

            if(sum==target){
                return new int[]{nums[l],nums[r]};
            }
            else if(sum<target) l++;
            else r--;
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;

        int[] res = findVal(nums,target);
        
        for(int el : res){
            System.out.print(el + " ");
        }
    }
}
