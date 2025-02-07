/*
p19 :

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

(no space in between stars)
*/

import java.util.Scanner;

public record P19() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();

        //Top symmetry
        for(int i=0 ; i<n ; i++){

            //star
            for(int j=n ; j>i ; j--){
                System.out.print("*");
            }

            //space
            for(int k=1 ; k<=2*i ; k++){
                System.out.print(" ");
            }

            //star
            for(int l=n ; l>i ; l--){
                System.out.print("*");
            }
            System.out.println();
        }

        //bottom symmetry
        for(int i=0 ; i<n ; i++){

            //star
            for(int j=0 ; j<=i ;j++){
                System.out.print("*");
            }

            //space
            for(int l=0 ; l<2*(n-i-1) ; l++){
                System.out.print(" ");
            }   

            //star
            for(int j=0 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        

        sc.close(); 
    }
}
