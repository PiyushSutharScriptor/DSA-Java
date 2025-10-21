public class ClimbingStairs {
    public static int findWays(int n){
        if(n==0 || n==1) return 1;

        int left = findWays(n-1);
        int right = findWays(n-2);

        return left+right;
    }
    public static void main(String[] args) {
        int n = 4;
        int res = findWays(n);
        System.out.println(res);
    }
}
