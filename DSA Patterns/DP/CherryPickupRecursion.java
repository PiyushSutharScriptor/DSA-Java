public class CherryPickupRecursion {

    public static int neg = (int)-1e9;

    public static int findPath(int x1, int y1,int x2, int y2, int[][] arr){

        if(x1<0 || y1<0 || x2<0 || y2<0) return neg;
        if(arr[x1][y1]==-1 || arr[x2][y2]==-1) return neg;
        if(x1==0 && y1==0 && x2==0 && y2==0) return arr[0][0];


        int first = findPath(x1-1, y1, x2-1, y2, arr);
        int second = findPath(x1, y1-1, x2, y2-1, arr);
        int third = findPath(x1-1, y1, x2, y2-1, arr);
        int forth = findPath(x1, y1-1, x2-1, y2, arr);


        int best = Math.max(Math.max(first,second),Math.max(third,forth));

        if(best==neg) return neg;

        if(x1==x2 && y1==y2){
            return best+arr[x1][y1];
        }

        return best+arr[x1][y1]+arr[x2][y2];
    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,-1},{1,0,-1},{1,1,1}};

        int m = arr.length;
        int n = arr[0].length;

        int res = findPath(m-1, n-1,m-1, n-1, arr);
        System.err.println(res);
    }
}
