import java.util.Scanner;

class Name{
    public void print(int n , int count){
        // Base case : 1
        /*if(count==n){
            return;
        }
        System.out.println("Name");
        count++;
        print(n ,count);
        */

        // Base case : 2
        if(count>n){
            return;
        }
        System.out.println("Name");
        print(n ,count+1);
        
    }
}
public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of times : ");
        int n = sc.nextInt();
        Name n1 = new Name();
        // n1.print(n, 0); //Base case : 1
        n1.print(n, 1); //Base case : 2

        
    }
}
