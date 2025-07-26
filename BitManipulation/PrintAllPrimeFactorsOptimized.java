import java.util.*;

public class PrintAllPrimeFactorsOptimized {
    public static void main(String[] args) {
        int n = 60;

        List<Integer> li = new ArrayList<>();

        for(int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                li.add(i);

                while(n%i==0){
                    n/=i;
                }
            }
        }

        if(n!=1) li.add(n);

        System.out.println(li);
    }
}
