
import java.util.Scanner;

class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=0 ; i<nums.length-1 ; i++){
            for(int j=0 ; j<nums.length-i-1 ; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }   
        return nums;
    }
}

public class BubblesSort{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Size Of Array : ");
        int size = input.nextInt();

        int [] nums = new int[size];

        for(int i=0 ; i<size ; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            nums[i] = input.nextInt();
        }

        System.out.print("Before Selection Sort : ");

        System.out.println();
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        }

        Solution s1 = new Solution();
        s1.sortArray(nums);

        System.out.println();
        
        System.out.println("After Selection Sort : ");

        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
        

    }
}