import java.util.Scanner;

public class SecondLargestWithoutSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for(int i=0 ; i<n ; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        int sLargest = -1;
        for(int i=1 ; i<n ; i++){
            if( arr[i]>sLargest && arr[i]!=largest){
                sLargest = arr[i];
            }
        }

        System.out.println("The largest element : " + largest);
        System.out.println("The second largest element : " + sLargest);

        sc.close();
    }
}
