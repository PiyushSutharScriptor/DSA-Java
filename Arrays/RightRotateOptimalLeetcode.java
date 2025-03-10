class RightRotateOptimalLeetcode {

    public static void reverse(int a , int b , int[] nums){
        for(int i=a,j=b ; i<j ; i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k%nums.length;  
        k=nums.length-k;
        int left = 0; 
        int right = nums.length-1;
        reverse(left,k-1,nums);
        reverse(k,right,nums);
        reverse(left, right, nums);
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}