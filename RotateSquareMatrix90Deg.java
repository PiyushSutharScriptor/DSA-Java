import java.util.Scanner;
public class RotateSquareMatrix90Deg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number Of Rows : ");
        int i = input.nextInt(); //=>rows

        System.out.print("Enter Number Of Columns : ");
        int j = input.nextInt(); //=>columns

        int [][] a = new int[i][j];

        //Taking Array Elements Input : 
        for(i=0 ; i<a.length ; i++){
            for(j=0; j<a[0].length ; j++){
                System.out.print("Enter element at ["+i+","+j+"] : ");
                a[i][j] = input.nextInt();
            }
        }

        System.out.println();

        System.out.println("Input Array Elements : ");
        //Printing Input Elements : 
        for(i=0 ; i<a.length ; i++){
            for(j=0; j<a[0].length ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Step: 1 Transpose (Upper Triangle)
        for(i=0 ; i<a.length ; i++){
            for(j=a[0].length-1 ; j>i ; j--){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        System.out.println("After Transpose (Step:1) : ");

        //Printing Elements After Transpose :
        for(i=0 ; i<a.length ; i++){
            for(j=0; j<a[0].length ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Step: 2 Reverse (Row Elements)
        for(i=0 ; i<a.length ; i++){
            int start = 0 ;
            int end = a[0].length-1;
            while(start<end){
                int temp = a[i][start];
                a[i][start] = a[i][end];
                a[i][end] = temp;
                start++;
                end--;
            }
        }

        System.out.println("After Reversing Row Elements (Step:2) : ");
        
        for(i=0 ; i<a.length ; i++){
            for(j=0; j<a[0].length ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //end
    }
}
