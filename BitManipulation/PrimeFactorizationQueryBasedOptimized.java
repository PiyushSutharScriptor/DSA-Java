import java.util.*;

public class PrimeFactorizationQueryBasedOptimized {
    public static void isPrime(int n){
        
        List<Integer> li = new ArrayList<>();
        int[] arr = new int[n+1];

        for(int i=2 ; i<=n ; i++){
            arr[i] = i;
        }

        for(int i=2 ; i*i<n ; i++){
            if(arr[i]==i){
                for(int j=i*i ; j<=n ; j+=i){
                    if(arr[j]==j) arr[j] = i;
                }
            }
        }

        while(n>1){
            li.add(arr[n]);
            n = n/arr[n];
        }

        System.out.println(li);
    }
    public static void main(String[] args) {
        List <Integer> queries = new ArrayList<>();
        queries.add(3);
        queries.add(12);
        queries.add(16);
        queries.add(20);

        for(int i=0 ; i<queries.size() ; i++){
            isPrime(queries.get(i));
        }
    }
}
