import java.util.*;

public class PrintAllPrimeFactorsBrute {
    public static void main(String[] args) {
        int n = 60;
        List <Integer> li = new ArrayList<>();

        for(int i=1 ; i<=n ; i++){
            if(n%i==0){
                if(i==1) continue;
                else if(i==2){
                    li.add(i);
                }
                else{
                    boolean isPrime = true;
                    for(int j=2 ; j<=Math.sqrt(i) ; j++){
                        if(i%j==0){
                            isPrime = false;
                        }
                    }
                    if(isPrime) li.add(i);
                }
            }
        }

        System.out.println(li);

    }
}
