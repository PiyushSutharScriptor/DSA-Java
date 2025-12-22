import java.util.*;

public class SlidingWindowMedian {

    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        int n = arr.length;
        double[] res = new double[n - k + 1];
        int idx = 0;

        for (int t = 0; t<=n-k; t++) {

            for (int i = t; i < t+k; i++) {
                // add
                if (max.peek() == null || arr[i] <= max.peek()) {
                    max.add(arr[i]);
                } else {
                    min.add(arr[i]);
                }

                // balance
                if (max.size() > min.size() + 1) {
                    min.add(max.poll());
                } else if (min.size() > max.size()) {
                    max.add(min.poll());
                }
            }

            if (max.size() == min.size()) {
                res[idx] = ((max.peek() + min.peek()) / 2);
            } else {
                res[idx] = max.peek();
            }

            idx++;
            min.clear();
            max.clear();

        }

        for(double el : res){
            System.out.println(el);
        }

    }
}
