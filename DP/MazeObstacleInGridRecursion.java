public class MazeObstacleInGridRecursion {

    public static int findPaths(int[][] arr, int row, int col){
        if(row==0 && col==0) return 1;
        if(row<0 || col<0 || arr[row][col]==1) return 0;

        int up = findPaths(arr, row-1, col);
        int left = findPaths(arr, row, col-1);

        return up+left; 
    }
    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{0,1,0},{0,0,0}};

        int m = arr.length;
        int n = arr[0].length;

        int res = findPaths(arr,m-1,n-1);
        System.out.println(res);
    }
}
