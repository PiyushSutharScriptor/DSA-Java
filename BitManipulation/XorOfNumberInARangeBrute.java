public class XorOfNumberInARangeBrute{
    public static void main(String[] args) {
        int n = 4;

        int xor = 0;
        for(int i=1; i<=n ; i++){
            xor ^= i;
        }

        System.out.println(xor);
    }
}