import java.util.*;

public class PrintAllDivisorOfNBrute {
    public static void main(String[] args) {
        int n = 60;

        List<Integer> li = new ArrayList<>();

        for(int i=1 ; i<=n ; i++){
            if(n%i==0) li.add(i);
        }

        System.out.println(li);
    }
}