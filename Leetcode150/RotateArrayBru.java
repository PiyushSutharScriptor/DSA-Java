public class RotateArrayBru {

    public static void print(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int k = 2;

        int len = nums.length;
        k = k%len;
        
        int[] newArr = new int[len];
        int idx = len-k;

        for(int i=idx ; i<len ; i++){
            newArr[i-idx] = nums[i];
        }
        print(newArr);

        for(int i=0 ; i<idx ; i++){
            newArr[k+i] = nums[i];
        }
        print(newArr);

        for(int i=0 ; i<len ; i++){
            nums[i] = newArr[i];
        }

        print(nums);
    }
}
