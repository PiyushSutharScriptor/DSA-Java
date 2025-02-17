import java.util.Scanner;

class Number{
    public void print(int n , int count){
        if(count>n){
            return;
        }
        System.out.println(count);
        print(n,count+1);

    }
}
public class PrintNumber1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value : ");
        int n = sc.nextInt();

        Number n1 = new Number();
        n1.print(n, 1);
    }
}
