/*
p8 :
* * * * * * *
  * * * * *
    * * * 
      *  
(no space in between stars)
*/

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        
        //Logic
        for(int i=0 ; i<n ; i++){

            //space
            for(int j=0 ; j<i ; j++){
                System.out.print(" ");
            }

            //star
            for(int k=0 ; k<(2*n-(2*i+1)) ; k++){
                System.out.print("*");
            }

            //space
            for(int l=0 ; l<i ; l++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
