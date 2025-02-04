/*
p5 :
 1 2 3 4
 1 2 3 
 1 2 
 1
  
*/

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        
        for(int i=n; i>0 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }  
}  

