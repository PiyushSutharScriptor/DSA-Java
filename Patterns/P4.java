/*
p4 :
 1
 2 2
 3 3 3
 4 4 4 4
  
*/

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
