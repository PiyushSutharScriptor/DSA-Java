import java.util.*;

class DisjointSet{
    List<Integer> size = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();

    public DisjointSet(int n){
        for(int i=0 ; i<=n ; i++){
            size.add(1);
            parent.add(i);
        }
    }

    public int findParent(int node){
        if(node==parent.get(node)) return node;
        int fp = findParent(parent.get(node));
        parent.set(node,fp);

        return parent.get(node);
    }

    public void unionSize(int u, int v){
        int pu = findParent(u);
        int pv = findParent(v);

        if(pu==pv) return;

        if(size.get(pu)<size.get(pv)){
            parent.set(pu,pv);
            size.set(pv, size.get(pv)+size.get(pu));
        }
        else{
            parent.set(pv, pu);
            size.set(pu, size.get(pu)+size.get(pv));
        }
    }
}

public class DisjointSetUnionBySize {
    public static void main(String[] args) {
        
        DisjointSet d1 = new DisjointSet(7);
        d1.unionSize(1,2);
        d1.unionSize(2,3);
        d1.unionSize(4,5);
        d1.unionSize(6,7);

        if(d1.findParent(3)==d1.findParent(7)){
            System.out.println("Same parent");
        }
        else System.out.println("Not same");
        
        d1.unionSize(3, 7);

        if(d1.findParent(3)==d1.findParent(7)){
            System.out.println("Same parent");
        }
        else System.out.println("Not same");
    }
}
