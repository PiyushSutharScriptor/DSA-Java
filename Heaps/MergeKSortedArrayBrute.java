import java.util.*;

public class MergeKSortedArrayBrute {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int t = sc.nextInt();
      sc.nextLine();
      
      while(t!=0){
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        
        for(int i=0 ; i<n ; i++){
          int size = sc.nextInt();
          for(int j=0 ; j<size ; j++){
            int x = sc.nextInt();
            li.add(x);
          }
        }
        
        Collections.sort(li);
        
        System.out.println(li);
        
        t--; 
      }

      /*
        Take input like this 
          1
          2
          3 
          3 5 9 
          4 
          1 2 3 8 
       */
  }
}