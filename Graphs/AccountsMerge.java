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

public class AccountsMerge {

    public static List<List<String>> merge(String[][] accounts, int n){

        DisjointSet d1 = new DisjointSet(n);

        Map<String,Integer> map = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            for(int j=1 ; j<accounts[i].length ; j++){
                if(!map.containsKey(accounts[i][j])){
                    map.put(accounts[i][j],i);
                }
                else{
                    d1.union(i, map.get(accounts[i][j]));
                }
            }
        }

        List<List<String>> mergeMap = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            mergeMap.add(new ArrayList<>());
        }

        for(Map.Entry<String,Integer> m : map.entrySet()){
            String st = m.getKey();
            int nd = m.getValue();
            mergeMap.get(nd).add(st);
        }

        List<List<String>> res = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            if(mergeMap.size()==0) continue;

            Collections.sort(mergeMap.get(i));
            List<String> temp = new ArrayList<>();

            temp.add(accounts[i][0]);
            for(String el : mergeMap.get(i)){
                temp.add(el);
            }

            res.add(temp);
        }

        System.out.println(map);
        System.out.println();
        System.out.println(mergeMap);
        System.out.println();
        System.out.println(res);

        return res;

    }

    public static void main(String[] args) {
        int n = 4;
        String[][] accounts ={
            {"John","j1@mail.com","j3@mail.com"},
            {"John","j1@mail.com","j2@mail.com"},
            {"Mary","m1@mail.com"},
            {"John","j4@mail.com"}
        };

        List<List<String>> res = merge(accounts, n);
        System.out.println(res);
    }
}
