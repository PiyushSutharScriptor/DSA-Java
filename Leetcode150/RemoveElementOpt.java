class RemoveElementOpt {
    public int removeElement(int[] nums, int val) {
        int n = 0;

        for(int el : nums){
            if(el!=val){
                nums[n] = el;
                n++;
            }
        }

        return n;
    }
}