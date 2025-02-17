import java.util.Scanner;

class Number{
    public void print(int n , int count){
        if(count<1){
            return;
        }
        print(n,count-1);
        System.out.println(count);
    }
}

public class Print1TonUsingBacktrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value : ");
        int n = sc.nextInt();

        Number n1 = new Number();
        n1.print(n, n);

    }
}
