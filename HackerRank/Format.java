import java.util.Scanner;

public class Format {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                int left = 15-s1.length();
                
                System.out.print(s1);
                for(int k=0 ; k<left ; k++){
                  System.out.print(" ");
                }
                
                if(x<100 && x>0){
                  System.out.print("0"+x);  
                }
                else if(x==0){
                  System.out.print("000");
                }
                else{
                  System.out.print(x);
                }
                
                System.out.println();
            }
            System.out.println("================================");

    }
}





