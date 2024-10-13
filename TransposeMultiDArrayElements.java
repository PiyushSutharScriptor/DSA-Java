import java.util.Scanner;
public class TransposeMultiDArrayElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number Of Rows : ");
        int i = input.nextInt(); //=> Rows

        System.out.print("Enter Number Of Columns : ");
        int j = input.nextInt(); //=> Columns

        int [][] a = new int[i][j];
        for(i=0 ; i<a.length ; i++){
            for(j=0 ; j<a[0].length ; j++){
                System.out.print("Enter element of [" + i + ","+ j + "] : ");
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Before Transpose : ");
        for(i=0 ; i<a.length ; i++){
            for(j=0 ; j<a[0].length ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("After Transpose : ");

        //Method:1 (Bottom Triangle)
        for(i=0 ; i<a.length ; i++){
            for(j=0 ; j<i ; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // //Method:2 (Upper Triangle)
        // for(i=0 ; i<a.length ; i++){
        //     for(j=a[0].length-1 ; j>i ; j--){
        //         int temp = a[i][j];
        //         a[i][j] = a[j][i];
        //         a[j][i] = temp;
        //     }
        // }

        for(i=0 ; i<a.length ; i++){
            for(j=0 ; j<a[0].length ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
