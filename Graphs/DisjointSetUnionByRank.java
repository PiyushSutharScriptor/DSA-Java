import java.util.*;

class DisjointSet{
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();

    public DisjointSet(int n){
        for(int i=0 ; i<=n ; i++){
            rank.add(0);
            parent.add(i);
        }
    }

    public int findParent(int node){
        if(node==parent.get(node)) return node;

        int fp = findParent(parent.get(node));
        parent.set(node, fp);

        return parent.get(node);
    }

    public void union(int u, int v){
        int pu = findParent(u);
        int pv = findParent(v);

        if(pu==pv) return;

        if(rank.get(pu)>rank.get(pv)){
            parent.set(pv,pu);
        }
        else if(rank.get(pv)>rank.get(pu)){
            parent.set(pu,pv);
        }
        else{
            parent.set(pv, pu);
            int ru = rank.get(pu);
            rank.set(pu,ru+1);
        }
    }   
}

public class DisjointSetUnionByRank {   
    public static void main(String[] args) {
        
        DisjointSet d1 = new DisjointSet(7);
        
        d1.union(1,2);
        d1.union(2,3);
        d1.union(4,5);
        d1.union(6,7);
        d1.union(5,6);

        if(d1.findParent(3)==d1.findParent(7)){
            System.out.println("Same parent");
        }
        else{
            System.out.println("Not same");
        }
        
        d1.union(3, 7);
        
        if(d1.findParent(3)==d1.findParent(7)){
            System.out.println("Same parent");
        }
        else{
            System.out.println("Not same");
        }
    }
}
