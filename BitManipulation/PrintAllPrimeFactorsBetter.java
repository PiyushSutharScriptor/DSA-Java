import java.util.*;

public class PrintAllPrimeFactorsBetter{
    public static boolean isPrime(int n){
        if(n<2) return false;
        
        else if(n==2) return true;
        
        else{
            for(int i=2 ; i<=Math.sqrt(n) ; i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int n = 60;
        List <Integer> li = new ArrayList<>();

        for(int i=1 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                if(isPrime(i)){
                    li.add(i);
                }
                if(n/i!=i){
                    if(isPrime(n/i)){
                        li.add(i);
                    }
                }
            }
        }

        System.out.println(li);

    }
}
