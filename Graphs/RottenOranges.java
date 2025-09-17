import java.util.*;

class Pair{
    int row;
    int col;
    int tm;

    Pair(int row1, int col1, int tm1){
        this.row = row1;
        this.col = col1;
        this.tm = tm1;
    }

}
public class RottenOranges {
    public static int findTime(int[][] oranges){
        int m = oranges.length;
        int n = oranges[0].length;

        int visited[][] = new int[m][n];
        Queue<Pair> que = new LinkedList<>();

        int count = 0;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(oranges[i][j]==2){
                    visited[i][j] = 2;
                    que.add(new Pair(i,j,0));
                }
                else{
                    visited[i][j] = 0;
                }
                if(oranges[i][j]==1) count++;
            }
        }

        int tmax = 0;
        int fresh = 0;
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};

        while(!que.isEmpty()){
            int r = que.peek().row;
            int c = que.peek().col;
            int t = que.peek().tm;

            tmax = Math.max(tmax,t);
            que.poll();

            for(int i=0 ; i<4 ; i++){
                int nrow = r+drow[i];
                int ncol = c+dcol[i];

                if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && visited[nrow][ncol]==0 && oranges[nrow][ncol]==1){
                    que.add(new Pair(nrow, ncol, t+1));
                    visited[nrow][ncol] = 2;
                    fresh++;
                }
            }


        }
        if(fresh!=count) return -1;
        return tmax;

    }

    public static void main(String[] args) {
        int oranges[][] = {{0,1,2,},{0,1,1},{2,1,1}};

        int res = findTime(oranges);
        System.out.println(res);
    }
}
