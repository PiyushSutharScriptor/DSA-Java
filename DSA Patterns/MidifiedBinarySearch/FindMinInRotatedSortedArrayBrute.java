import java.util.*;

public class FindMinInRotatedSortedArrayBrute {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};

        Arrays.sort(nums);

        System.out.println("result : " + nums[0]);
    }
}
