public class MaximumFallingPathSumRecursion {

    public static int findPath(int[][] arr, int row, int col){
        int m = arr.length;
        int n = arr[0].length;

        if(row<0 || col<0 || row>=m || col>=n) return Integer.MIN_VALUE;
        if(row==m-1) return arr[row][col];


        int down = arr[row][col] + findPath(arr, row+1, col);
        int ldiag = arr[row][col] + findPath(arr, row+1, col-1);
        int  rdiag = arr[row][col] + findPath(arr, row+1, col+1);

        return Math.max(down,Math.max(ldiag,rdiag));
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};

        int maxi = 0;
        for(int i=0 ; i<arr[0].length ; i++){
            int res = findPath(arr,0,i);
            maxi = Math.max(maxi,res);
        }

        System.out.println(maxi);
    }
}
