import java.util.Scanner;
public class SubArrayOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number Of Elements : ");
        int n = input.nextInt();

        int [] a = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            a[i] = input.nextInt();
        }

        for(int s=0 ; s<n ; s++){
            for(int e=s ; e<n ; e++){
                for(int k=s ; k<=e ; k++){
                    System.out.print(a[k]);
                }
                System.out.println();
            }
        }

        input.close();
    }
}
