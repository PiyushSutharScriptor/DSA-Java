import java.util.*;

public class ConcertTicket {
  
    public static int upperBound(List<Integer>li, int x){

        int n = li.size();
        int l = 0;
        int r = n-1;
        int ans = n;

        while(l<=r){
            int mid = l+(r-l)/2;

            if(li.get(mid)>x){
                ans = mid;
                r = mid-1;
            }
            else l=mid+1;
        }

        return ans;
    }


    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt(); //ticket
      int m = sc.nextInt(); //customer
      
      int[] customer = new int[m];
      List<Integer> ticket = new ArrayList<>();
      
      for(int i=0 ; i<n ; i++){
        int x = sc.nextInt();
        ticket.add(x);
      }
      
      for(int i=0 ; i<m ; i++){
        customer[i] = sc.nextInt();
      }
      
      Collections.sort(ticket);
      
      for(int i=0 ; i<m ; i++){
        int up = upperBound(ticket,customer[i]);
        
        if(up>=1 && up<=n){
          int idx = up-1;
          int el = ticket.get(idx);
          System.out.println(el);
          ticket.remove(ticket.indexOf(el));
        }
        else{
          System.out.println(-1);
        }
      }
      
  }
}