import java.util.Scanner;

public class LeftRotateOptimal {
    public static void leftrotatebyd(int arr[] , int d , int n){
        d = d%n;
        int left = 0;
        int right = n-1;
        reverse(left,d-1,arr);
        reverse(d, right,arr);
        reverse(left, right,arr);
        
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void reverse(int a , int b , int arr[]){
        for(int i=a,j=b ;i<j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
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

        leftrotatebyd(arr, d , n);

        sc.close();
    }
}
