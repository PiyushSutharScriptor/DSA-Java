import java.util.Arrays;
import java.util.Scanner;

public class ArraySortBuiltIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number Of Elements : ");
        int n = input.nextInt();

        int [] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = input.nextInt();
        }

        System.out.println();

        System.out.println("Input Array Elements : ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        System.out.println();

        System.out.println("Input Array Elements : ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        input.close();

    }
}
