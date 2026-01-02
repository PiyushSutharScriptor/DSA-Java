import java.util.*;

public class Apartments {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      int k = sc.nextInt();
      
      int[] application = new int[n];
      int[] apartment = new int[m];
      
      for(int i=0 ; i<n ; i++){
        application[i] = sc.nextInt();
      }
      
      for(int i=0 ; i<m ; i++){
        apartment[i] = sc.nextInt();
      }
      
      Arrays.sort(apartment);
      Arrays.sort(application);
      
      int i=0;
      int j=0;
      
      int res = 0;
      while(i<m && j<n){
        
        int low = application[j]-k;
        int high = application[j]+k;
        
        if(apartment[i]<low){
          i++;
        }
        else if(apartment[i]>high){
          j++;
        }
        else{
          i++;
          j++;
          res++;
        }
        
      }
      
      System.out.println(res);
      
  }
}