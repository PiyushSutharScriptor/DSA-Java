import java.util.Scanner;

public class InputAndPrinting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
