public class CountUniquePathsInGridRecursion {

    public static int findPaths(int m, int n){
        if(m==0 && n==0) return 1;
        if(m<0 || n<0) return 0;

        int left = findPaths(m, n-1);
        int up = findPaths(m-1, n);

        return left+up;
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 4; 

        int res = findPaths(m-1,n-1);
        System.out.println(res);
    }
}
