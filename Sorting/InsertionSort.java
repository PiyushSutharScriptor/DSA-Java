import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input no. of elements
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        
        //input elements
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        //before sorting
        System.out.println("Unsorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        
        for(int i=1; i<n ; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;

                System.out.println("Swapping attempted");
            }
        }
        
        //After sorting
        System.out.println("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
