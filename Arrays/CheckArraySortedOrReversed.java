import java.util.Scanner;

public class CheckArraySortedOrReversed {

    public static boolean sum(int arr[] , int n){
        int count = 0;  //violation 
        for(int i=1 ; i<n ; i++){
            if(arr[i]<arr[i-1]){
                count++;
            }
        }

        if(arr[n-1] > arr[0]){
            count++;
        }

        return count<=1; //count>1 = false  ,  count=0/1 = true
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

        System.out.println(sum(arr, n));

        sc.close();
    }
}
