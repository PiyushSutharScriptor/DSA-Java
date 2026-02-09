public class UniquePaths2Recursion {

    public static int findPaths(int x, int y, int[][] arr){
        if(x<0 || y<0 || arr[x][y]==1) return 0;

        if(x==0 && y==0) return 1;

        int up = findPaths(x-1, y, arr);
        int left = findPaths(x, y-1, arr);

        return up+left;

    }

    public static void main(String[] args) {
        int[][] arr = {{0,1},{0,0}};

        int m = arr.length;
        int n = arr[0].length;

        int res = findPaths(m-1, n-1, arr);
        System.out.println(res);
    }
}
