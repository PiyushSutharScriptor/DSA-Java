public class MinimumFallingPathSumRecursion {

    public static int findPath(int[][] arr, int row, int col){
        int n = arr.length;
        
        if(row<0 || col<0 || row>=n || col>=n) return (int)1e6;

        if(row==n-1) return arr[row][col];

        int down = arr[row][col] + findPath(arr, row+1, col);
        int ldiag = arr[row][col] + findPath(arr, row+1, col-1);
        int  rdiag = arr[row][col] + findPath(arr, row+1, col+1);

        return Math.min(down,Math.min(ldiag,rdiag));
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};

        int mini = Integer.MAX_VALUE;
        for(int i=0 ; i<arr[0].length ; i++){
            int res = findPath(arr,0,i);
            mini = Math.min(mini,res);
        }

        System.out.println(mini);
    }
}
