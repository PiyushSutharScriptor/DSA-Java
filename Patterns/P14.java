/*
p14 :
A
A B
A B C
A B C D 
A B C D E

(no space in between stars)
*/

import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        
        for(int i=0 ; i<n ; i++){
            for(char ch='A' ; ch<='A'+i ; ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }
        
    }
}
