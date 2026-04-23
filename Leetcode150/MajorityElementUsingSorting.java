import java.util.*;

class MajorityElementUsingSorting {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        int count = 1;
        int maxi = 1;
        int res = nums[0];
        int el = nums[0];

        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]==res){
                count++;
                if(count>maxi){
                    el = nums[i];
                    maxi = count;
                }
            }
            else{
                count = 1;
                res = nums[i];
            }
        }

        return el;
    }
}