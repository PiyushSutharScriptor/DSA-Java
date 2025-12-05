import java.util.*;

public class TwoSumIndexReturn {

    public static int[] findIdx(int[] nums, int target){
        int n = nums.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<n ; i++){

            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem) , i};
            }
            map.put(nums[i],i);
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;

        int[] res = findIdx(nums,target);

        for(int el : res){
            System.out.print(el + " ");
        }
    }    
}
