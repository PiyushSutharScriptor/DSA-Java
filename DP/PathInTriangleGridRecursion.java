public class PathInTriangleGridRecursion {

    public static int findPaths(int row, int col, int[][] arr){
        int m = arr.length;
        int n = arr[row].length;
        if(row==m-1) return 1;
        if(row>m-1 || col>n-1) return 0;

        int down = findPaths(row+1, col, arr);
        int diag = findPaths(row+1, col+1, arr);

        return down+diag;
    }

    public static void main(String[] args) {
        int[][] arr = {{1},{2,3},{3,6,7},{8,9,6,10}};

        int res = findPaths(0,0,arr);
        System.out.println(res);
    }
}
