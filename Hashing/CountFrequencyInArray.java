import java.util.Scanner;

public class CountFrequencyInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to find its frequency: ");
        int num = sc.nextInt();

        int[] hash = new int[1001]; // Assuming numbers are in arr[] between 0-1000

        // Condition
        for (int i = 0; i < n; i++) {
            if (arr[i] < hash.length) {
                hash[arr[i]]++;
            }
        }

        //printing
        if (num < hash.length) {
            System.out.println("Frequency of " + num + " is: " + hash[num]);
        } else {
            System.out.println("Number out of range.");
        }

        sc.close();
    }
}
