import java.util.Scanner;

public class SecondSmallestOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;

        for(int i=0 ; i<n ; i++){
            if(arr[i]<smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]>smallest && arr[i]<sSmallest){
                sSmallest = arr[i];
            }
        }
        
        System.out.println(smallest);
        System.out.println(sSmallest);
    }
}   
