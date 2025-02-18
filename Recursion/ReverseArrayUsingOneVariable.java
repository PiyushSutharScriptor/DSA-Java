import java.util.Scanner;

public class ReverseArrayUsingOneVariable {
    public static void reverseResult(int left,int n,int arr[]){
        if(left>=n/2){
            return;
        }

        int temp = arr[left];
        arr[left] = arr[n-left-1];
        arr[n-left-1] = temp;

        reverseResult(left+1, n, arr);

    }

    public static void print(int arr[]){
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        //before reverse
        System.out.println("Original Array : ");
        print(arr);
        
        reverseResult(0,n,arr);
        
        System.out.println();
        //after reverse
        System.out.println("Reversed Array");
        print(arr);

        sc.close(); 
    }
}
