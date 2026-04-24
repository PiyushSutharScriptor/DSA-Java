class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];

        int start = 0;
        int end = n;
        int k = 0;

        for(int i=0 ; i<n ; i++){
            ans[k++] = nums[start];
            ans[k++] = nums[end];
            start++;
            end++;
        }

        return ans;
    }
}