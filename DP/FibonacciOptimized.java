public class FibonacciOptimized {
    public static void main(String[] args) {
        int n = 5;

        int first = 0;
        int second = 1;

        int third = 0;

        for(int i=2 ; i<=n ; i++){
            third = first+second;
            first = second;
            second = third;
        }

        System.out.println(third);
    }
}
