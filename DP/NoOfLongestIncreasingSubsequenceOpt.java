
import java.util.*;

public class NoOfLongestIncreasingSubsequenceOpt {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        int n = nums.length;

        int[] length = new int[n]; 
        int[] count = new int[n];  

        Arrays.fill(length, 1);
        Arrays.fill(count, 1);

        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (length[j] + 1 > length[i]) {
                        length[i] = length[j] + 1;
                        count[i] = count[j];
                    } else if (length[j] + 1 == length[i]) {
                        count[i] += count[j];
                    }
                }
            }
            maxLength = Math.max(maxLength, length[i]);
        }

        int totalCount = 0;
        for (int i = 0; i < n; i++) {
            if (length[i] == maxLength) {
                totalCount += count[i];
            }
        }

        System.out.println(totalCount);
    }
}