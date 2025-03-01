import java.util.Scanner;

public class SecondLargestOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            // this is for finding largest
            if (arr[i] > largest) { 
                sLargest = largest;
                largest = arr[i];
            }
            
            // this is for finding the second largest
            else if (arr[i] > sLargest && arr[i] != largest) {
                sLargest = arr[i];
            }

        }

        System.out.println("The largest element : " + largest);
        System.out.println("The second largest element : " + sLargest);

        sc.close();
    }
}
