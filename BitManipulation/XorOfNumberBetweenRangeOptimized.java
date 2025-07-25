public class XorOfNumberBetweenRangeOptimized {
    public static int findXor(int start, int end){
        int xor = 0;
        for(int i=start ; i<=end ; i++){
            xor ^= i;
        }

        return xor;
    }
    public static void main(String[] args) {
        int start = 4;
        int end = 10;

        int a = findXor(1,start-1);
        int b = findXor(1, end);

        System.out.println(a^b);
    }
}
