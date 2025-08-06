import java.util.*;

public class LargestRectangleOptimized {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                int idx = st.pop();
                int wid = st.isEmpty() ? i : i - st.peek() - 1;
                maxi = Math.max(arr[idx] * wid, maxi);
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            int idx = st.pop();
            int wid = st.isEmpty() ? n : n - st.peek() - 1;
            maxi = Math.max(arr[idx] * wid, maxi);
        }

        System.out.println(maxi); 
    }
}
