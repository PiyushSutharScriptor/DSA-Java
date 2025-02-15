import java.util.Scanner;
public class PrimeNumberUsingCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int counter = 0;
        for(int i=1 ; i*i<=n ; i++){
            if(n%i==0){
                counter++;
                if(n/i!=i){
                    counter++;
                }
            }
        }
        
        //instead of if else I used ternery operator to look more professional
        String res = counter==2 ? "Prime Number" : "Not a Prime Number";
        System.out.println(res);
    }
}