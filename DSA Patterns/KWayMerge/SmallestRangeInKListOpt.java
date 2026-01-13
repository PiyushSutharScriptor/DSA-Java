
import java.util.*;

class Solution {

    static class Pair {
        int val;
        int i;
        int j;

        Pair(int val, int i, int j) {
            this.val = val;
            this.i = i;
            this.j = j;
        }
    }

    public int[] SmallestRangeInKListOpt(List<List<Integer>> nums) {

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a, b) -> a.val - b.val);

        int max = Integer.MIN_VALUE;

        // add first el
        for (int i = 0; i < nums.size(); i++) {
            int v = nums.get(i).get(0);
            pq.add(new Pair(v, i, 0));
            max = Math.max(max, v);
        }

        int start = 0;
        int end = Integer.MAX_VALUE;

        while (true) {

            Pair p = pq.poll();
            int min = p.val;

            if (max - min < end - start) {
                start = min;
                end = max;
            }

            int ni = p.i;
            int nj = p.j + 1;

            if (nj == nums.get(ni).size()) {
                break;
            }

            int nextVal = nums.get(ni).get(nj);
            pq.add(new Pair(nextVal, ni, nj));
            max = Math.max(max, nextVal);
        }

        return new int[]{start, end};
    }
}
