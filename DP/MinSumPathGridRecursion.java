public class MinSumPathGridRecursion {

    public static int findMin(int[][] arr, int row , int col){

        if(row==0 && col==0){
            return arr[0][0];
        }

        if(row<0 || col<0) return (int)1e8;

        int up = arr[row][col] + findMin(arr, row-1, col);
        int left = arr[row][col] + findMin(arr, row, col-1);

        return Math.min(up,left);
    }

    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6}};

        int m = grid.length;
        int n = grid[0].length;

        int res = findMin(grid,m-1,n-1);
        System.out.println(res);
    }
}
