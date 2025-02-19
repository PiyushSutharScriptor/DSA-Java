import java.util.Scanner;

public class CountFrequencyOfCharactersUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        System.out.print("Enter Character to count : ");
        char c = sc.next().charAt(0);

        int n= str.length();

        int count=0;
        for(int i=0 ; i<n ; i++){
            if(str.charAt(i)==c){
                count++;
            }
        }

        System.out.println("Count of " + c + " : " + count);

        sc.close();
    }
}
