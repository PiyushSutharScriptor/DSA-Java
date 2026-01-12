import java.util.Scanner;

public class Main4{
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt();

        while (t!=0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            System.out.println(minT(n, k));
            t--;
        }
        
    }

    public static long minT(long pile, long k) {
        if (k > pile) return -1;
        if (pile == k) return 0;

        long left = pile / 2;
        long right = pile - left;

        if (k <= left) {
            long res = minT(left, k);
            return res == -1 ? -1 : res + 1;
        } else {
            long res = minT(right, k);
            return res == -1 ? -1 : res + 1;
        }
    }
}
