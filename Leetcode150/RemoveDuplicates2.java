class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int res = 0;
        int n = nums.length;
        int num = nums[0];

        for(int i=1 ; i<n ; i++){
            if((nums[i]==num) && res<1){
                res++;
                nums[k] = nums[i];
                num = nums[i];
                k++;
            }
            else if(nums[i]!=num){
                res = 0;
                nums[k] = nums[i];
                num = nums[i];
                k++;
            }
        }

        return k;
    }
}