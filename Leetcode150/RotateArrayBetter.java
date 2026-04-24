public class RotateArrayBetter {

    public static void reverse(int left, int right,int[] arr){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 2;

        int len = nums.length;
        k%=len;

        reverse(0, len-1, nums);
        print(nums);
        reverse(0, k-1, nums);
        print(nums);
        reverse(k, len-1, nums);
        print(nums);
    }
}
