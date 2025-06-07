import java.util.Scanner;
public class ReverseElementsOfArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number Of Elements : ");
        int n = input.nextInt();

        int [] a = new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            a[i] = input.nextInt();
        }

        int start = 0;
        int end = n-1;
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed Array : ");

        for(int i=0 ; i<n ; i++){
            System.out.print(a[i] + " ");
        }

        input.close();

        //end
    }
}