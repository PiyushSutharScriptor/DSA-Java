public class CheckIfNumberIsPowerOf2Optimized {
    public static void main(String[] args) {
        int n = 16;

        boolean res = false;

        if((n&(n-1))==0) res = true;

        System.out.println(res);
    }
}
