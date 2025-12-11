public class FirstMissingPositive {

    public static int findNum(int[] nums){

        int n = nums.length;
        int i=0;

        while(i<n){
            int correct = nums[i]-1;

            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else i++;
        }

        for(int el=0 ; el<n ; el++){
            if(nums[el]!=el+1) return el+1;
        }

        return n+1;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,0};

        int res = findNum(arr);
        System.out.println(res);
    }
}
