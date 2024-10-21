import java.util.Scanner;
public class InsertionSort {
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

        for(int i=1 ; i<arr.length ; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println();

        System.out.println("Sorted Array Elements : ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
