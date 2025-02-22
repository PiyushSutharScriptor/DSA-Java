import java.util.Scanner;
public class BubbleSort {
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
        
        boolean swap = false; //If there is no swap then no need of iterations

        for(int i=0 ; i<n-1 ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
                if(!swap){
                    break;
                }
            }
            System.out.println("Iteration Count");
        }
        
        //After sorting
        System.out.println("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
