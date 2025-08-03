import java.util.*;

class Solution {
    public long subArrayRanges(int[] nums) {
        return sumOfMax(nums) - sumOfMin(nums);
    }

    private long sumOfMax(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        long sum = 0;

        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || nums[st.peek()] < (i == n ? Integer.MAX_VALUE : nums[i]))) {
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;

                long count = (long)(mid - left) * (right - mid);
                sum += count * nums[mid];
            }
            st.push(i);
        }
        return sum;
    }

    private long sumOfMin(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        long sum = 0;

        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || nums[st.peek()] > (i == n ? Integer.MIN_VALUE : nums[i]))) {
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;

                long count = (long)(mid - left) * (right - mid);
                sum += count * nums[mid];
            }
            st.push(i);
        }
        return sum;
    }
}
