import java.util.*;

class Pair {
    int u; 
    int v; 
    int wt; 

    Pair(int u, int v, int wt) {
        this.u = u;
        this.v = v;
        this.wt = wt;
    }
}

class DisjointSet {
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public DisjointSet(int n) {
        for (int i = 0; i < n; i++) {
            parent.add(i);
            size.add(1);
        }
    }

    public int findParent(int node) {
        if (node == parent.get(node)) return node;
        int fp = findParent(parent.get(node));
        parent.set(node, fp);
        return fp;
    }

    public void unionBySize(int u, int v) {
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
}

public class FindMstUsingKruskalAlgorithm {
    public static int findMstSum(int[][] edges, int v) {
        List<Pair> edgeList = new ArrayList<>();
        for (int[] e : edges) {
            edgeList.add(new Pair(e[0], e[1], e[2]));
        }

        Collections.sort(edgeList, (a, b) -> a.wt - b.wt);

        DisjointSet ds = new DisjointSet(v);

        int mstSum = 0;

        for (Pair edge : edgeList) {
            int pu = ds.findParent(edge.u);
            int pv = ds.findParent(edge.v);

            if (pu != pv) {
                mstSum += edge.wt;
                ds.unionBySize(pu, pv);
            }
        }

        return mstSum;
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1, 5}, {1, 2, 3}, {0, 2, 1}};
        int v = 3;

        int res = findMstSum(edges, v);
        System.out.println(res);
    }
}
