public class MinPathSumRecursion {

    public static int findPath(int x, int y, int[][] arr){

        if(x<0 || y<0) return (int)1e8;

        if(x==0 && y==0) return arr[x][y];

        int up = arr[x][y] + findPath(x-1, y, arr);
        int left = arr[x][y] + findPath(x, y-1, arr);

        return Math.min(up,left);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};

        int m = arr.length;
        int n = arr[0].length;

        int res = findPath(m-1,n-1,arr);
        System.out.println(res);
    }    
}
