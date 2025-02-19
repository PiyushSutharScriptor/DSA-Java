import java.util.Scanner;

public class CountFrequencyOfCharacterUsingHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        System.out.print("Enter Character to count : ");
        char c = sc.next().charAt(0);

        int n= str.length();
        
        int [] hashArr = new int[256];

        for(int i=0 ; i<n ; i++){
            hashArr[str.charAt(i)]++;
        }

        System.out.println(hashArr[c]);
    }
}
