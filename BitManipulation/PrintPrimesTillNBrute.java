import java.util.*;

public class PrintPrimesTillNBrute {
    public static void main(String[] args) {
        int n = 15;

        List<Integer> li = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if(i == 2)
                li.add(i);
            else {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime)
                    li.add(i);
            }
        }
        System.out.println(li);
    }

}
