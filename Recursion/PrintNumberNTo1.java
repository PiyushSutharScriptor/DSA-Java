import java.util.Scanner;

class Number{
    public void print(int n, int count){
        //Base Case 1
        /*if(n<count){
            return;
        }
        System.out.println(n);
        print(n-1,count);
        */

        //Base Case 2
        if(count<1){
            return;
        }
        System.out.println(count);
        print(n,count-1);
        


    }
}
public class PrintNumberNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value : ");
        int n = sc.nextInt();

        Number n1 = new Number();
        // n1.print(n, 1); //Base Case 1
        n1.print(n, n); //Base Case 2


    }
}
