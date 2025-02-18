import java.util.Scanner;
public class ReverseArrayInRecursion{

    public static void reverseResult(int left, int right , int arr[]){
        if(left>=right){
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseResult(left+1, right-1, arr);
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
        
        reverseResult(0, n-1, arr);
        
        System.out.println();
        //after reverse
        System.out.println("Reversed Array");
        print(arr);

        sc.close(); 
    }
}