public class FindTwoNumberAppearOnceOptimized {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 14, 3, 7, 7, 3 ,4};
        int n = arr.length;

        long xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
        }

        long newNum = xor & (xor - 1) ^ xor;

        int b1 = 0;
        int b2 = 0;

        for (int i = 0; i < n; i++) {
            if ((arr[i] & newNum) != 0) {
                b1^=arr[i];
            }
            else b2^=arr[i];
        }

        System.out.println(b1);
        System.out.println(b2);
    }
}
