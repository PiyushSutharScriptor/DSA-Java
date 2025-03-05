import java.util.Scanner;

public class LeftRotateArray {

    public static void rotoateArray(int arr[] , int n){
        int temp=arr[0];

        for(int i=1 ; i<n ; i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;

        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        rotoateArray(arr , n);

        sc.close();
    }
}
