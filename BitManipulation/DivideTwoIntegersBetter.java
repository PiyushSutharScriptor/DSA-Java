
public class DivideTwoIntegersBetter {
    public static int divideN(int dividend, int divisor) {
        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Determine sign
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int result = 0;

        while (n >= d) {
            int count = 0;
            while (n >= (d << (count + 1))) {
                count++;
            }
            result += 1 << count;
            n -= d << count;
        }

        return negative ? -result : result;
    }

    public static void main(String[] args) {
        int dividend = 22;
        int divisor = 3;
        System.out.println(divideN(dividend, divisor)); // Output: 7
    }
}
