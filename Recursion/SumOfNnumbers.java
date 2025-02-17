import java.util.Scanner;

class Sum{
    public int count = 0;
    public int sumOfNumbers(int start , int end){
        if(start>end){
            return 0;
        }
        count+=start;
        sumOfNumbers(start+1, end);

        return count;
    }
    public void result(){
        System.out.print(count);
    }
}
public class SumOfNnumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting Number : ");
        int start = sc.nextInt();
        System.out.print("Enter Ending Number : ");
        int end = sc.nextInt();

        Sum s1 = new Sum();
        s1.sumOfNumbers(start, end);
        s1.result();

        sc.close();
    }
}