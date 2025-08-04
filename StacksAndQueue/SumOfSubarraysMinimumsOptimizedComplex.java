import java.util.*;
//must understand the logic of nse, nge, pse, and pge

class SumOfSubarraysMinimumsOptimizedComplex {
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = (int)1e9 + 7;

        int[] prev = new int[n];
        int[] next = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        // Find previous less element (strictly less)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            prev[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Find next less element (less or equal)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            next[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Calculate result
        long result = 0;
        for (int i = 0; i < n; i++) {
            long left = i - prev[i];
            long right = next[i] - i;
            result = (result + (arr[i] * left * right) % mod) % mod;
        }

        return (int) result;
    }
    
    public static void main(String[] args){
        int arr[] = {3,1,2,4,4,4,4,4,4,4,4,44,4,4,4,4,4444444,444444,44444};
        System.out.println(sumSubarrayMins(arr));
    }
}
