import java.util.Scanner;

public class Format {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1 = sc.next();
                int x = sc.nextInt();
                
                String s2;
                if(x==0){
                    s2 = "000";
                }
                else if(x<100){
                    s2 = "0"+x;
                }
                else s2 = ""+x;
                
                int len = 15-s1.length();
                
                System.out.printf(s1);
                if(len>0){
                  for(int a=0 ; a<len ; a++){
                    System.out.printf(" ");
                  }
                }
                System.out.printf(s2);
                
                System.out.println();
            }
            System.out.println("================================");

    }
}



