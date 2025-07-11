public class PerfectSquare {
    public static void main(String[] args) {
        int n = 4;
        boolean isPerfect = false;

        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                System.out.println("Perfect square");
                isPerfect = true;
                break;
            }
        }

        if (!isPerfect) {
            System.out.println("Not a Perfect square");
        }
    }
}
