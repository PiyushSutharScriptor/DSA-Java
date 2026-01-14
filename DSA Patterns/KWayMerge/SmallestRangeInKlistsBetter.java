import java.util.*;

public class SmallestRangeInKlistsBetter {

    static class Node {
        int val, row, col;
        Node(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {

        List<List<Integer>> li = new ArrayList<>();
        li.add(List.of(4,10,15,24,26));
        li.add(List.of(0,9,12,20));
        li.add(List.of(5,18,22,30));

        PriorityQueue<Node> pq =
            new PriorityQueue<>((a,b) -> a.val - b.val);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < li.size(); i++) {
            int val = li.get(i).get(0);
            pq.add(new Node(val, i, 0));
            max = Math.max(max, val);
        }

        int start = 0, end = Integer.MAX_VALUE;

        while (pq.size() == li.size()) {
            Node cur = pq.poll();
            int min = cur.val;

            if (max - min < end - start) {
                start = min;
                end = max;
            }

            if (cur.col + 1 < li.get(cur.row).size()) {
                int nextVal = li.get(cur.row).get(cur.col + 1);
                pq.add(new Node(nextVal, cur.row, cur.col + 1));
                max = Math.max(max, nextVal);
            } else {
                break;
            }
        }

        System.out.println(start + " " + end);
    }
}
