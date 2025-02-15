import java.util.Scanner;
import java.util.ArrayList;
public class PrimeNumberUsingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        ArrayList <Integer> li = new ArrayList<>();

        for(int i=1 ; i*i<=n ; i++){
            if(n%i==0){
                li.add(i);
                if(n/i!=i){
                    li.add(i);
                }
            }
        }

        if(li.size()==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }

        sc.close();
    }
}
