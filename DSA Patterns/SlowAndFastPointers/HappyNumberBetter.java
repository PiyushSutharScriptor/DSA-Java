import java.util.*;

public class HappyNumberBetter {

    public static boolean hNumber(int n){

        Set<Integer> set = new HashSet<>();

        while(n!=1){

            int num = 0;
            while(n!=0){
                int digit = n%10;
                num+=digit*digit;
                n/=10;
            }

            n=num;
            if(set.contains(n)) return false;
            set.add(n);

        }

        return true;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(hNumber(n));
    }
}
