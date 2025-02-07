/*
p16 :
      A
    A B A 
  A B C B A
A B C D C B A

(no space in between stars)
*/

import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        
        for(int i=0 ; i<n ; i++){

            //space
            for(int j=0 ; j<n-i-1 ; j++){
                System.out.print(" ");
            }
            
            //character 
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int k=0 ; k<2*i+1 ; k++){
                System.out.print(ch);
                // ch++;
                if(k<breakpoint) ch++;
                else ch--;
            }

            //space
            for(int l=0 ; l<n-i-1 ; l++){
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
