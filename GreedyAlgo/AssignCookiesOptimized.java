import java.util.*;
public class AssignCookiesOptimized{
    public static void main(String[] args) {
        int greed[] = {1,2,3};
        int cookies[] = {1,1};

        Arrays.sort(greed);
        Arrays.sort(cookies);

        int i = 0;
        int j = 0;
        
        int count = 0;
        while(i<cookies.length && j<greed.length){
            if(cookies[i]>=greed[j]){
                j++;
                count++;
            }
            i++;
        }

        System.out.println(count);
 
    }
}
