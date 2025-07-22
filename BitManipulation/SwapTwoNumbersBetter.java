public class SwapTwoNumbersBetter {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before : " + "a : " + a + " b : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After : " + "a : " + a + " b : " + b);
    }
}
