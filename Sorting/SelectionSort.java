import java.util.Scanner;
public class SelectionSort {
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
        
        int min;
        for(int i=0 ; i<n ; i++){
            min = i;
            for(int j=i ; j<n ; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        
        //After sorting
        System.out.println("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
