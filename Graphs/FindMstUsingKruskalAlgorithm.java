import java.util.*;

class Pair{
    int wt;
    int u;
    int v;

    Pair(int wt1, int u1, int v1){
        this.wt = wt1;
        this.u = u1;
        this.v = v1;
    }
}

class DisjointSet{
    ArrayList<Integer> parent = new ArrayList<>();
    ArrayList<Integer> size = new ArrayList<>();

    public DisjointSet(int n){
        for(int i=0 ; i<n ; i++){
            parent.add(i);
            size.add(1);
        }
    }

    public int findParent(int node){
        if(node == parent.get(node)) return node;
        int pq = findParent(parent.get(node));
        parent.set(node, pq);

        return pq;
    }

    public void union(int u, int v){
        int pu = findParent(u);
        int pv = findParent(v);

        if(pu==pv) return;

        if(size.get(pu)<size.get(pv)){
            parent.set(pu, pv);
            size.set(pu,size.get(pv)+size.get(pu));
        }
        else{
            parent.set(pv,pu);
            size.set(pu, size.get(pu)+size.get(pv));
        }
    }
}

public class FindMstUsingKruskalAlgorithm {
    public static int findSum(int[][] edges, int v){
        List<Pair> li = new ArrayList<>();

        for(int[] edge : edges){
            li.add(new Pair(edge[2], edge[0], edge[1]));
        }

        Collections.sort(li,(a,b)->a.wt-b.wt);

        DisjointSet d1 = new DisjointSet(v);

        int sum = 0;
        for(Pair pr : li){
            int u1 = d1.findParent(pr.u);
            int v1 = d1.findParent(pr.v);

            if(u1!=v1){
                sum+=pr.wt;
                d1.union(u1, v1);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] edges = {{0, 1, 5}, {1, 2, 3}, {0, 2, 1}};
        int v = 3;

        int res = findSum(edges, v);
        System.out.println(res);
    }
}
