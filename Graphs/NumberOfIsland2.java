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

class FindIsland{
    int m;
    int n;
    int c = 0;
    int count = 0;
    boolean[][] visited;
    int[][] arr;
    DisjointSet d1;

    FindIsland(int m1, int n1){
        this.m = m1;
        this.n = n1;
        arr = new int[m][n];
        visited = new boolean[m][n];
        d1 = new DisjointSet(m*n);

        //marking number to recognize parent
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                arr[i][j] = c;
                c++;
            }
        }
    }

    public int findNo(int row, int col){

        if(visited[row][col]) return count;

        visited[row][col] = true;
        count++;

        //moving in 4 positions : UDLR
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};

        for(int i=0 ; i<4 ; i++){
            int r = row + drow[i];
            int c = col + dcol[i];

            // conditions : 
            if(r>=0 && r<m && c>=0 && c<n && visited[r][c]){
                int current = arr[row][col];
                int check = arr[r][c];
                if(d1.findParent(current)!=d1.findParent(check)){
                    count--;
                    d1.union(current, check);
                }
            }

        }

        return count;
    }
}
public class NumberOfIsland2 {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;

        int[][] oper = {{1,1},{0,1},{3,3},{3,4}};

        FindIsland i1 = new FindIsland(m, n);

        for(int[] arr : oper){
            int res = i1.findNo(arr[0],arr[1]);
            System.out.println(res);
        }
    }
}
