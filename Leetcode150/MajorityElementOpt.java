public class MajorityElementOpt {
    public static void main(String[] args) {

        int[] nums = {1,4,2,4,2,3,4,5,4,1,4,1};

        int count = 0;
        int el = 0;

        for(int i=0 ; i<nums.length ; i++){
            if(count==0){
                el = nums[i];
            }

            if(el == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }

        System.out.println(el);
    }
}
