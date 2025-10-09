import java.util.*;

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
            size.set(pv,size.get(pv)+size.get(pu));
        }
        else{
            parent.set(pv,pu);
            size.set(pu, size.get(pu)+size.get(pv));
        }
    }
}


public class MaximumStoneRemoval{

    public static int findMax(int[][] stones , int n){

        int mrow = 0;
        int mcol = 0;

        for(int i=0 ; i<n ; i++){
            mrow = Math.max(mrow, stones[i][0]);
            mcol = Math.max(mcol, stones[i][1]);
        }

        DisjointSet d1 = new DisjointSet(mrow+mcol+1);

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<n ;i++){
            int nodeRow = stones[i][0];
            int nodeCol = stones[i][1] + mrow + 1;

            d1.union(nodeRow,nodeCol);
            map.put(nodeRow,1);
            map.put(nodeCol, 1);
        }

        int cnt = 0;

        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            if(d1.findParent(mp.getKey())==mp.getKey()){
                cnt++;
            }
        }
        return n-cnt;
    }

    public static void main(String[] args) {
        int stones[][] = {{0, 0},{0,1},{1,0},{1,2},{2,1},{2,2}};
        int n = 6;

        int res = findMax(stones,n);
        System.out.println(res);
    }
}