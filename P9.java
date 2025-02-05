//trial phase

/*
p8 :
      *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * * 
      *  
(no space in between stars)
*/

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            //space
            for(int j=0 ; j<n-i-1 ; j++){
                System.out.print(" ");
            }

            //star
            for(int k=0 ; k<2*i+1 ; k++){
                System.out.print("*");
            }

            //space
            for(int l=0 ; l<n-i-1 ; l++){
                System.out.print(" ");
            }

            System.out.println();
        }

        for(int z=1;z<n;z++){
            //space
            for(int j=0 ; j<z ; j++){
                System.out.print(" ");
            }

            //star
            for(int k=0 ; k<(2*n-(2*z+1)) ; k++){
                System.out.print("*");
            }

            //space
            for(int l=0 ; l<z ; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
