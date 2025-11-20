import java.util.*;

public class CodeChef3
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            
            int c1 = 0, c2 = 0, c3 = 0;
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                if(x == 1) c1++;
                else if(x == 2) c2++;
                else if(x == 3) c3++;
            }
            
            int deletions = Math.min(c1, c3) + (c2 / 2);
            System.out.println(deletions);
        }

        sc.close();
    }
}

