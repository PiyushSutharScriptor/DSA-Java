import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        //exceptional case when the size of array is 0 : 
        if(arr.length==0){
            throw new IllegalArgumentException("Array is empty");
        }

        //logic 
        int temp = arr[0];
        for(int i=0 ; i<n ; i++){ //i can start with 1 or 0
            if(arr[i]<temp){
                temp = arr[i];
            }
        }

        System.out.println("The smallest element : " + temp);

        
    }
}
