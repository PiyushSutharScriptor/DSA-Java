import java.util.*;

public class CodeChef2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        
        while(tc-- > 0){
            int n = sc.nextInt();
            
            int bestSpeed = -1;
            int bestCar = -1;
            
            for(int i = 1; i <= n; i++){
                int d = sc.nextInt();
                int t = sc.nextInt();
                
                int speed = d / t;
                
                if(speed > bestSpeed){
                    bestSpeed = speed;
                    bestCar = i;
                }
            }
            
            System.out.println(bestCar);
        }

        sc.close();
    }
}

