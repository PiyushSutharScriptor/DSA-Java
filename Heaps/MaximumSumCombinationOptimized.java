import java.util.*;

public class MaximumSumCombinationOptimized {

    static class Pair {
        int sum, i, j;
        Pair(int sum, int i, int j) {
            this.sum = sum;
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 4, 2, 3};
        int arr2[] = {2, 5, 1, 6};
        int k = 4;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n = arr1.length;

        // Max heap (store by sum)
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.sum - a.sum);

        // Visited set to avoid duplicate pairs
        Set<String> visited = new HashSet<>();

        // Start with largest sum = arr1[n-1] + arr2[n-1]
        maxHeap.add(new Pair(arr1[n-1] + arr2[n-1], n-1, n-1));
        visited.add((n-1) + "," + (n-1));

        List<Integer> result = new ArrayList<>();

        while (k-- > 0 && !maxHeap.isEmpty()) {
            Pair cur = maxHeap.poll();
            result.add(cur.sum);

            int i = cur.i;
            int j = cur.j;

            // Next pair: (i-1, j)
            if (i-1 >= 0 && !visited.contains((i-1) + "," + j)) {
                maxHeap.add(new Pair(arr1[i-1] + arr2[j], i-1, j));
                visited.add((i-1) + "," + j);
            }

            // Next pair: (i, j-1)
            if (j-1 >= 0 && !visited.contains(i + "," + (j-1))) {
                maxHeap.add(new Pair(arr1[i] + arr2[j-1], i, j-1));
                visited.add(i + "," + (j-1));
            }
        }

        System.out.println(result);
    }
}
