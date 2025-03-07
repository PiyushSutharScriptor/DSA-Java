import java.util.Scanner;

public class LeftRotateByDplaces {
    public static void leftRotateD(int[]arr , int n , int d){
        d = d%n;
        int temp[] = new int[d];
        for(int i=0 ; i<d ; i++){
            temp[i] = arr[i];
        }

        for(int i=d ; i<n ; i++){
            arr[i-d] = arr[i];
        }

        for(int i=0 ; i<d ; i++){
            arr[n-d+i] = temp[i];
        }

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

        System.out.print("Enter Number of D places : ");
        int d = sc.nextInt();

        System.out.println("Left Rotated Array : ");
        leftRotateD(arr, n, d);
    }
}
