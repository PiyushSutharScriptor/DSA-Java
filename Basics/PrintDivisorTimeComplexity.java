import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class PrintDivisorTimeComplexity {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        ArrayList <Integer> res = new ArrayList<>();

        for(int i=1 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                res.add(i);
                if(n/i!=i){
                    res.add(n/i);
                }
            }
        }
        
        //before sorting
        System.out.println("Before sorting : ");
        System.out.println(res);
        
        //after sorting
        System.out.println("After sorting : ");
        Collections.sort(res);
        System.out.println(res);
    
    }    
}
