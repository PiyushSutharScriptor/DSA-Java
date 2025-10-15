import java.util.*;

class DisjointSet {
    ArrayList<Integer> parent = new ArrayList<>();
    ArrayList<Integer> size = new ArrayList<>();

    public DisjointSet(int n) {
        for (int i = 0; i < n; i++) {
            parent.add(i);
            size.add(1);
        }
    }

    public int findParent(int node) {
        if (node == parent.get(node)) return node;
        int pq = findParent(parent.get(node));
        parent.set(node, pq);
        return pq;
    }

    public void union(int u, int v) {
        int pu = findParent(u);
        int pv = findParent(v);
        if (pu == pv) return;

        if (size.get(pu) < size.get(pv)) {
            parent.set(pu, pv);
            size.set(pv, size.get(pv) + size.get(pu));
        } else {
            parent.set(pv, pu);
            size.set(pu, size.get(pu) + size.get(pv));
        }
    }

    public int getSize(int node) {
        int p = findParent(node);
        return size.get(p);
    }
}

public class LargeIsland {

    // Common directions for 4-connected neighbors
    static int[][] dirs = {{-1,0}, {0,-1}, {1,0}, {0,1}};

    public static boolean isValid(int r, int c, int n) {
        return r >= 0 && c >= 0 && r < n && c < n;
    }

    public static int largestIsland(int[][] grid) {
        int n = grid.length;
        DisjointSet ds = new DisjointSet(n * n);

        // Step 1: Connect all 1s
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 0) continue;

                for (int[] d : dirs) {
                    int r = row + d[0];
                    int c = col + d[1];
                    if (isValid(r, c, n) && grid[r][c] == 1) {
                        int nodeNo = row * n + col;
                        int adjNodeNo = r * n + c;
                        ds.union(nodeNo, adjNodeNo);
                    }
                }
            }
        }

        int max = 0;

        // Step 2: Try flipping each 0 to 1 and compute potential largest island
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 0) {
                    HashSet<Integer> uniqueParents = new HashSet<>();
                    for (int[] d : dirs) {
                        int nr = row + d[0];
                        int nc = col + d[1];
                        if (isValid(nr, nc, n) && grid[nr][nc] == 1) {
                            uniqueParents.add(ds.findParent(nr * n + nc));
                        }
                    }

                    int newSize = 1; // flipped 0
                    for (int p : uniqueParents) {
                        newSize += ds.size.get(p);
                    }
                    max = Math.max(max, newSize);
                }
            }
        }

        // Step 3: If all are 1s, handle that edge case
        for (int i = 0; i < n * n; i++) {
            max = Math.max(max, ds.size.get(ds.findParent(i)));
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 0},
            {0, 1}
        };
        System.out.println(largestIsland(grid)); // Expected output: 3
    }
}
