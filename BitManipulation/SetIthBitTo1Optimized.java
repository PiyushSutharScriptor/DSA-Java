public class SetIthBitTo1Optimized {
    public static void main(String[] args) {
        int n = 9;
        int i = 2;

        int newNum = 1<<i;
        
        System.out.println(newNum|n);
    }
}
                      