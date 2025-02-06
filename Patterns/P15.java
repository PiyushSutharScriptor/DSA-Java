/*
p15 :
A B C D E
A B C D 
A B C
A B
A

(no space in between stars)
*/

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        
        for(int i=n ; i>=0 ; i--){
            for(char ch='A' ; ch<='A' + i ; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        
    }
}
