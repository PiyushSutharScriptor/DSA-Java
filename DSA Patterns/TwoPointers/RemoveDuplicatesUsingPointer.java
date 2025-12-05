public class RemoveDuplicatesUsingPointer {
    public static void main(String[] args) {
        int[] nums = {0,0,1};

        int j = 1;
        int n = nums.length;    

        for(int i=1 ; i<n ; i++){
            if(nums[i]!=nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
            
        }

        System.out.println(j);
        System.out.println();

        for(int el : nums){
            System.out.print(el + " ");
        }
    }    
}
