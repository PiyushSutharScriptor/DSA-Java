import java.util.*;
public class SumOfEvenNumbers
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number n : ");
	    int n = sc.nextInt();
	    
	    int sum = 0;
	    
	    for(int i=1 ; i<=n ; i++){
	        if(i%2==0){
	            sum += i;
	        }
	    }
	    
	    System.out.println("Sum : " + sum);

        sc.close();
	}
}