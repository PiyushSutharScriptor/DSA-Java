public class RemoveTheLastSetBitOptimizedRM {
    public static void main(String[] args) {
        //right most set bit
        int n = 14;

        //option : 1
        int res = n&(n-1);

        //option : 2
        /*
            int n1 = n-1;
            int res = n&(n-1);
        */

        System.out.println(res);
    }   
}
