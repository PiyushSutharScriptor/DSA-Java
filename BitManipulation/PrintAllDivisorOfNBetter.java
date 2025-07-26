import java.util.*;
public class PrintAllDivisorOfNBetter {
    public static void main(String[] args) {
        int n = 60;

        List<Integer> li = new ArrayList<>();

        for(int i=1 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                li.add(i);
                if(n/i!=i){
                    li.add(n/i);
                }
            }
        }

        System.out.println(li);
    }
}
