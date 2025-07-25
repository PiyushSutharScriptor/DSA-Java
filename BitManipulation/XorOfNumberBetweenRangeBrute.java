public class XorOfNumberBetweenRangeBrute {
    public static void main(String[] args) {
        int start = 4;
        int end = 12;

        int xor = 1;
        for(int i=start ; i<=end ; i++){
            xor ^= i;
        }

        System.out.println(xor);
    }
}
