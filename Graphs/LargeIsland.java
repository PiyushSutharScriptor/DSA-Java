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

    public static int largestIsland(int[][] grid) {
        int n = grid.length;
        DisjointSet ds = new DisjointSet(n * n);

        int[][] dirs = {{-1,0},{0,1},{1,0},{0,-1}};

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 1) {
                    int node = row * n + col;
                    for (int[] d : dirs) {
                        int nr = row + d[0];
                        int nc = col + d[1];
                        if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 1) {
                            int adjNode = nr * n + nc;
                            ds.union(node, adjNode);
                        }
                    }
                }
            }
        }

        int max = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 0) {
                    HashSet<Integer> uniqueParents = new HashSet<>();
                    for (int[] d : dirs) {
                        int nr = row + d[0];
                        int nc = col + d[1];
                        if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 1) {
                            uniqueParents.add(ds.findParent(nr * n + nc));
                        }
                    }

                    int newSize = 1; 
                    for (int p : uniqueParents) {
                        newSize += ds.size.get(p);
                    }
                    max = Math.max(max, newSize);
                }
            }
        }

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
                   
        System.out.println(largestIsland(grid));
    }
}
