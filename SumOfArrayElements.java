import java.util.Scanner;
public class SumOfArrayElements{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Of Elements : ");
        int n = input.nextInt();

        int sum =0;

        int []a = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element no." + i+1 + " : ");
            a[i] = input.nextInt();
        }

        for(int i=0 ; i<n ; i++){
            sum+=a[i];
        }

        System.out.println("Sum Of Array Elements : " + sum);

        input.close();
        
    }
}