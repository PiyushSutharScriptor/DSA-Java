/*
p19 :


*        *  
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *  

(no space in between stars)
*/

import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        
        int spaces = 2*n - 2;
        for(int i=1 ; i<=2*n-1 ; i++){   

            int stars = i;
            if(i>n) stars = 2*n-i;
            //star
            for(int j=1 ; j<=stars ; j++){
                System.out.print("*");
            }
            
            //spaces
            for(int k=1 ; k<=spaces ; k++){
                System.out.print(" ");
            }

            //star
            for(int l=1 ; l<=stars ; l++){
                System.out.print("*");
            }

            System.out.println();
            if(i<n) spaces-=2;
            else spaces+=2;

        }
        
    }
}
