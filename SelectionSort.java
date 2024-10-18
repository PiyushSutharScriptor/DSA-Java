import java.util.Scanner;

class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=0 ; i<nums.length-1 ; i++){
            int minIdx = i;
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[j]<nums[minIdx]){
                    minIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }     
        return nums;
    }
}

public class SelectionSort{
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