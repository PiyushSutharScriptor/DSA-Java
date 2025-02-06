/*
p12
 :
1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1

(no space in between stars)
*/

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){

            //number : 
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
            }

            //space : 
            for(int k=0 ; k<=(2*n-(2*i+2)) ; k++){
                System.out.print(" ");
            }

            //number : 
            for(int l=i ; l>0 ; l--){
                System.out.print(l);
            }

            System.out.println();
        }
        
    }
}
