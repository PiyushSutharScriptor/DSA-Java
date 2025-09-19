import java.util.*;

class Pair{
    int row;
    int col;
    int step;

    Pair(int row1, int col1, int step1){
        this.row = row1;
        this.col = col1;
        this.step = step1;
    }
}

public class DistanceOfNearestHaving0{

    public static void findNear0(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;

        Queue<Pair> que = new LinkedList<>();
        boolean visited[][] = new boolean[m][n];

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(mat[i][j]==1){
                    que.add(new Pair(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }

        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};


        while(!que.isEmpty()){
            Pair p = que.poll();
            int row = p.row;
            int col = p.col;
            int step = p.step;

            mat[row][col] = step;

            for(int i=0 ; i<4 ; i++){
                int nrow = row+drow[i];
                int ncol = col+dcol[i];

                if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && !visited[nrow][ncol] && mat[nrow][ncol]!=1){
                    que.add(new Pair(nrow, ncol, step+1));
                    visited[nrow][ncol] = true;
                }

            }
        }
    }
    public static void main(String[] args) {
        int mat[][] = {{0,0,0},{0,1,0},{1,1,1}};

        findNear0(mat);

        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat[0].length ; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}