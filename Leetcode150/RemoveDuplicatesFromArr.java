public class RemoveDuplicatesFromArr {
    public static void main(String[] args) {

        int nums[] = {1,1,2};

        int n = nums.length;
        int num = nums[0];
        int k = 1;

        for(int i=1 ; i<n ; i++){
            if(nums[i]!=num){
                num = nums[i];
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println(k);

    }
}
