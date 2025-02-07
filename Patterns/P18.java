/*
p18 :

E
D E  
C D E
B C D E
A B C D E

(no space in between stars)
*/

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        
        for(int i=0 ; i<n ; i++){
            for(char ch = (char)('E'-i) ; ch<='E' ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

        sc.close();     
    }
}
