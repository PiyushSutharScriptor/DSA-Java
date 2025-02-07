/*
p16 :
A
B B
C C C
D D D D 
E E E E E

(no space in between stars)
*/

import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        
        for(int i=0 ; i<n ; i++){
            char ch = 'A';
            ch+=i;
            for(int j=0 ; j<=i ; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
