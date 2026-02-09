public class UniquePathsRecursion {

    public static int findWays(int x, int y){

        if(x<0 || y<0) return 0;
        if(x==0 && y==0) return 1;

        int up = findWays(x-1, y);
        int left = findWays(x, y-1);

        return up+left;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;

        int res = findWays(m-1,n-1);
        System.out.println(res);
    }
}
