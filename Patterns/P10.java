/*
p10 :
*
* * 
* * * 
* * * * 
* * * 
* * 
*  
(no space in between stars)
*/

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        
        for(int i=0 ; i<=2*n-1 ; i++){

            int stars = i;
            if(i>n) stars = 2*n-i;

            for(int j=0 ; j<stars ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
